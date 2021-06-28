package com.example.service;

import java.util.List;

import com.example.models.TicketEntity;

public interface TicketService {
	
	List<TicketEntity> getAllTickes();
	TicketEntity getTicketById(int id);
	TicketEntity updateTicket(TicketEntity ticket , int id);
	String deleteTicket(int id);

}
