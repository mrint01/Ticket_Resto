package com.example.models;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="Met")
public class MetEntity {
	  
	@Id
	@Column(name="nom" , nullable = false)
	private String nom;
	
	@Column(name="prix" , nullable = false)
	private double prix;
	
	@ManyToMany(cascade = CascadeType.REMOVE)
	@JoinTable(name = "TicketMet" )
	@JsonIgnore
	private List<TicketEntity> tickets;
	
	
	
	public MetEntity() {
		
	}


	public MetEntity(String nom, double prix) {
		super();
		this.nom = nom;
		this.prix = prix;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public double getPrix() {
		return prix;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}


	public List<TicketEntity> getTickets() {
		return tickets;
	}


	public void setTickets(List<TicketEntity> tickets) {
		this.tickets = tickets;
	}

	
	
	
}
