package com.xxxx.springsecuritydemo.model.response;

import com.xxxx.springsecuritydemo.entity.User;
import lombok.Getter;
import lombok.Setter;

/**
 * @author: UserResponse
 * @date: 2021/3/1
 * @description:
 */
@Getter
@Setter
public class UserResponse {

    private String account;

    private String nickname;

    private int cartCount;

    public UserResponse(User user) {
        this.nickname = user.getNickname();
        this.account=user.getAccount();
    }

}
