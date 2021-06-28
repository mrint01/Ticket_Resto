package com.example.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.ClientEntity;
import com.example.models.TableEntity;
import com.example.models.TicketEntity;
import com.example.repository.ClientRepository;
import com.example.repository.TablleRepository;
import com.example.repository.TicketRepository;


@Service
public class FunctionServiceIml implements FunctionService {

	TicketRepository ticrepo;
	ClientRepository clreo;
	TablleRepository tabrepo;
	ClientService clserv;
	TicketService ticserv;
	MetService metserv;
	
	// Constructor
	@Autowired
	public FunctionServiceIml(TicketRepository ticrepo , ClientRepository clreo , 
			TablleRepository tabrepo , ClientService clserv, TicketService ticserv , MetService metserv) {
		super();
		this.ticrepo = ticrepo;
		this.clreo = clreo;
		this.tabrepo = tabrepo;
		this.clserv = clserv;
		this.ticserv = ticserv;
		this.metserv= metserv;
	}
	
	
	// get Plat Most Buy
	@Override
	public String getPlatMostBuy(LocalDateTime DateBegin, LocalDateTime DateEnd) {
		
		List<TicketEntity> ticlist = ticrepo.findAll();
		ArrayList<String> platlist = new ArrayList<>();
		
		for(int i=0;i<ticlist.size();i++) {
			if(ticlist.get(i).getDate().isBefore(DateEnd) && ticlist.get(i).getDate().isAfter(DateBegin) && ticlist.get(i).getMets() != null) {
				for(int k=0;k<ticlist.get(i).getMets().size();k++) {
						platlist.add(ticlist.get(i).getMets().get(k).getNom());
					}
				}
			}
		/*
		for(int i=0; i<platlist.size();i++) {
			for(int j=0;j<metserv.getAllPlat().size();j++) {
				if(platlist.get(i).equals(metserv.getAllPlat().get(j).getNom())) {
					
				}
			}
		}*/
		String occurrences = 
				platlist.stream()
		          .collect(Collectors.groupingBy(w -> w, Collectors.counting()))
		          .entrySet()
		          .stream()
		          .max(Comparator.comparing(java.util.Map.Entry::getValue))
		          .get()
		          .getKey();
		
		return occurrences;
	}

	

	// get Most Loyal Client
	@Override
	public ClientEntity getMostLoyalClient() {
		ClientEntity  mostclientloyal;
		mostclientloyal = clreo.findAll().stream()
										   .max(Comparator.comparing(g ->((ClientEntity) g).getTicketClient().size()))
										   .orElseThrow(() -> new RuntimeException("Empty"));
		
		return mostclientloyal;
	}

	
	
	// get Most Table Booked
	@Override
	public TableEntity getMostBookedTable() {
		TableEntity mosttablebooked;
		mosttablebooked = tabrepo.findAll().stream()
										   .max(Comparator.comparing(g ->((TableEntity) g).getTickets().size()))
										   .orElseThrow(() -> new RuntimeException("Empty"));
		return mosttablebooked;
	}

	
	
	// get Most Day Reserved
	@Override
	public String getMostDayReservedForClient(int id) {
		List<TicketEntity> tics;
		ArrayList<String> days = new ArrayList<>();
		tics = clserv.getClientById(id).getTicketClient();
		for(int i=0; i<tics.size();i++) {
			days.add(tics.get(i).getDate().getDayOfWeek().toString());
		}
		String occurrences = 
				days.stream()
		          .collect(Collectors.groupingBy(w -> w, Collectors.counting()))
		          .entrySet()
		          .stream()
		          .max(Comparator.comparing(java.util.Map.Entry::getValue))
		          .get()
		          .getKey();
		
		return occurrences;
	}

	
	
	// get Income Per Day Week Month
	@Override
	public String getIncomePerDayWeekMonth() {
		List<TicketEntity> tics = ticrepo.findAll();
		double additionPerDay =0 ,additionPerWeek=0 ,additionPerMonth=0;
		String Msg = "";
		for(int i=0;i<tics.size();i++) {
			if(tics.get(i).getDate().getDayOfWeek().toString().equals(LocalDateTime.now().getDayOfWeek().toString())) {
				additionPerDay = additionPerDay + tics.get(i).getAddition();
			}
			if(tics.get(i).getDate().isBefore(LocalDateTime.now()) && tics.get(i).getDate().isAfter(LocalDateTime.now().plusDays(-7))) {
				additionPerWeek = additionPerWeek + tics.get(i).getAddition();
			}
			if(tics.get(i).getDate().isBefore(LocalDateTime.now()) && tics.get(i).getDate().isAfter(LocalDateTime.now().plusMonths(-1))) {
				additionPerMonth = additionPerMonth + tics.get(i).getAddition();
			}
		}
		Msg = "Revenue Par Jour : " + additionPerDay + "\nRevenue Par Semaine : " +additionPerWeek+ " \nRevenue Par Mois : " +additionPerMonth+ "\n";
		return Msg;
	}

	
	
	// get Income For Given Period
	@Override
	public String getIncomeForGivenPeriod(LocalDateTime DateBegin, LocalDateTime DateEnd) {
		List<TicketEntity> tics = ticrepo.findAll();
		double addition =0;
		String Msg = "";
		for(int i=0;i<tics.size();i++) {
			if(tics.get(i).getDate().isBefore(DateEnd) && tics.get(i).getDate().isAfter(DateBegin)) {
				addition = addition + tics.get(i).getAddition();
			}
		}
		Msg = "Revenue  de  "+DateBegin+ " a " +DateEnd+ " : " + addition + "\n";
		
		return Msg;
	}

}
