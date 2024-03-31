package com.medhj.olivardobackend.dao;

import com.medhj.olivardobackend.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{
}
