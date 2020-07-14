package com.alpha.cart.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;


import javax.annotation.Generated;
import javax.persistence.*;
import java.util.List;

@Table( "Cart")
@Entity
public class Cart {

    @Id
    @Column(name = "cart_id")
    private String cartId;

    @Column(name = "user_id")
   private String userId;

    @Column(name = "cart_items")
   private List<CartItem> cartItems;

    @Column(name ="total_price")
   private double totalPrice;

    @Column(name = "total_quantity")
   private int totalQuantity;

    public Cart() {

    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalquantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public Cart(String cartId, String userId, List<CartItem> cartItems, double totalPrice, int totalQuantity) {
        this.cartId = cartId;
        this.userId = userId;
        this.cartItems = cartItems;
        this.totalPrice = totalPrice;
        this.totalQuantity = totalQuantity;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartId='" + cartId + '\'' +
                ", userId='" + userId + '\'' +
                ", cartItems=" + cartItems +
                ", totalPrice=" + totalPrice +
                ", totalquantity=" + totalQuantity +
                '}';
    }
}
