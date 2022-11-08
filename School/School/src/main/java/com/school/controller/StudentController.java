package com.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.school.model.Student;
import com.school.model.StudentObj;
import com.school.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@PostMapping("/addStudent")
	StudentObj addStudent(@RequestBody StudentObj student) {
		
		student=studentService.addStudent(student);
		return student;
		
	}
	
}
