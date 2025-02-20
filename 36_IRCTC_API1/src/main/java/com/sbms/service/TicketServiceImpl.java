package com.sbms.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbms.entity.Passenger;
import com.sbms.entity.Ticket;
import com.sbms.repository.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketRepository repo;

	@Override
	public Ticket bookTicket(Passenger passenger) {
		Ticket t = new Ticket();
		BeanUtils.copyProperties(passenger, t);
		t.setTicketStatus("CONFIRMED");
		Ticket savedTicket = repo.save(t);
		return savedTicket;
	}

	@Override
	public Ticket getTicket(Integer ticketId) {
		return repo.findById(ticketId).orElseThrow();
	}

	@Override
	public List<Ticket> getTickets() {
		return repo.findAll();
	}


}
