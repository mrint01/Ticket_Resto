package com.example.endpoint;

import java.time.LocalDateTime;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.models.ClientEntity;
import com.example.models.TableEntity;
import com.example.service.FunctionService;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/resto/function")
public class FunctionController {

	private FunctionService service;

	// constructor
	@Autowired
	public FunctionController(FunctionService service) {
		super();
		this.service = service;
	}

	// get Plat Most Buy
	@GetMapping("PlatMostDayBuy/{DateBegin}/{DateEnd}")
	public String getPlatMostBuy(@PathVariable("DateBegin") String DateB, @PathVariable("DateEnd") String DateE) {

		LocalDateTime DateBegin = LocalDateTime.parse(DateB);
		LocalDateTime DateEnd = LocalDateTime.parse(DateE);

		return service.getPlatMostBuy(DateBegin, DateEnd);
	}

	// get Most Loyal Client
	@GetMapping("/MostLoyalClient")
	public ClientEntity getMostLoyalClient() {
		return service.getMostLoyalClient();
	}

	// get Most Table Booked
	@GetMapping("/MostTableBooked")
	public TableEntity getMostTableBooked() {
		return service.getMostBookedTable();

	}

	// get Most Day Reserved For Client
	@GetMapping("/MostReservedDay/{id}")
	public String getMostReservedDay(@PathVariable("id") int id) {
		return service.getMostDayReservedForClient(id);

	}
	
	//  get Income Per Day Week Month
		@GetMapping("/IncomePerDayWeekMonth")
		public String getIncomePerDayWeekMonth() {
			return service.getIncomePerDayWeekMonth();

		}
		
		// get Income For Given Period
		@GetMapping("income/{DateBegin}/{DateEnd}")
		public String getIncomeForGivenPeriod(@PathVariable("DateBegin") String DateB, @PathVariable("DateEnd") String DateE) {
			
		
			LocalDateTime DateBegin = LocalDateTime.parse(DateB);
			LocalDateTime DateEnd = LocalDateTime.parse(DateE);
			
			return service.getIncomeForGivenPeriod(DateBegin, DateEnd);
		}

	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handleNoSuchElementException(NoSuchElementException e) {
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);

	}

}
