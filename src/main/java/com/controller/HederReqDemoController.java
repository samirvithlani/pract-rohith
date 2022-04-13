package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping
public class HederReqDemoController {

	//instance variable... //class level variable...
	String auth = "royal";
	String key = "123456";
	
	@GetMapping(value = "/getauthdata")
	public String getHeader(@RequestHeader("auth") String auth,@RequestHeader("key") String key ) {
		
		//local variable... auth
	
		if(this.auth.equals(auth) && this.key.equals(key)) {
			
			return "valid user";
		}
		
		return "user is not valid..";
		
	}
	
}
