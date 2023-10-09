package com.erik1935.productsservice.repositories;

import com.erik1935.productsservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
