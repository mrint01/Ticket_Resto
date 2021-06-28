package com.example.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.ClientEntity;
import com.example.models.MetEntity;
import com.example.models.TableEntity;
import com.example.models.TicketEntity;
import com.example.repository.ClientRepository;
import com.example.repository.MetRepository;
import com.example.repository.TablleRepository;
import com.example.repository.TicketRepository;

@Service
public class ClientServiceIml implements ClientService {

	private ClientRepository clrepo;
	private TicketRepository tickrepo;
	private MetRepository metrepo;
	private TablleRepository tabrepo;

	// constructor
	@Autowired
	public ClientServiceIml(ClientRepository clrepo, TicketRepository tickrepo, MetRepository metrepo , TablleRepository tabrepo) {
		super();
		this.clrepo = clrepo;
		this.tickrepo = tickrepo;
		this.metrepo = metrepo;
		this.tabrepo = tabrepo;
	}

	// get all client
	@Override
	public List<ClientEntity> getAllClient() {
		return clrepo.findAll();
	}

	// get client by id
	@Override
	public ClientEntity getClientById(int id) {
		ClientEntity entity;
		Optional<ClientEntity> opt = clrepo.findById(id);
		if (opt.isPresent())
			entity = opt.get();
		else
			throw new NoSuchElementException("client with this id is not found");

		return entity;
	}

	public static ClientEntity oldclient;

	// create client with his ticket
	@Override
	public ClientEntity createClient(ClientEntity client) {

		int nb = 0;

		for (int i = 0; i < this.getAllClient().size(); i++) {
			if (this.getAllClient().get(i).getTel().equals(client.getTel())
					&& !this.getAllClient().get(i).getTel().equals("")) {
				nb++;
				oldclient = this.getAllClient().get(i);

			}
		}
		if (nb == 0) {
			// save client
			ClientEntity newClient = clrepo.save(client);
			// save ticket
			for (TicketEntity ticket : client.getTicketClient()) {
				ticket.setClients(newClient);
				tickrepo.save(ticket);

			}
			// save mets
			List<TicketEntity> ticketlist = client.getTicketClient();
			for (int i = 0; i < ticketlist.size(); i++) {
				for (MetEntity met : client.getTicketClient().get(i).getMets()) {
					met.setTickets(ticketlist);
					metrepo.save(met);

				}

			}
		
			
			

		} else {
			// save ticket to client already exist
			for (TicketEntity ticket : client.getTicketClient()) {
				ticket.setClients(oldclient);
				tickrepo.save(ticket);

			}
			// save mets
			List<TicketEntity> ticketlist = client.getTicketClient();
			for (int i = 0; i < ticketlist.size(); i++) {
				for (MetEntity met : client.getTicketClient().get(i).getMets()) {
					met.setTickets(ticketlist);
					metrepo.save(met);

				}

			}
			// save table
			List<TicketEntity> ticketlist2 = client.getTicketClient();
			List<TableEntity> tablelist =  tabrepo.findAll();
			for (int i = 0; i < ticketlist2.size(); i++) {
				client.getTicketClient().get(i).setTables(tablelist.get(i));
				tickrepo.save(ticketlist2.get(i));
			}
			ticketlist2.removeAll(ticketlist2);
			tablelist.removeAll(tablelist);
			
		}

		return client;
	}

	// update client
	@Override
	public ClientEntity updateClient(ClientEntity client, int id) {
		ClientEntity oldclient = this.getClientById(id);
		if (client.getNom() != null) {
			oldclient.setNom(client.getNom());
		}
		if (client.getPrenom() != null) {
			oldclient.setPrenom(client.getPrenom());
		}
		if (client.getDateNais() != null) {
			oldclient.setDateNais(client.getDateNais());
		}
		if (client.getCouriel() != null) {
			oldclient.setCouriel(client.getCouriel());
		}
		if (client.getTel() != null) {
			oldclient.setTel(client.getTel());
		}
		return clrepo.save(oldclient);
	}

	// delete client with his ticket 
	@Override
	public ClientEntity deleteClient(int id) {
		ClientEntity cl = this.getClientById(id);
		clrepo.deleteById((int) id);
		
		
	/*
		for (int j = 0; j < cl.getTicketClient().size(); j++) {
			if(cl.getTicketClient().get(j).getMets().get(j) != null) {
				metrepo.delete(cl.getTicketClient().get(j).getMets().get(j));
			}
		}
		for (int i = 0; i < cl.getTicketClient().size(); i++) {
			cl.getTicketClient().get(i).setTables(null);
			tickrepo.delete(cl.getTicketClient().get(i));
		}

		clrepo.delete(cl);*/
		
		return  cl;
	}

}
