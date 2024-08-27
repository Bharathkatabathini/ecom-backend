package com.example.ecom_secure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.ecom_secure.model.UserPrinciple;
import com.example.ecom_secure.model.Users;
import com.example.ecom_secure.repo.UserRepo;

@Service
public class MyUserDetailsService implements UserDetailsService{
	@Autowired
	private UserRepo repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users user=repo.findByUsername(username);
		if(user==null) {
throw new UsernameNotFoundException(username);
	}
		return new UserPrinciple(user); 

}
}