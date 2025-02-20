package com.sbms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDao {

	public UserDao() {
		System.out.println("UserDao:: Constructor");
	}
    @GetMapping("/findName")
    public static String findName(@RequestParam int id) {
        if (id == 100) {
            return "Raja";
        } else {
            return "Rani";
        }
    }
}
