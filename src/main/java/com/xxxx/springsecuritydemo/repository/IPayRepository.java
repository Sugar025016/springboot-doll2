package com.xxxx.springsecuritydemo.repository;

import com.xxxx.springsecuritydemo.entity.Pay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPayRepository extends JpaRepository<Pay,Integer> {

}
