package com.xxxx.springsecuritydemo.repository;//package com.example.demo.repository;

import com.xxxx.springsecuritydemo.entity.Order;
import com.xxxx.springsecuritydemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IOrderRepository extends JpaRepository<Order, Integer> {

    @Override
    Order getOne(Integer id);

    Optional<Order> findOrderByOrderIdAndUser(int id, User user);

    List<Order> findOrderByUser(User user);



}
