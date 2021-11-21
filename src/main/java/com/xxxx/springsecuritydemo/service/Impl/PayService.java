package com.xxxx.springsecuritydemo.service.Impl;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import com.xxxx.springsecuritydemo.entity.Order;
import com.xxxx.springsecuritydemo.entity.Pay;
import com.xxxx.springsecuritydemo.entity.User;
import com.xxxx.springsecuritydemo.enums.Rcode;
import com.xxxx.springsecuritydemo.model.Response;
import com.xxxx.springsecuritydemo.model.request.PayRequest;
import com.xxxx.springsecuritydemo.repository.IOrderRepository;
import com.xxxx.springsecuritydemo.repository.IPayRepository;
import com.xxxx.springsecuritydemo.service.IPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * @author: PayService
 * @date: 2021/11/20
 * @description:
 */
@Transactional
@Service
public class PayService implements IPayService {

    @Autowired
    IOrderRepository iOrderRepository;

    @Autowired
    IPayRepository iPayRepository;

    @Override
    public Response addPay(PayRequest payRequest, User user) {
        Optional<Order> orderByOrderIdAndUser = iOrderRepository.findOrderByOrderIdAndUser(payRequest.getOrderId(), user);
        if(!orderByOrderIdAndUser.isPresent()){
            return  new Response(Rcode.Order_NotFount);
        }

        Order order = orderByOrderIdAndUser.get();
        Pay pay = new Pay(payRequest,order);

        Pay save = iPayRepository.save(pay);
        order.setStatus(3);
        Order save1 = iOrderRepository.save(order);

        return new Response(Rcode.Success,order.getOrderId());
    }
}
