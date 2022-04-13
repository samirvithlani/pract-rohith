package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bean.PlateBean;

@Service
public interface PlateService {

	
	public int addPlate(PlateBean plateBean);

	public List<PlateBean> getAllPlates();
	
	public int updatePlate(int id);
	
	public int deletePlate(int id);
	
	public PlateBean getPlateById(int id);

}
