package com.jpa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.course.entites.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
