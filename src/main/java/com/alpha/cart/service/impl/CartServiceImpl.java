package com.alpha.cart.service.impl;

import com.alpha.cart.model.Cart;
import com.alpha.cart.repository.CartRepository;
import com.alpha.cart.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Component
public class CartServiceImpl implements CartService {
    @Autowired
    private CartRepository cartRepository;


    @Override
    public void createCart(String user_id) {
        Cart cart=new Cart();
        cart.setUserId(user_id);
        cart.setCartId("cid34");
        cartRepository.save(cart);
    }

    @Override
    public Optional<Cart> getCart(String userId) {
        return cartRepository.findById(userId);
    }
}
