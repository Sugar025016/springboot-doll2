package com.xxxx.springsecuritydemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: LogoutSuccessHandler
 * @date: 2021/11/16
 * @description:
 */
//@Component
//public class UserLogoutSuccessHandler implements LogoutSuccessHandler {
//    @Autowired
//    private TokenStore tokenStore;
//
//    @Override
//    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException {
//        String accessToken = request.getParameter("access_token");
//        if(StringUtils.isNotBlank(accessToken)){
//            OAuth2AccessToken oAuth2AccessToken = tokenStore.readAccessToken(accessToken);
//            if(oAuth2AccessToken != null){
//                System.out.println("----access_token是："+oAuth2AccessToken.getValue());
//                tokenStore.removeAccessToken(oAuth2AccessToken);
//                OAuth2RefreshToken oAuth2RefreshToken = oAuth2AccessToken.getRefreshToken();
//                tokenStore.removeRefreshToken(oAuth2RefreshToken);
//                tokenStore.removeAccessTokenUsingRefreshToken(oAuth2RefreshToken);
//            }
//        }
//        HttpUtils.writeSuccess(BaseResponse.createResponse(HttpStatusMsg.OK.getStatus(), "退出成功"), response);
//
//    }
//}
