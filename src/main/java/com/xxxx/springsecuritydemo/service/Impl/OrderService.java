package com.xxxx.springsecuritydemo.service.Impl;

import com.xxxx.springsecuritydemo.entity.Cart;
import com.xxxx.springsecuritydemo.entity.Order;
import com.xxxx.springsecuritydemo.entity.OrderDetail;
import com.xxxx.springsecuritydemo.entity.User;
import com.xxxx.springsecuritydemo.enums.Rcode;
import com.xxxx.springsecuritydemo.model.Response;
import com.xxxx.springsecuritydemo.model.request.UserSendRequest;
import com.xxxx.springsecuritydemo.model.response.OrderDetailResponse;
import com.xxxx.springsecuritydemo.model.response.OrderResponse;
import com.xxxx.springsecuritydemo.model.response.OrdersResponse;
import com.xxxx.springsecuritydemo.repository.ICartRepository;
import com.xxxx.springsecuritydemo.repository.IOrderDetailRepository;
import com.xxxx.springsecuritydemo.repository.IOrderRepository;
import com.xxxx.springsecuritydemo.service.ICartService;
import com.xxxx.springsecuritydemo.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author: OrderService
 * @date: 2021/11/16
 * @description:
 */
@Transactional
@Service
public class OrderService implements IOrderService {

    @Autowired
    ICartService iCartService;

    @Autowired
    ICartRepository iCartRepository;

    @Autowired
    IOrderService iOrderService;

    @Autowired
    IOrderRepository iOrderRepository;

    @Autowired
    IOrderDetailRepository iOrderDetailRepository;



    @Override
    public Response addOrder(UserSendRequest userSendRequest, User user) {
        List<Cart> cartByUser = iCartRepository.getByUser(user);
        if(cartByUser.size()==0){
            return new Response( Rcode.Cart_Null);
        }
        Order order = new Order(userSendRequest,user);
        Order save = iOrderRepository.save(order);

        cartByUser.stream().forEach(v->{
            OrderDetail orderDetail = new OrderDetail(v,save);
            iOrderDetailRepository.save(orderDetail);
        });

        iCartRepository.deleteAll(cartByUser);

        return new Response(Rcode.Success,order.getOrderId());
    }

    @Override
    public Response getOrder(int orderId, User user) {

        Optional<Order> orderByOrderIdAndUser = iOrderRepository.findOrderByOrderIdAndUser(orderId, user);

        if(!orderByOrderIdAndUser.isPresent()){
            return new Response(Rcode.Order_NotFount);
        }
        Order order=orderByOrderIdAndUser.get();
        OrderResponse orderResponse = new OrderResponse(order);

        return new Response(Rcode.Success,orderResponse);
    }

    @Override
    public Response getOrders(User user) {
        List<Order> orderByUser = iOrderRepository.findOrderByUser(user);

        List<OrdersResponse> ordersRespons = new ArrayList<>();
        orderByUser.stream().forEach(v->{
            OrdersResponse ordersResponse = new OrdersResponse(v);
            ordersRespons.add(ordersResponse);
        });

        return new Response(Rcode.Success , ordersRespons);
    }
}
