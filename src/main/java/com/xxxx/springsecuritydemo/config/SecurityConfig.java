package com.xxxx.springsecuritydemo.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.xxxx.springsecuritydemo.enums.Rcode;
import com.xxxx.springsecuritydemo.handler.AppsAuthenticationSuccessHandler;
import com.xxxx.springsecuritydemo.handler.MyAccessDeniedHandler;
import com.xxxx.springsecuritydemo.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.hierarchicalroles.RoleHierarchy;
import org.springframework.security.access.hierarchicalroles.RoleHierarchyImpl;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import javax.sql.DataSource;
import java.io.PrintWriter;

/**
 * @author: SecurityConfig
 * @date: 2020/10/9
 * @description:
 */

@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true)
@Configuration
//public class SecurityConfig {
//    @Configuration
//    @Order(1)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    //        @Bean
//    PasswordEncoder passwordEncoder() {
//        return NoOpPasswordEncoder.getInstance();
//    }
    @Autowired
    CustomProvider provider;
    @Autowired
    VerifyCodeFilter verifyCodeFilter;
    @Autowired
    AppsAuthenticationSuccessHandler appsAuthenticationSuccessHandler;
    @Autowired
    MyAccessDeniedHandler myAccessDeniedHandler;
    @Autowired
    private DataSource dataSource;


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.authenticationProvider(provider);  //???????????????
        auth.eraseCredentials(false);
    }

//    @Override
//    public void configure(WebSecurity web) throws Exception {
//
//        //??????????????????
//        web.ignoring().antMatchers("/js/**", "/css/**", "/images/**");
//
//    }

    @Bean
        //??????????????????
    RoleHierarchy roleHierarchy() {
        RoleHierarchyImpl hierarchy = new RoleHierarchyImpl();
        hierarchy.setHierarchy("ROLE_admin > ROLE_user");//???????????????
        return hierarchy;
    }

    //???????????????
    @Bean
    public PasswordEncoder getPw() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                .cors()
                .and()
                .authorizeRequests()
                .antMatchers("/api/**", "/resources/**", "/static/**", "/webjars/**").permitAll()
                .antMatchers("/admin/**").hasRole("admin")
                //hasRole???????????????????????? CustomProvider ????????????????????????ROLE_???grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_admin"));
//                .antMatchers("/user/**").hasRole("user")
                //hasRole???????????????????????? CustomProvider ????????????????????????ROLE_???grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_admin"));
                .antMatchers("/user/**").access("hasRole('user')")
                .and()

                //??????formData???Params??????
                .formLogin()
                //???????????????????????????????????????????????????login
//                .loginPage("/api/showLogin")
                //???????????? ??? ????????? POST form-data ??????????????????????????????????????? "status": 404, "error": "Not Found" ????????????????????? = .loginPage()
                .loginProcessingUrl("/login")
                .usernameParameter("username")
                //??????????????? ???????????? ???????????????????????? password
                .passwordParameter("password")

                .successHandler((req, resp, authentication) -> {
                    resp.setContentType("application/json;charset=utf-8");
                    PrintWriter out = resp.getWriter();
                    out.write(new ObjectMapper().writeValueAsString(new Response(Rcode.Success)));
                    out.flush();
                    out.close();
                })
                .failureHandler((req, resp, exception) -> {
                            resp.setContentType("application/json;charset=utf-8");
                            PrintWriter out = resp.getWriter();
                            out.write(new ObjectMapper().writeValueAsString(new Response(Rcode.Account_Or_Password_Incorrect)));
                            out.flush();
                            out.close();
                        }
                ).and()
                .rememberMe()
                .rememberMeCookieName("remember-me")//???????????????????????????remember-me
                .rememberMeParameter("remember-me")//???????????????cookie????????????remember-me
                .tokenRepository(persistentTokenRepository())
                // ?????????????????????s
                .tokenValiditySeconds(60)
//                .userDetailsService(userDetailsService)
                .and()
                .logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout", "GET"))//???????????????????????????
                .logoutSuccessHandler((req, resp, authentication) -> {
                    resp.setContentType("application/json;charset=utf-8");
                    PrintWriter out = resp.getWriter();
                    out.write(new ObjectMapper().writeValueAsString(new Response(Rcode.Success)));
                    out.flush();
                    out.close();
                })
                .invalidateHttpSession(true)//???????????????session ????????????true
                .clearAuthentication(true)//??????????????????????????? ????????????true
                .permitAll()//??????????????????
                .and()

                //????????????????????????API????????????
                .exceptionHandling()
                .authenticationEntryPoint((req, resp, authException) -> {
                    resp.setContentType("application/json;charset=utf-8");
                    PrintWriter out = resp.getWriter();
                    out.write(new ObjectMapper().writeValueAsString(new Response(Rcode.Error)));
                    out.flush();
                    out.close();
                });
        //?????? CsrfTokenRepository
//        http.csrf().
//        http.csrf().disable();
        //????????????????????????API????????????

        http.csrf().ignoringAntMatchers("/login");
        http.csrf().ignoringAntMatchers("/logout");
        //??????????????????csrf(X-XSRF-TOKEN???XSRF-TOKEN)??????cookie
        http.csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());

        //???csrf(X-XSRF-TOKEN???XSRF-TOKEN)??????from data
        //http.csrf().csrfTokenRepository(new CookieCsrfTokenRepository());
    }

    //???????????????controller??????????????????
    @Bean
    public CorsFilter corsFilter() {
        final UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
        final CorsConfiguration cors = new CorsConfiguration();
        cors.setAllowCredentials(true);
        cors.addAllowedOrigin("http://localhost:8080");
        cors.addAllowedHeader("*");
        cors.addAllowedMethod("*");
        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", cors);
        return new CorsFilter(urlBasedCorsConfigurationSource);
    }


    @Bean
    public PersistentTokenRepository persistentTokenRepository() {
        JdbcTokenRepositoryImpl tokenRepository = new JdbcTokenRepositoryImpl();
        tokenRepository.setDataSource(dataSource);
        // ??????token??????????????????????????????????????????????????????????????????????????????????????????????????????????????????
//        tokenRepository.setCreateTableOnStartup(true);
        return tokenRepository;
    }

//    @Bean
//    public LoginFilter loginFilter() throws Exception {
//        LoginFilter filter = new LoginFilter("/api/login");
//        filter.setAuthenticationManager(authenticationManager());
//        return filter;
//    }

    @Bean("objectMapper")
    public ObjectMapper myMapper() {
        return new ObjectMapper().disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
    }


}
