package com.sbms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbms.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	
	

}
