package com.example.ecom_secure.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecom_secure.model.Users;


public interface UserRepo extends JpaRepository<Users, Integer>{

	Users findByUsername(String username);

}
