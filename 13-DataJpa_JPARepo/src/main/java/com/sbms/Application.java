package com.sbms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sbms.service.EmpService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		EmpService empService =context.getBean(EmpService.class);
		
		//empService.getAllEpms();
		//empService.getAllEpmSort();
		//empService.getAllEpmsPegination();
		empService.getAllEpmsWithFilter();
	}

}
	