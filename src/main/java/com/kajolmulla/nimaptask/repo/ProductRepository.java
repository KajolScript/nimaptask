package com.kajolmulla.nimaptask.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kajolmulla.nimaptask.pojo.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}