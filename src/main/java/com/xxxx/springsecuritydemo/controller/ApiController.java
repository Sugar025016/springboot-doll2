package com.xxxx.springsecuritydemo.controller;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.xxxx.springsecuritydemo.entity.Cart;
import com.xxxx.springsecuritydemo.entity.Product;
import com.xxxx.springsecuritydemo.entity.User;
import com.xxxx.springsecuritydemo.enums.Rcode;
import com.xxxx.springsecuritydemo.model.Response;
import com.xxxx.springsecuritydemo.model.request.CartRequest;
import com.xxxx.springsecuritydemo.model.request.UserRequest;
import com.xxxx.springsecuritydemo.model.response.ProductResponse;
import com.xxxx.springsecuritydemo.service.ICartService;
import com.xxxx.springsecuritydemo.service.IFileService;
import com.xxxx.springsecuritydemo.service.IProductService;
import com.xxxx.springsecuritydemo.service.IUserService;
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

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author: Controller
 * @date: 2021/2/28
 * @description:
 */

@RestController
@RequestMapping("/api")
//@Validated
public class ApiController {
    @Autowired
    IProductService productService;
    @Autowired
    IFileService fileService;
    @Autowired
    IUserService userService;
    @Autowired
    ICartService cartService;

    @RequestMapping(path = "/products", method = RequestMethod.GET)
    public Response getProducts(@PageableDefault(size = 9, page = 0) Pageable pageable) {

//        List<SchedulesResponse> scheduleList = sckeduleService.getSchedules(startDate,endDate);
        System.out.println("成功********");
        System.out.println(pageable);
        Page<ProductResponse> productPage = productService.getProduct(true, pageable);

        return new Response(Rcode.Success, productPage);
    }

    @RequestMapping(path = "/product/{id}", method = RequestMethod.GET)
    public Response getProduct(@PathVariable int id, Authentication authentication) {

        System.out.println("成功********");
        System.out.println(id);
        User user = null;
        if (authentication != null) {
            user = (User) authentication.getPrincipal();
        }

        Response productBy = productService.getProductBy(id, user);

        return productBy;
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
        Response add = userService.add(userRequest);

        return add;
    }

    @ResponseBody
    @RequestMapping(value = "/emailCheck/{Garbled}", method = RequestMethod.GET)
    public Response emailCheck(@PathVariable String Garbled, Authentication authentication) {

        System.out.println(Garbled);
        System.out.println(authentication);

        return new Response();
    }


}
