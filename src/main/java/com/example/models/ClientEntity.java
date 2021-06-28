package com.example.models;

import java.util.Date;
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
@Table(name="client")
public class ClientEntity {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@Column(name="nom" , nullable = false)
	private String nom;
	
	@Column(name="prenom" , nullable = false)
	private String prenom;
	
	@Column(name="dateNais"  , nullable = false)
	private Date dateNais;
	
	@Column(name="couriel")
	private String couriel;
	
	@Column(name="tel")
	private String tel;
	
	
	@OneToMany(mappedBy = "clients" , cascade = CascadeType.REMOVE)
	private List<TicketEntity> ticketClient;
	
	
	
	
	
	

	public List<TicketEntity> getTicketClient() {
		return ticketClient;
	}

	public void setTicketClient(List<TicketEntity> ticketClient) {
		this.ticketClient = ticketClient;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateNais() {
		return dateNais;
	}

	public void setDateNais(Date dateNais) {
		this.dateNais = dateNais;
	}

	public String getCouriel() {
		return couriel;
	}

	public void setCouriel(String couriel) {
		this.couriel = couriel;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
	
	
	
}
