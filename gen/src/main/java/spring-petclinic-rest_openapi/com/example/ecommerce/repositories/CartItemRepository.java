package com.example.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.ecommerce.models.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {

    @Query("CartItem cartItem -> cartItem.getCart().getId()")
    Long findCartId(CartItem cartItem);

    @Query("CartItem cartItem -> cartItem.getProduct().getId()")
    Long findProductId(CartItem cartItem);

    @Query("CartItem cartItem -> cartItem.getCart().getId()")
    Long findCartIdByCartItem(CartItem cartItem);

    @Query("CartItem cartItem -> cartItem.getProduct().getId()")
    Long findProductIdByCartItem(CartItem cartItem);

    @Query("CartItem cartItem -> cartItem.getCart().getId()")
    Long findCartIdByCartItem(CartItem cartItem);

    @Query("CartItem cartItem -> cartItem.getProduct().getId()")
    Long findProductIdByCartItem(CartItem cartItem);

    @Query("CartItem cartItem -> cartItem.getCart().getId()")
    Long findCartIdByCartItem(CartItem cartItem);

    @Query("CartItem cartItem -> cartItem.getProduct().getId()")
    Long findProductIdByCartItem(CartItem cartItem);

    @Query("CartItem cartItem -> cartItem.getCart().getId()")
    Long findCartIdByCartItem(CartItem cartItem);

    @Query("CartItem cartItem -> cartItem.getProduct().getId()")
    Long findProductIdByCartItem(CartItem cartItem);

    @Query("CartItem cartItem -> cartItem.getCart().getId()")
    Long findCartIdByCartItem(CartItem cartItem);

    @Query("CartItem cartItem -> cartItem.getProduct().getId()")
    Long findProductIdByCartItem(CartItem cartItem);

    @Query("CartItem cartItem -> cartItem.getCart().getId()")
    Long findCartIdByCartItem(CartItem cartItem);

    @Query("CartItem cartItem -> cartItem.getProduct().getId()")
    Long findProductIdByCartItem(CartItem cartItem);
}

