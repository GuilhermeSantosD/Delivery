package com.jpa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.course.entites.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
