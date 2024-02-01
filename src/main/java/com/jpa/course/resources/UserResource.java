package com.jpa.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.course.entites.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "eduardo", "eduardo@gmail.com", "939393939", "2333");
		return ResponseEntity.ok().body(u);
	}

}
