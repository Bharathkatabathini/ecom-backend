package com.example.ecom_secure.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecom_secure.model.Student;
@RestController
public class StudentController {
	List<Student> Students=new ArrayList<>(List.of(new Student(1,"bharath",90)));
	@GetMapping("/students")
	public List<Student> getStudents(){
		return Students;
	}
	@PostMapping("/addstudent")
	public List<Student>  addStudent(@RequestBody Student student) {
		Students.add(student);
		return Students;
	}
	

}
