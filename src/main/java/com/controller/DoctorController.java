package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bean.DoctorBean;
import com.dao.DoctorDao;

@RestController
@CrossOrigin
public class DoctorController {

	@Autowired
	DoctorDao doctorDao;

	// if you add @request body this will accept data in body in json formate

	@PostMapping(value = "/adddoctor")
	public ResponseEntity<DoctorBean> addDoctor(@RequestBody DoctorBean doctorBean) {

		int res = doctorDao.addDoctor(doctorBean);

		if (res > 0) {

			return new ResponseEntity<DoctorBean>(doctorBean, HttpStatus.CREATED);
		}

		return new ResponseEntity<>(HttpStatus.CONFLICT);

	}

	@GetMapping(value = "/getalldoctors")
	public ResponseEntity<List<DoctorBean>> getAllDoctors() {

		List<DoctorBean> doctorlist = doctorDao.getAllDoctors();
		if (doctorlist.size() > 0) {

			return new ResponseEntity<List<DoctorBean>>(doctorlist, HttpStatus.OK);
		}

		return new ResponseEntity<>(HttpStatus.NOT_FOUND);

	}

	@DeleteMapping(value = "/deletedoctor/{id}")
	public ResponseEntity<Integer> deletedoctor(@PathVariable("id") int dId) {

		int res = doctorDao.deleteDoctor(dId);

		if (res > 0) {

			return new ResponseEntity<>(1, HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
	}

	@GetMapping(value = "/getdoctor/{id}")
	public ResponseEntity<DoctorBean> getDoctorById(@PathVariable("id") int dId) {

		DoctorBean doctorBean = doctorDao.getdoctorbyId(dId);

		if (doctorBean != null) {

			return new ResponseEntity<DoctorBean>(doctorBean, HttpStatus.OK);
		}

		return new ResponseEntity<DoctorBean>(HttpStatus.NOT_FOUND);
	}

	@PutMapping(value = "/updatedoctor/{id}")
	public ResponseEntity<DoctorBean> updateDoctor(@PathVariable("id") int dId, @RequestBody DoctorBean doctorBean) {

		int res = doctorDao.updateDoctor(dId, doctorBean);
		if (res > 0) {

			return new ResponseEntity<DoctorBean>(doctorBean, HttpStatus.CREATED);
		} else {

			return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
		}

	}

	// accept data in headers,
	// accept data in request body
	// accept data in params
	@PostMapping(value = "/logindoctor1")
	public ResponseEntity<DoctorBean> loginDoctor(@RequestHeader("dname") String dName,
			@RequestHeader("demail") String dEmail) {

		DoctorBean doctorBean = doctorDao.loginDoctor(dName, dEmail);
		if (doctorBean != null) {

			return new ResponseEntity<>(doctorBean, HttpStatus.OK);
		}

		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		// login using headerrequest
	}
	@PostMapping(value = "/logindoctor2")
	public ResponseEntity<DoctorBean> loginDoctor2(@RequestParam("dname") String dName,
			@RequestParam("demail") String dEmail) {

		DoctorBean doctorBean = doctorDao.loginDoctor(dName, dEmail);
		if (doctorBean != null) {

			return new ResponseEntity<>(doctorBean, HttpStatus.OK);
		}

		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		// login using headerrequest
	}
	
	@PostMapping(value = "/logindoctor3")
	public ResponseEntity<DoctorBean> loginDoctor2(@RequestBody Object obj) {

		String data = (String)obj.toString();
		System.out.println(data);
		
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		// login using headerrequest
	}

}
