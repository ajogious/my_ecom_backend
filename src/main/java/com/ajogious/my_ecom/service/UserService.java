package com.ajogious.my_ecom.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ajogious.my_ecom.model.User;
import com.ajogious.my_ecom.repo.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	// method for registering user & password encoded before saving to db
	public User registerUser(User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		
        user.setRegistrationDate(LocalDateTime.now());
		return userRepo.save(user);
	}
	
	// finding user by their username
	public User getUserByUsername(String username) {
		return userRepo.findByUsername(username);
	}

	// finding user by their id
	public User getUserById(Long id) {
		return userRepo.findById(id).orElse(null);
	}
}
