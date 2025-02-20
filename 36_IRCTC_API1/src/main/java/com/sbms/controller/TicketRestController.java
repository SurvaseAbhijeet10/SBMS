package com.sbms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sbms.entity.Passenger;
import com.sbms.entity.Ticket;
import com.sbms.service.TicketServiceImpl;

@RestController
public class TicketRestController {

	@Autowired
	private TicketServiceImpl ticketService;
	
	@PostMapping(value="/ticket",
			consumes= "application/json",
			produces= "application/json")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger passanger){
		Ticket bookTicket = ticketService.bookTicket(passanger);
		return new ResponseEntity<>(bookTicket, HttpStatus.CREATED);
	}
	
	@GetMapping(value="/ticket{tid}",
			produces= "application/json")
	public ResponseEntity<Ticket> getTicketById(@PathVariable("tid")Integer tid){
		Ticket t=ticketService.getTicket(tid);
		return new ResponseEntity<>(t, HttpStatus.OK);
	}
	
	@GetMapping(value ="/tickets",
			produces= "application/json")
	public ResponseEntity<List<Ticket>> getAllEmployee(){
		List<Ticket> tickets = ticketService.getTickets();
		return new ResponseEntity<>(tickets, HttpStatus.OK);
	}
	
}
