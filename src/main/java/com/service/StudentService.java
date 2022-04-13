package com.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bean.StudentBean;

@Service
public interface StudentService {

	public int addStudent(StudentBean studentBean);

	public List<StudentBean> getAllStudents();

	public int deleteStudents(int id);
	
	//implent dao....
	//update
	//getdatabyid

}
