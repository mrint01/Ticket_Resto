package com.example.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tablle")
public class TableEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="numero" , nullable = false)
	private int numero;
	
	@Column(name="nbcouvert"  , nullable = false)
	private int nbcouvert;
	
	@Column(name="type"  , nullable = false)
	private String type;
	
	@Column(name="supplement"  , nullable = false)
	private double supplement;
	
	
	@OneToMany(mappedBy = "tables" , cascade = CascadeType.REMOVE)
	private List<TicketEntity> tickets;
	
	
	public TableEntity(int numero, int nbcouvert, String type, double supplement) {
		super();
		this.numero = numero;
		this.nbcouvert = nbcouvert;
		this.type = type;
		this.supplement = supplement;
	}


	public TableEntity() {
		
	}
	

	public List<TicketEntity> getTickets() {
		return tickets;
	}

	public void setTickets(List<TicketEntity> tickets) {
		this.tickets = tickets;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNbcouvert() {
		return nbcouvert;
	}

	public void setNbcouvert(int nbcouvert) {
		this.nbcouvert = nbcouvert;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getSupplement() {
		return supplement;
	}

	public void setSupplement(double supplement) {
		this.supplement = supplement;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
