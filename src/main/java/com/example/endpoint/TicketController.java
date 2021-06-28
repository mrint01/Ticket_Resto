package com.example.endpoint;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.models.TicketEntity;
import com.example.service.TicketService;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/resto/ticket")
public class TicketController {

	
	private TicketService tickserv;

	// constructor 
	@Autowired
	public TicketController(TicketService tickserv) {
		super();
		this.tickserv = tickserv;
	}
	

	// get all Tickets
	@GetMapping
	public List<TicketEntity> getAllTickets(){
		return tickserv.getAllTickes();
	}
	
	// get Ticket by id
	@GetMapping("/{id}")
	public TicketEntity getTicketById(@PathVariable("id") int id) {
		return tickserv.getTicketById(id);
			}
	
	// update Ticket
	@PutMapping("update/{id}")
	public TicketEntity updateTicket(@RequestBody TicketEntity tick ,  @PathVariable("id") int id) {
		return tickserv.updateTicket(tick, id);
	}
	
	
	// delete Ticket
	@DeleteMapping("/{id}")
	public String deleteTicket(@PathVariable("id") int id) {
		return tickserv.deleteTicket(id);
	}

	
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handleNoSuchElementException(NoSuchElementException e) {
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);

	}
}
