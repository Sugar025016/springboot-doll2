package com.xxxx.springsecuritydemo.entity;

import com.xxxx.springsecuritydemo.model.request.PayRequest;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.BeanUtils;

import javax.persistence.*;
import java.util.Date;

/**
 * @author: Pay
 * @date: 2021/11/20
 * @description:
 */
@Getter
@Setter
@Entity
@Table(name="pay")
public class Pay {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY, generator="auto_increment")
    @GenericGenerator(name = "auto_increment", strategy = "native")
    @Column(name="pay_id")
    private Integer payId;

    @Column(name = "number", nullable = false)
    private String number;

    @Column(name = "expiration", nullable = false)
    private String expiration;

    @Column(name = "cvv", nullable = false)
    private String cvv;

    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "status" , nullable = false)
    private int status;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="order_id")
    private Order order;

    public Pay() {
    }

    public Pay(PayRequest payRequest,Order order) {

        BeanUtils.copyProperties(payRequest,this);
        this.date=new Date();
        this.order=order;
    }





}
