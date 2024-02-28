package com.jpa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.course.entites.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
