package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.PlateBean;
import com.service.PlateService;

@Repository
public class PlateDao implements PlateService{
	
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int addPlate(PlateBean plateBean) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("insert into query...");
	}

	@Override
	public List<PlateBean> getAllPlates() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updatePlate(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deletePlate(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PlateBean getPlateById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
