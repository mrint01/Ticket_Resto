package com.example.extend;

import javax.persistence.Entity;

import com.example.models.MetEntity;


@Entity
public class Dessert  extends MetEntity {

		
	public Dessert() {
		
	}
	

	public Dessert(String nom, double prix) {
		super(nom, prix);
	}

	
	
	
	
}
