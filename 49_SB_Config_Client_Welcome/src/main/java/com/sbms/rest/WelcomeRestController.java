package com.sbms.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@Value("${msg}")
	private String msgTxt;
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		
		return msgTxt;
	}
}
