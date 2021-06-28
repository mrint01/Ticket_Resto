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

import com.example.models.MetEntity;
import com.example.service.MetService;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/resto/met")
public class MetController {

	private MetService metserv;

	@Autowired
	public MetController(MetService metserv) {
		super();
		this.metserv = metserv;
	}
	
	
	// create met entre
	@PostMapping("/entre")
	public MetEntity createMetEntre(@RequestBody MetEntity met){
		return metserv.createMetEntre(met);
	}
	
	// create met plat
	@PostMapping("/plat")
	public MetEntity createMetPlat(@RequestBody MetEntity met){
		return metserv.createMetPlat(met);
	}
	
	// create met dessert
	@PostMapping("/dessert")
	public MetEntity createMetDessert(@RequestBody MetEntity met){
		return metserv.createMetDessert(met);
	}
	
	
	// get all mets
	@GetMapping
	public List<MetEntity> getAllMets(){
		return metserv.getAllMets();
	}
	
	// get met by id
	@GetMapping("/{name}")
	public MetEntity getMetByName(@PathVariable("name") String name) {
		return metserv.getMetByName(name);
			}
	
	// update met
	@PutMapping("update/{name}")
	public MetEntity updateTicket(@RequestBody MetEntity met ,  @PathVariable("name") String name) {
		return metserv.updateMet(met, name);
	}
	
	
	// delete met
	@DeleteMapping("/{name}")
	public String deleteTicket(@PathVariable("name") String name) {
		return metserv.deleteMet(name);
	}

	
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handleNoSuchElementException(NoSuchElementException e) {
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);

	}
	
	
	
	
	
	
}
