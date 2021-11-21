package com.xxxx.springsecuritydemo.model.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.xxxx.springsecuritydemo.entity.Order;
import com.xxxx.springsecuritydemo.entity.OrderDetail;
import com.xxxx.springsecuritydemo.enums.OrderStatus;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * @author: OrdersResponse
 * @date: 2021/11/17
 * @description:
 */
@Getter
@Setter
public class OrdersResponse {

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date creatDate;

    private Integer orderId;

    private int sum;

    private String status;

    private int statusId;

    public OrdersResponse(Order order) {

        BeanUtils.copyProperties(order,this);
        this.status= OrderStatus.getOrderStatus(order.getStatus()).getChinese();
        this.statusId=order.getStatus();
          order.getOrderDetailList().stream().forEach(v->{
             int i = v.getPrice() * v.getQuantity();
             this.sum=this.sum+i;
         });
    }
}
