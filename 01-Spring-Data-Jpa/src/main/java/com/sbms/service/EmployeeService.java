
package com.sbms.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbms.entity.Employee;
import com.sbms.repo.EmpRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmpRepository empRepo;

	public EmployeeService(EmpRepository emprepo) {
		this.empRepo = empRepo;
	}

	//Entity Object to represent data
	public void SaveEmployee() {
		Employee e = new Employee();
		e.setEid(101);
		e.setEname("Abhijeet");
		e.setEsalary(50000); 
		
		e.setEid(102);
		e.setEname("Akhil");
		e.setEsalary(60000);
		
		
		// inserting record based on
		empRepo.save(e);
		
		System.out.println("Record Saved....");

	}
	
	/*
	 * public void saveEmp() {
	 * 
	 * Employee e1 = new Employee(102, "Akaash", 4242.0); Employee e2 = new
	 * Employee(102, "Amit", 4242.0); Employee e3 = new Employee(102, "Pranit",
	 * 4242.0);
	 * 
	 * List<Employee> list = Arrays.asList(e1, e2, e3);
	 * 
	 * empRepo.saveAll(list); System.out.println("Record saved in DB..."); }
	 */

}
