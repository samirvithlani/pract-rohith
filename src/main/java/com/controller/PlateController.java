package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.PlateBean;
import com.dao.PlateDao;
import com.service.PlateService;

@RestController
@RequestMapping("/api")
public class PlateController {
	
	@Autowired
	//PlateDao plateDao;
	PlateService plateService;
	

	@PostMapping(value = "/plate")
	public ResponseEntity<PlateBean> addPlate(@RequestBody PlateBean plateBean) {

		plateService.addPlate(plateBean);
		return new ResponseEntity<PlateBean>(plateBean, HttpStatus.OK);
	}

	@GetMapping(value = "/plate")
	public ResponseEntity<List<PlateBean>> getAllPlates() {

		return new ResponseEntity<>(HttpStatus.OK);

	}
}
