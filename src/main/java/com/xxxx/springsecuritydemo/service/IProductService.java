package com.xxxx.springsecuritydemo.service;

import com.xxxx.springsecuritydemo.entity.Product;
import com.xxxx.springsecuritydemo.entity.User;
import com.xxxx.springsecuritydemo.model.Response;
import com.xxxx.springsecuritydemo.model.request.ProductRequest;
import com.xxxx.springsecuritydemo.model.response.ProductResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author: IProductService
 * @date: 2021/4/4
 * @description:
 */

public interface IProductService {

     Page<ProductResponse> getProduct(Pageable pageable);
     Page<ProductResponse> getProduct(boolean enabled,Pageable pageable);
     List<ProductResponse> getProduct();
     Product getProduct(Integer pageableId);
     Response getProductBy(Integer pageableId, User user);
     Product saveProduct(Product product);
     Response changeProduct(ProductRequest product,int id);
     Product addProduct(ProductRequest product);
     Response deleteProduct(int id);
}
