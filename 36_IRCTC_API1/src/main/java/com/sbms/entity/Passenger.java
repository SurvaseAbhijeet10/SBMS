package com.sbms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Passenger {

	@Id
	private String name;
	private String dob;
	private String gender;
	private String doj;
	private String sources;
	private String destination;
	private String trainNum;
	
	
	
	public Passenger(String name, String dob, String gender, String doj, String sources, String destination,
			String trainNum) {
		super();
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.doj = doj;
		this.sources = sources;
		this.destination = destination;
		this.trainNum = trainNum;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getSources() {
		return sources;
	}
	public void setSources(String sources) {
		this.sources = sources;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getTrainNum() {
		return trainNum;
	}
	public void setTrainNum(String trainNum) {
		this.trainNum = trainNum;
	}
	
	@Override
	public String toString() {
		return "Passenger [name=" + name + ", dob=" + dob + ", gender=" + gender + ", doj=" + doj + ", sources="
				+ sources + ", destination=" + destination + ", trainNum=" + trainNum + "]";
	}
		
	
}
