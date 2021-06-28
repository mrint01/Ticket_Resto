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
import org.springframework.web.bind.annotation.RestController;

import com.example.models.TableEntity;
import com.example.service.TableService;

@RestController
@RequestMapping("/api/resto/table")
public class TableController {

	
	private TableService tableserv;

	@Autowired
	public TableController(TableService tableserv) {
		super();
		this.tableserv = tableserv;
	}
	

	// get all tables
	@GetMapping
	public List<TableEntity> getAll(){
		return tableserv.getAllTables();
	}
	
	// create new table
	@PostMapping
	public TableEntity createTable(@RequestBody TableEntity table){
		return tableserv.createTable(table);
	}
	
	// update table
	@PutMapping("update/{id}")
	public TableEntity updateTable(@RequestBody TableEntity table , @PathVariable("id") int id ) {
		return tableserv.updateTable(table, id);
	}
	
	// get table by id
	@GetMapping("/{id}")
	public TableEntity getTableById(@PathVariable("id") int id) {
		return tableserv.getTableById(id);
	}
	
	
	// delete table
	@DeleteMapping("/{id}")
	public String deleteTicket(@PathVariable("id") int id) {
		return tableserv.deleteTable(id);
	}

	
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handleNoSuchElementException(NoSuchElementException e) {
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);

	}
	
	
	
	
	
}
