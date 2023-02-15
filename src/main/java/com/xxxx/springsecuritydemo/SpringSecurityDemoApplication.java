package com.xxxx.springsecuritydemo;
//import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

import java.util.TimeZone;

@SpringBootApplication
public class SpringSecurityDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityDemoApplication.class, args);
//        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
//        ActiveMQConnectionFactory activeMQConnetionFactory = new ActiveMQConnectionFactory();
    }


}
