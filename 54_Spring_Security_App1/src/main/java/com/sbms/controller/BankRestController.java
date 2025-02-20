package com.sbms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankRestController {

	@GetMapping("/aboutus")
	public String aboutUs() {
		return "We are into Banking since 1900";
	}

	@GetMapping("/contactus")
	public String contactUs() {
		return "plz call :: +91-8788625597";
	}

	@GetMapping("deposit")
	public String deposit() {
		return "Deposit Success...";
	}

	@GetMapping("withdraw")
	public String withdraw() {
		return "Withdraw Success...";
	}

}
