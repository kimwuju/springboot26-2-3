package com.dgsw.ex06.repository;

import com.dgsw.ex06.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
