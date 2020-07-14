package com.alpha.cart.service;


import com.alpha.cart.model.Cart;
import org.springframework.stereotype.Service;
//import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

public interface CartService {
     void createCart(String userId);
    Optional<Cart> getCart(String userId);

    }

