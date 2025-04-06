package com.example.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ecommerce.models.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {
}

