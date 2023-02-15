package com.xxxx.springsecuritydemo.config;

import io.lettuce.core.KeyValue;
import io.lettuce.core.RedisClient;
import io.lettuce.core.RedisURI;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.sync.RedisCommands;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: RedisConfig
 * @date: 2021/10/24
 * @description:
 */
@EnableRedisHttpSession
//@Configuration
public class RedisConfig {

//    @Value(value = "${spring.redis.password}")
//    private String password;
    @Bean
    public LettuceConnectionFactory connectionFactory() {
        LettuceConnectionFactory connectionFactory = new LettuceConnectionFactory();
        connectionFactory.setPort( 6379 );
//        connectionFactory.setUseSsl( Boolean.parseBoolean(  "true" ));
//        connectionFactory.setHostName( "requirepass" );

        connectionFactory.setPassword( "12345" );
        return  connectionFactory;
    }
    @Bean
    RedisTemplate<String, String> redisTemplate(RedisConnectionFactory redisConnectionFactory) {

        RedisTemplate<String, String> template = new RedisTemplate<>();
        template.setConnectionFactory(redisConnectionFactory);
        return template;
    }



//    @Bean
//    public JedisConnectionFactory redisConnectionFactory() {
//
//        RedisStandaloneConfiguration config = new RedisStandaloneConfiguration("requirepass", 12345);
//        return new JedisConnectionFactory(config);
//    }

}