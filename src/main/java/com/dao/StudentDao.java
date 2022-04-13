package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.StudentBean;
import com.service.StudentService;

@Repository
public class StudentDao implements StudentService {

	//jdbc
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public int addStudent(StudentBean studentBean) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("query..");
	}

	@Override
	public List<StudentBean> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteStudents(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
