package com.ajogious.my_ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajogious.my_ecom.model.User;
import com.ajogious.my_ecom.service.UserService;

@RestController
@CrossOrigin
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	// api end point to a register user
	@PostMapping("/register")
	public User register(@RequestBody User user) {
		return userService.registerUser(user);
	}
	
	// api end point to get a user by id
	@GetMapping("/id/{id}")
	public User getUserById(@PathVariable Long id) {
		return userService.getUserById(id);
	}
	
	// api end point to a get user by username
	@GetMapping("/username/{username}")
	public User getUserByUsername(@PathVariable String username) {
		return userService.getUserByUsername(username);
	}
}
