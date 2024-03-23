package com.jpa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.course.entites.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
