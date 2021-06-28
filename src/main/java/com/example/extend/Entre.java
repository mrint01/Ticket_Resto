package com.example.extend;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.example.models.MetEntity;

@Entity
@Table(name="Entre")
public class Entre extends MetEntity {
	
	
	
	public Entre() {
		
	}


	public Entre(String nom, double prix) {
		super(nom, prix);
	}
	
	
	

}
