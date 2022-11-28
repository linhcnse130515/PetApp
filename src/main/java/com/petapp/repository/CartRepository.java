package com.petapp.repository;

import com.petapp.entity.Cart;
import com.petapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
    Cart findByUser(User user);
}
