package com.sbms.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer personId;
	
	private String name;
	
	private String gender;
	
	private Passport Passport;
	
	@OneToOne(mappedBy = "person", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Person Person;
		
}
