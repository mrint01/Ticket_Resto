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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.models.ClientEntity;
import com.example.service.ClientService;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/resto/client")
public class ClientController {
	
	private ClientService clserv;

	// constructor 
	@Autowired
	public ClientController(ClientService clserv) {
		super();
		this.clserv = clserv;
	}
	
	// create client
	@PostMapping
	public ClientEntity createMetEntre(@RequestBody ClientEntity client){
		return clserv.createClient(client);
	}
	

	// get all clients
	@GetMapping
	public List<ClientEntity> getAllClients(){
		return clserv.getAllClient();
	}
	
	// get client by id
	@GetMapping("/{id}")
	public ClientEntity getClientById(@PathVariable("id") int id) {
		return clserv.getClientById(id);
			}
	
	// update Client
	@PutMapping("update/{id}")
	public ClientEntity updateClient(@RequestBody ClientEntity client ,  @PathVariable("id") int id) {
		return clserv.updateClient(client, id);
	}
	
	
	// delete client
	@DeleteMapping("/{id}")
	public ClientEntity deleteClient(@PathVariable("id") int id) {
		return clserv.deleteClient(id);
	}

	
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handleNoSuchElementException(NoSuchElementException e) {
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);

	}
	
	

}
