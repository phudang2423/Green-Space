package com.Upload.Phu.Repository;

import com.Upload.Phu.Entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<CartItem, Long> {
    List<CartItem> findByUsername(String username);
    void deleteByUsername(String username);
}
