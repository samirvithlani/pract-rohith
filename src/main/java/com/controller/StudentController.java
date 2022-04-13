package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.dao.StudentDao;
import com.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	// StudentDao studentDao;
	StudentService studentService;

	public void addStudemt() {

		// studentService.addStudent(null)
	}
}
