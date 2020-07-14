package com.alpha.cart.controller;

import java.util.Optional;


import com.alpha.cart.model.Cart;
import com.alpha.cart.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class CartController {

    @Autowired
    private CartService cartService;

    @RequestMapping("/")
    public String index() {
        return "Welcome";
    }

    @PostMapping("/add-to-cart")
    public void addToCart(@RequestParam("user_id") String userId){
        if(cartService.getCart(userId) == null){
            cartService.createCart(userId);
        }
    }

    //-----Retriving cart details with the help of user id-----
//    @GetMapping("/cart/{user_id}")
//    public Optional<Cart> getCartById(@PathVariable("user_id") String user_id){
//        return cartService.gatCartById(user_id);
//    }

/*
    //Add product to cart
    @PostMapping("/cart/{item_id}")
    public void addProductById(@PathVariable ("item_id") String item_id) throws ProductNotFoundException {
        cartService.addProductById(item_id);
    }*/
}
