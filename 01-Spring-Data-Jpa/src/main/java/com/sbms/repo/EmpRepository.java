package com.sbms.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sbms.entity.Employee;

@Repository
public interface EmpRepository extends CrudRepository<Employee, Integer> {

	//public void save(Employee e);

	
}
