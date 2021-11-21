package com.xxxx.springsecuritydemo.model.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.xxxx.springsecuritydemo.entity.OrderDetail;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * @author: OrderDetailResponse
 * @date: 2021/11/17
 * @description:
 */
@Getter
@Setter
public class OrderDetailResponse {

    private Integer id;

    private String title;

    private int qty;

    private int total;

    private int totalOriginPrice;

    public OrderDetailResponse(OrderDetail orderDetail) {
        BeanUtils.copyProperties(orderDetail,this);
        this.id=orderDetail.getOrderDetailId();
        this.title=orderDetail.getProduct().getTitle();
        this.qty=orderDetail.getQuantity();
        this.total=orderDetail.getPrice()*orderDetail.getQuantity();
        this.totalOriginPrice=orderDetail.getOriginPrice()*orderDetail.getQuantity();

    }
}
