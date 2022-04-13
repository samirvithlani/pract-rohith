package com.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.TrackBean;

@RestController
public class TrackController {

	@GetMapping(value = "/tracks")
	public ResponseEntity<TrackBean> getTracks() {

		return new ResponseEntity<TrackBean>(HttpStatus.OK);
	}
}
