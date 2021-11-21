package com.xxxx.springsecuritydemo.controller;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.xxxx.springsecuritydemo.entity.User;
import com.xxxx.springsecuritydemo.enums.Rcode;
import com.xxxx.springsecuritydemo.model.Response;
import com.xxxx.springsecuritydemo.model.request.CartRequest;
import com.xxxx.springsecuritydemo.model.request.PayRequest;
import com.xxxx.springsecuritydemo.model.request.UserRequest;
import com.xxxx.springsecuritydemo.model.request.UserSendRequest;
import com.xxxx.springsecuritydemo.model.response.CartResponse;
import com.xxxx.springsecuritydemo.model.response.CartsResponse;
import com.xxxx.springsecuritydemo.model.response.ProductResponse;
import com.xxxx.springsecuritydemo.model.response.UserResponse;
import com.xxxx.springsecuritydemo.service.*;
import com.xxxx.springsecuritydemo.service.Impl.CartService;
import com.xxxx.springsecuritydemo.service.Impl.FileService;
import com.xxxx.springsecuritydemo.service.Impl.ProductService;
import com.xxxx.springsecuritydemo.service.Impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: Controller
 * @date: 2021/2/28
 * @description:
 */

@RestController
@RequestMapping("/user")
//@Validated
public class UserController {
    @Autowired
    IProductService productService;
    @Autowired
    IFileService fileService;
    @Autowired
    IUserService userService;
    @Autowired
    ICartService cartService;
    @Autowired
    IOrderService iOrderService;
    @Autowired
    IPayService iPayService;

    @RequestMapping(path = "/user", method = RequestMethod.GET)
    public Response getUser(Authentication authentication) {

        System.out.println("成功********/user");
        User user = (User) authentication.getPrincipal();
        UserResponse userResponse = new UserResponse(user);
        int cartCount = cartService.getCartCount(user);
        userResponse.setCartCount(cartCount);

        return new Response(Rcode.Success, userResponse);
    }

    @RequestMapping(path = "/products", method = RequestMethod.GET)
    public Response getProducts(@PageableDefault(size = 9, page = 0) Pageable pageable) {

        System.out.println("成功********");
        System.out.println(pageable);
        Page<ProductResponse> productPage = productService.getProduct(true, pageable);

        return new Response(Rcode.Success, productPage);
    }


    @RequestMapping(path = "/cart", method = RequestMethod.POST)
    public Response addCart(@RequestBody() CartRequest cartRequest, Authentication authentication) {

        System.out.println("成功********cartRequest");
        System.out.println(cartRequest);
        System.out.println("成功********authentication");
        System.out.println(authentication);

        cartService.addCart(cartRequest, (User) authentication.getPrincipal());

        return new Response(Rcode.Success);
    }

    @RequestMapping(path = "/cart", method = RequestMethod.GET)
    public Response getCart(Authentication authentication) {

        System.out.println("成功********authentication");
        System.out.println(authentication);
        CartsResponse carts = cartService.getByUser((User) authentication.getPrincipal());

        return new Response(Rcode.Success, carts);
    }

    @RequestMapping(path = "/cart/{id}", method = RequestMethod.DELETE)
    public Response deleteCart(@PathVariable int id, Authentication authentication) {

        System.out.println("成功********authentication");
        System.out.println(authentication);
        Response response = cartService.deleteCart(id, (User) authentication.getPrincipal());

        return response;
    }


    @RequestMapping(path = "/showLogin1", method = RequestMethod.GET)
    public String getLogin() {
        System.out.println("有鬼阿..........=.=+，");

        return "login";
    }

    @ResponseBody
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public Response addUser(@RequestBody() @JsonProperty("user") UserRequest userRequest, Authentication authentication) {

        System.out.println("123465798");
        System.out.println(authentication.getPrincipal());
        Response add = userService.add(userRequest);

        return add;
    }

    @RequestMapping(value = "/order", method = RequestMethod.POST)
    public Response addOrder(@RequestBody() UserSendRequest userSendRequest, Authentication authentication) {

        System.out.println("/order");

        Response response = iOrderService.addOrder(userSendRequest, (User) authentication.getPrincipal());

        return response;
    }

    @RequestMapping(value = "/order/{orderId}", method = RequestMethod.GET)
    public Response getOrder(@PathVariable() int orderId, Authentication authentication) {

        System.out.println("/order/" + orderId);

        Response response = iOrderService.getOrder(orderId, (User) authentication.getPrincipal());

        return response;
    }

    @RequestMapping(value = "/order", method = RequestMethod.GET)
    public Response getOrders(Authentication authentication) {

        System.out.println("/order");
        Response response = iOrderService.getOrders((User) authentication.getPrincipal());

        System.out.println(response.getData());
        return response;
    }

    @RequestMapping(value = "/pay", method = RequestMethod.POST)
    public Response getOrders(@RequestBody PayRequest payRequest, Authentication authentication) {

        System.out.println("/pay");
        Response response = iPayService.addPay(payRequest, (User) authentication.getPrincipal());

        System.out.println(response.getData());
        return response;
    }


}
