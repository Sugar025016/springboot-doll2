package com.xxxx.springsecuritydemo.controller;

import com.xxxx.springsecuritydemo.entity.User;
import com.xxxx.springsecuritydemo.model.Response;
import com.xxxx.springsecuritydemo.service.IUserService;
import com.xxxx.springsecuritydemo.service.Impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Optional;

/**
 * @author: LoginController
 * @date: 2021/8/27
 * @description:
 */
@RestController
@RequestMapping("/api")
public class LoginController {


    @Autowired
    IUserService userService;

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public Response login(@RequestParam Map<String, String> paramMap) {
        System.out.println("/login" + paramMap);
        String username = "username";
        String password = "password";
        User byAccount = userService.findByAccount(paramMap.get(username), paramMap.get(password));

        System.out.println("/login" + byAccount);


        return new Response();
    }

    @RequestMapping(path = "/aa", method = RequestMethod.GET)
    public Response aa() {
        System.out.println("/aa");
        return new Response();
    }
}
