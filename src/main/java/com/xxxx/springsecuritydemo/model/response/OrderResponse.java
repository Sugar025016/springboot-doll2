package com.xxxx.springsecuritydemo.model.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.xxxx.springsecuritydemo.entity.Order;
import com.xxxx.springsecuritydemo.entity.OrderDetail;
import com.xxxx.springsecuritydemo.enums.OrderStatus;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author: OrderResponse
 * @date: 2021/11/17
 * @description:
 */
@Getter
@Setter
public class OrderResponse {

    private Integer orderId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date creatDate;

    private String status;

    private int statusId;

    private String name;

    private String phone;

    private String address;

    private String message;

    private int total;

    private int totalOriginPrice;

    @JsonProperty("final_total")
    private int finalTotal;

    private List<OrderDetailResponse> orderDetailResponseList;

    public OrderResponse() {
    }

    public OrderResponse(Order order) {
        BeanUtils.copyProperties(order,this);
        List<OrderDetailResponse> orderDetailResponses = new ArrayList<OrderDetailResponse>();
        order.getOrderDetailList().stream().forEach(v->{
            OrderDetailResponse orderDetailResponse = new OrderDetailResponse(v);
            orderDetailResponses.add(orderDetailResponse);

        });
        this.orderDetailResponseList=orderDetailResponses;
        this.finalTotal=this.orderDetailResponseList.stream().mapToInt(OrderDetailResponse::getTotal).sum();
        this.total=this.orderDetailResponseList.stream().mapToInt(OrderDetailResponse::getTotalOriginPrice).sum();
        this.status= OrderStatus.getOrderStatus(order.getStatus()).getChinese();
        this.statusId=order.getStatus();
    }
}
