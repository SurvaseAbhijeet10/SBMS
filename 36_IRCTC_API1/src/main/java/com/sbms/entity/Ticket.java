package com.sbms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Ticket {

	@Id
	@GeneratedValue
	private Integer ticketId;
	private String ticketStatus;
	private String trainNum;
	private String name;
	private String dob;
	private String gender;
	private String doj;
	private String sources;
	private String destination;

	public Ticket(Integer ticketId, String ticketStatus, String trainNum, String name, String dob, String gender,
			String doj, String sources, String destination) {
		super();
		this.ticketId = ticketId;
		this.ticketStatus = ticketStatus;
		this.trainNum = trainNum;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.doj = doj;
		this.sources = sources;
		this.destination = destination;
	}

	public Ticket() {
		// TODO Auto-generated constructor stub
	}

	public Integer getTicketId() {
		return ticketId;
	}

	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public String getTrainNum() {
		return trainNum;
	}

	public void setTrainNum(String trainNum) {
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

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", ticketStatus=" + ticketStatus + ", trainNum=" + trainNum + ", name="
				+ name + ", dob=" + dob + ", gender=" + gender + ", doj=" + doj + ", sources=" + sources
				+ ", destination=" + destination + "]";
	}

}
