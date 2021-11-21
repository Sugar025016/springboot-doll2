package com.xxxx.springsecuritydemo.entity;//package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.BeanUtils;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

/**
 * @author: OrderDetail
 * @date: 2021/4/10
 * @description:
 */
@Getter
@Setter
@Entity
@Table(name = "order_detail")
public class OrderDetail {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY, generator="auto_increment")
    @GenericGenerator(name = "auto_increment", strategy = "native")
    @Column(name="order_detail_id")
    private Integer orderDetailId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", referencedColumnName = "order_id")
    private Order order;

//    @OneToMany(mappedBy="product", cascade={CascadeType.PERSIST, CascadeType.MERGE})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    private Product product;

    @Column(name = "quantity")
    private int quantity;

    //原價
    @Column(name = "origin_price")
    private Integer originPrice;

    //賣價
    @Column(name = "price")
    private Integer price;

    public OrderDetail( ) {
    }

    public OrderDetail( Cart cart,Order order) {
        this.order=order;
        this.product=cart.getProduct();
        this.quantity=cart.getQty();
        this.originPrice=cart.getProduct().getOriginPrice();
        this.price=cart.getProduct().getPrice()==null?cart.getProduct().getOriginPrice():cart.getProduct().getPrice();

    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "orderDetailId=" + orderDetailId +
                ", product=" + product +
                ", quantity=" + quantity +
                ", originPrice=" + originPrice +
                ", price=" + price +
                '}';
    }
}
