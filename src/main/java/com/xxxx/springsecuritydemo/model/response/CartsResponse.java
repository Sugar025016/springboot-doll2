package com.xxxx.springsecuritydemo.model.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author: CartsResponse
 * @date: 2021/10/20
 * @description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartsResponse {


    Long total;

    Long finalTotal;

    List<CartResponse> cartResponseList;

    public CartsResponse(List<CartResponse> cartResponseList) {
        this.cartResponseList = cartResponseList;
        finalTotal=cartResponseList.stream().mapToLong(CartResponse::getTotal).sum();
        total=cartResponseList.stream().mapToLong(CartResponse::getTotalOriginPrice).sum();
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getFinalTotal() {
        return finalTotal;
    }

    public void setFinalTotal(Long finalTotal) {
        this.finalTotal = finalTotal;
    }

    public List<CartResponse> getCartResponseList() {
        return cartResponseList;
    }

    public void setCartResponseList(List<CartResponse> cartResponseList) {
        this.cartResponseList = cartResponseList;
    }
}
