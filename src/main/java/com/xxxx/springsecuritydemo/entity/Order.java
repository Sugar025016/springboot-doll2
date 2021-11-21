package com.xxxx.springsecuritydemo.entity;//package com.example.demo.entity;

import com.xxxx.springsecuritydemo.model.request.UserSendRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.BeanUtils;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * @author: Order
 * @date: 2021/4/10
 * @description:
 */
@Getter
@Setter
@Entity
@Table(name = "orderd")//注意 order sql 保留字
public class Order {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY, generator="auto_increment")
    @GenericGenerator(name = "auto_increment", strategy = "native")
    @Column(name="order_id")
    private Integer orderId;

    @Column(name = "email")
    private String email;

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    @Column(name = "message")
    private String message;

    @Column(name = "status")
    private int status=1;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;

    @OneToMany(mappedBy = "order",cascade=CascadeType.ALL)
    private Set<OrderDetail> orderDetailList;

    @Column(name = "creat_date")
    private Date creatDate;

    public Order() {
    }

    public Order(UserSendRequest userSendRequest,User user) {
        BeanUtils.copyProperties(userSendRequest,this);
        this.user=user;
        this.creatDate=new Date();
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", message='" + message + '\'' +
                ", status=" + status +
                ", user=" + user +
                ", orderDetailList=" + orderDetailList +
                ", creatDate=" + creatDate +
                '}';
    }
}
