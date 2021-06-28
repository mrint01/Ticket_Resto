package com.example.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.MetEntity;
import com.example.models.TicketEntity;
import com.example.repository.MetRepository;
import com.example.repository.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService {

	
	
	private TicketRepository tickrepo;
	private MetRepository metrepo;
	
	@Autowired
	public TicketServiceImpl(TicketRepository tickrepo , MetRepository metrepo) {
		super();
		this.tickrepo = tickrepo;
		this.metrepo = metrepo;
	}
	
	
	// get all tickets
	@Override
	public List<TicketEntity> getAllTickes() {
		return tickrepo.findAll();
	}

	
	// get ticket by id
	@Override
	public TicketEntity getTicketById(int id) {
		TicketEntity entity;
		Optional<TicketEntity> opt = tickrepo.findById(id);
		if (opt.isPresent())
			entity = opt.get();
		else
			throw new NoSuchElementException("Ticket with this id is not found");

		return entity;
	}

	
	// update ticket
	@Override
	public TicketEntity updateTicket(TicketEntity ticket, int id) {
		TicketEntity oldtic = this.getTicketById(id);
		
		if(oldtic.getDate() != null) {
			oldtic.setDate(ticket.getDate());
		}
		if(oldtic.getNcouvert() != 0) {
			oldtic.setNcouvert(ticket.getNcouvert());
		}
		if(oldtic.getAddition() != 0) {
			oldtic.setAddition(ticket.getAddition());
		}
		
		return tickrepo.save(oldtic);
	}

	
	// delete ticket
	@Override
	public String deleteTicket(int id) {
		TicketEntity tickdel = this.getTicketById(id);
	/*	List<MetEntity> metlist = metrepo.findAll();
		tickdel.setTables(null);
		for(int j=0;j<tickdel.getMets().size();j++) {
			for(int i=0;i< metlist.size();i++) {
				if(tickdel.getMets().get(j) == metlist.get(i))
				metrepo.delete(tickdel.getMets().get(j));
			}
		}*/
		tickrepo.delete(tickdel);
		return " Deleted ";
	}

}
