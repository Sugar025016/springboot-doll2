package com.xxxx.springsecuritydemo.model.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.xxxx.springsecuritydemo.entity.Cart;
import lombok.*;
import org.springframework.beans.BeanUtils;

import java.util.Date;
import java.util.List;

/**
 * @author: CartResponse
 * @date: 2021/10/20
 * @description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartResponse {

    private Integer id;
    private Integer productId;

    private String title;

    private int qty;

    private int total;

    private int totalOriginPrice;

    public CartResponse(Cart cart) {
        BeanUtils.copyProperties(cart.getProduct(),this);
        this.id=cart.getId();
        System.out.println(                "        this.id=cart.getId();");
        System.out.println(             this.id);
        this.qty=cart.getQty();
        this.productId=cart.getProduct().getId();
        total=cart.getQty()*(cart.getProduct().getPrice()==null?cart.getProduct().getOriginPrice():cart.getProduct().getPrice());
        totalOriginPrice=cart.getQty()*cart.getProduct().getOriginPrice();
    }
}
