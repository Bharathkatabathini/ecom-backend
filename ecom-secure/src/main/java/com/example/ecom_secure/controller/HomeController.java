package com.example.ecom_secure.controller;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecom_secure.model.Student;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HomeController {
@GetMapping("")
public String home() {
	return "Welcome Home";
}
@GetMapping("/getSession")
public String getSession(HttpServletRequest http) {
	return "session id is "+http.getSession().getId();
}
@GetMapping("/csrf")
public CsrfToken getcsrf(HttpServletRequest http) {
	return (CsrfToken) http.getAttribute("_csrf");
}
@PostMapping("/students")
public Student addStudent(@RequestBody Student student) {
	
	return student;
}
}
