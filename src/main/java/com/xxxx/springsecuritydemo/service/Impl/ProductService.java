package com.xxxx.springsecuritydemo.service.Impl;

import com.xxxx.springsecuritydemo.entity.Cart;
import com.xxxx.springsecuritydemo.entity.FileData;
import com.xxxx.springsecuritydemo.entity.Product;
import com.xxxx.springsecuritydemo.entity.User;
import com.xxxx.springsecuritydemo.enums.Rcode;
import com.xxxx.springsecuritydemo.model.Response;
import com.xxxx.springsecuritydemo.model.request.ProductRequest;
import com.xxxx.springsecuritydemo.model.response.ProductResponse;
import com.xxxx.springsecuritydemo.repository.ICartRepository;
import com.xxxx.springsecuritydemo.repository.IFileDateRepository;
import com.xxxx.springsecuritydemo.repository.IProductRepository;
import com.xxxx.springsecuritydemo.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @author: ProductService
 * @date: 2021/4/4
 * @description:
 */
@Service
@Transactional
public class ProductService implements IProductService {

    @Autowired
    IProductRepository iProductRepository;
    @Autowired
    IFileDateRepository iFileDateRepository;
    @Autowired
    ICartRepository iCartRepository;
    @Value("${imageGetUrl}")
    String imageGetUrl;
    @Value("${imagePutUrl}")
    String imagePutUrl;


    @Override
    public Page<ProductResponse> getProduct(Pageable pageable) {

        Page<ProductResponse> all = iProductRepository.findAllByDisableIsFalse(pageable);

        return all;
    }

    @Override
    public Page<ProductResponse> getProduct(boolean enabled, Pageable pageable) {
        Page<ProductResponse> allByEnabled = iProductRepository.findAllByEnabledAndDisable(enabled,false  , pageable);
        allByEnabled.getContent().stream().forEach(v->{
            v.setImageUrl( v.getImageUrl()!=null? imageGetUrl+v.getImageUrl():null);
        });
        return allByEnabled;
    }

    @Override
    public List<ProductResponse> getProduct() {
        List<ProductResponse> all = iProductRepository.getProductsBy();
        return all;
    }

    @Override
    public Product getProduct(Integer pageableId) {
        return iProductRepository.findProductById(pageableId).orElse(null);
    }

    @Override
    public Response getProductBy(Integer productId, User user) {

        Optional<Product> productOptional = iProductRepository.findProductByIdAndEnabled(productId, true);
        if(!productOptional.isPresent()){
            return new Response(Rcode.Error);
        }
        Product product = productOptional.get();
        ProductResponse productResponse = new ProductResponse(product);
        productResponse.setImageUrl(productResponse.getImageUrl()!=null?(productResponse.getImageUrl()):null);

        if(user==null){
            return new Response(Rcode.Success,productResponse);
        }
        Optional<Cart> byProductAndUser = iCartRepository.findByProductAndUser(product, user);
        if(byProductAndUser.isPresent()){
            Cart cart = byProductAndUser.get();
            productResponse.setNum(cart.getQty());
        }

        return new Response(Rcode.Success,productResponse);


//        Optional<ProductResponse> productByIdAndEnabled = iProductRepository.findProductByIdAndEnabled(id, true);
//        ProductResponse productResponse = new ProductResponse();
//        if(productByIdAndEnabled.isPresent()){
//            productResponse = productByIdAndEnabled.get();
//            productResponse.setImageUrl(productResponse.getImageUrl()!=null?(imageGetUrl+productResponse.getImageUrl()):null);
//        }
//
//        return productResponse;
    }

    @Override
    public Product saveProduct(Product product) {


        return iProductRepository.save(product);
    }

    @Override
    public Response changeProduct(ProductRequest productRequest,int id) {
        Optional<Product> byId = iProductRepository.findById(id);
        if(!byId.isPresent()){
            return new Response(Rcode.Product_NotFount);
        }
        Product product1 = byId.get();
        product1.setDisable(true);
        Product save = iProductRepository.save(product1);


        Product product = addProduct(productRequest);
        return new Response();
    }

    @Override
    public Product addProduct(ProductRequest productRequest) {

        FileData fileData = iFileDateRepository.findById(productRequest.getImageId()).orElse(null);
        Product product = new Product(productRequest,fileData);
        Product save = iProductRepository.save(product);
        return save;
    }

    @Override
    public Response deleteProduct(int id) {

        Optional<Product> byId = iProductRepository.findById(id);
        if(!byId.isPresent()){
            return new Response(Rcode.Product_NotFount);
        }
        Product product1 = byId.get();
        product1.setDisable(true);
        Product save = iProductRepository.save(product1);

        return new Response();
    }



}
