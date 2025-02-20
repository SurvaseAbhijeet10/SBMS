package com.sbms.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sbms.binding.Customer;

@RestController
public class CustomerRestController {
	
	@PutMapping(value="/customer", consumes="application/json",produces="text/palin")
	public ResponseEntity<String> updateCustomer(@RequestBody Customer c){
		
		return new ResponseEntity<>("Customer Updated", HttpStatus.OK);
	}
	
	@DeleteMapping(value="/customer/{cid}",produces="text/plain")
	public ResponseEntity<String> deleteCustomer(@PathVariable("cid") Integer cid){
		
		return new ResponseEntity<>("Customer Delete", HttpStatus.OK);	
	}
	
	@PostMapping(value="/customer", consumes= "application/json", produces="text/plain")
	public ResponseEntity<String> postCustomerData(@RequestBody Customer c){
		System.out.println(c);
		//To insert recored into db
		return new ResponseEntity<>("Customer Saved..", HttpStatus.CREATED);
	}

	@GetMapping(value="/customers", produces= "application/json")
	public ResponseEntity<List<Customer>> getCustomers() {
		Customer c = new Customer(101, "akash", "akash@gmail.com");
		Customer c1 = new Customer(102, "prakash", "prakash@gmail.com");
		Customer c2 = new Customer(1013, "anil", "anil@gmail.com");

		List<Customer> list = Arrays.asList(c, c1, c2);

		return new ResponseEntity<>(list, HttpStatus.OK);

	}

	@GetMapping(value = "/customer", produces = "application/json")
	public ResponseEntity<Customer> getCustomer() {
		Customer c = new Customer(1014, "Sunil", "sunil@gmail.com");
		return new ResponseEntity<>(c, HttpStatus.OK);
	}
}
