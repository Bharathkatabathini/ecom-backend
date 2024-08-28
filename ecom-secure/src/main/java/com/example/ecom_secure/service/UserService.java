package com.example.ecom_secure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.ecom_secure.model.Users;
import com.example.ecom_secure.repo.UserRepo;

@Service
public class UserService {
	
	
	BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
@Autowired	

private UserRepo repo;
	public Users register(Users user) {
		user.setPassword(encoder.encode(user.getPassword()));
		return repo.save(user);
	}

}
