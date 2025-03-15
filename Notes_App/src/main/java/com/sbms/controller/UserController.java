package com.sbms.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbms.entity.User;
import com.sbms.services.UserService;

@RestController

public class UserController {

	@Autowired
	private UserService userservice;

	@PostMapping("/user")
	public ResponseEntity<User> createUser(@RequestBody User u) {
		User user = this.userservice.saveUser(u);
		return new ResponseEntity<>(user, HttpStatus.CREATED);
	}

	@GetMapping("/user/{user_id}")
	public ResponseEntity<Optional<User>> getUser(@PathVariable Integer user_id){
		System.out.println("UserId" + user_id);
	Optional<User> user = userservice.getUser(user_id);
//	if(user!= null) {
//		User user2 = user.get();
//	}
	return new ResponseEntity<>(user, HttpStatus.OK);
	}
}
