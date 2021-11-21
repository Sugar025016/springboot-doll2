package com.xxxx.springsecuritydemo.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;

/**
 * @author: LoginRequest
 * @date: 2021/11/13
 * @description:
 */
@Getter
@Setter
public class LoginRequest {
    @NotNull
    @Email
    @JsonProperty( "email")
    private String account;

    @NotNull
    private String password;
}
