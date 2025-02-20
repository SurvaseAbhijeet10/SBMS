package com.sbms.service;

import java.util.List;

import com.sbms.entity.Passenger;
import com.sbms.entity.Ticket;

public interface TicketService {

	public Ticket bookTicket(Passenger passenger);

	public Ticket getTicket(Integer ticketid);

	public List<Ticket> getTickets();

}
