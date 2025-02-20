package com.sbms.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name= "passport_tbl")
public class Passport {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer personId;
	
	private String passportNum;
	
	private LocalDate issuedDate;
	
	private LocalDate expDate;
	
	@OneToMany
	@JoinColumn(name = "person_id")
	private Person Person;
	
	
}
