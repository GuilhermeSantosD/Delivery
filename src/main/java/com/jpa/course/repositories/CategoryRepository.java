package com.jpa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.course.entites.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
