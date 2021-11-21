package com.xxxx.springsecuritydemo.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;

/**
 * @author: UserSendRequest
 * @date: 2021/11/16
 * @description:
 */
@Getter
@Setter
public class UserSendRequest {
    @NotNull
    @Email
    @JsonProperty( "email")
    private String email;

    @NotNull
    private String name;

    @NotNull
    @JsonProperty( "tel")
    private String phone;

    @NotNull
    @JsonProperty( "address")
    private String address;

    @JsonProperty( "message")
    private String message;

    public UserSendRequest() {
    }
}
