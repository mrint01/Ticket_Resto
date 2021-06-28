package com.example.models;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="ticket")
public class TicketEntity {

	
	
	@Id
	@Column(name="numero")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numero;
	
	@Column(name="date" , nullable = false)
	private LocalDateTime date;
	
	@Column(name="ncouvert" , nullable = false)
	private int ncouvert;
	
	@Column(name="addition" , nullable = false)
	private double addition;
	
	@ManyToOne(cascade = CascadeType.REMOVE)
	@JsonIgnore
	private TableEntity tables;
	
	
	@ManyToOne(cascade = CascadeType.REMOVE)
	@JsonIgnore
	private ClientEntity clients;
	
	
	@ManyToMany(mappedBy = "tickets"  , cascade = CascadeType.REMOVE)
	private List<MetEntity> mets;
	

	public TicketEntity() {
		
	}
	
	
	

	
	public TableEntity getTables() {
		return tables;
	}

	public void setTables(TableEntity tables) {
		this.tables = tables;
	}

	public ClientEntity getClients() {
		return clients;
	}

	public void setClients(ClientEntity clients) {
		this.clients = clients;
	}

	public List<MetEntity> getMets() {
		return mets;
	}

	public void setMets(List<MetEntity> mets) {
		this.mets = mets;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	

	public LocalDateTime getDate() {
		return date;
	}





	public void setDate(LocalDateTime date) {
		this.date = date;
	}





	public int getNcouvert() {
		return ncouvert;
	}

	public void setNcouvert(int ncouvert) {
		this.ncouvert = ncouvert;
	}

	public double getAddition() {
		return addition;
	}

	public void setAddition(double addition) {
		this.addition = addition;
	}
	
	
	
	
	
	
	
	
}
