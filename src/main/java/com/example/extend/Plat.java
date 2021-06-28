package com.example.extend;

import javax.persistence.Entity;

import com.example.models.MetEntity;


@Entity
public class Plat  extends MetEntity {

	public Plat() {
		
	}
	
	public Plat(String nom, double prix) {
		super(nom, prix);
	}
	
	
	
	
}
