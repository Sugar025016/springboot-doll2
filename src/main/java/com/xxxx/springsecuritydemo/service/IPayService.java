package com.xxxx.springsecuritydemo.service;

import com.xxxx.springsecuritydemo.entity.User;
import com.xxxx.springsecuritydemo.model.Response;
import com.xxxx.springsecuritydemo.model.request.PayRequest;

/**
 * @author: IPayService
 * @date: 2021/11/20
 * @description:
 */

public interface IPayService {
    Response addPay(PayRequest payRequest, User user);
}
