package com.sbms.service;

import java.util.List;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.sbms.entity.Employee;
import com.sbms.repo.EmpRepo;

@Service
public class EmpService {

	private EmpRepo empRepo;

	@Autowired
	public EmpService(EmpRepo repo) {
		this.empRepo = repo;
	}

	public void getAllEpms() {
		List<Employee> emps = empRepo.findAll();
		emps.forEach(e -> System.out.println(e));
	}
	
	
	public void getAllEpmsWithFilter() {
		List<Employee> emps = empRepo.findAll();
		emps.forEach(e -> System.out.println(e));
	}

	public void getAllEpmsPegination() {

		int pageSize = 2; // fixed value
		int pageNumber = 1; // will come from UI

		PageRequest pg = PageRequest.of(pageNumber - 1, pageSize);

		Page<Employee> page = empRepo.findAll(pg);

		List<Employee> emps = page.getContent();

		emps.forEach(e -> System.out.println(e));
	}

	public void getAllEpmSort() {
		Sort sort = Sort.by("esalary", "ename").descending();
		List<Employee> emps = empRepo.findAll(sort);
		emps.forEach(e -> System.out.println(e));
	}

}
