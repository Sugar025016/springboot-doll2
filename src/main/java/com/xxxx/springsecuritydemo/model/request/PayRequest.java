package com.xxxx.springsecuritydemo.model.request;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author: PayRequest
 * @date: 2021/11/20
 * @description:
 */
@Getter
@Setter
public class PayRequest {

    @NotNull
    int orderId;

    @NotBlank
    @Size(min=5,max=50)
    String name;

    @NotBlank
    @Size(min=12,max=12)
    String number;

    @NotBlank
    @Size(min=5,max=5)
    String expiration;

    @NotBlank
    @Size(min=3,max=3)
    String cvv;

    public PayRequest() {

    }
}
