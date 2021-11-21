package com.xxxx.springsecuritydemo.service;

import com.xxxx.springsecuritydemo.entity.Order;
import com.xxxx.springsecuritydemo.entity.User;
import com.xxxx.springsecuritydemo.model.Response;
import com.xxxx.springsecuritydemo.model.request.UserSendRequest;

public interface IOrderService {

    Response addOrder(UserSendRequest userSendRequest , User user);

    Response getOrder(int orderId, User user);

    Response getOrders( User user);
}
