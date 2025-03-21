package com.sbms.rest;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	@GetMapping(value = "/msg", produces="text/plain")
	public ResponseEntity<String> getMsg(){
		String msg = "Welcome to JAva Rest API";
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
	
	@GetMapping("/greet/{name}")
	public String getGeetMsg(@PathVariable ("name") String name) {
		String msg = "Good Morning...";
		return msg;
	}

	@GetMapping("/welcome")
	public String getWelcomeMsg(@RequestParam("name") String name) {
		String msg = name +  "Welcome to Rest API....";		
		return msg;
	}
	
}
