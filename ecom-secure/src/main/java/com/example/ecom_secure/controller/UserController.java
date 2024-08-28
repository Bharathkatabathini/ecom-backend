package com.example.ecom_secure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecom_secure.model.Users;
import com.example.ecom_secure.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService service;
	@PostMapping("/register")
	public Users registerUser(@RequestBody Users user) {
		return service.register(user);
		
	}

}
