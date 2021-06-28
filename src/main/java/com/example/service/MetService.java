package com.example.service;

import java.util.List;

import com.example.models.MetEntity;

public interface MetService {

	
	MetEntity createMetEntre(MetEntity met);
	MetEntity createMetPlat(MetEntity met);
	MetEntity createMetDessert(MetEntity met);
	List<MetEntity> getAllPlat();
	List<MetEntity> getAllMets(); 
	MetEntity getMetByName(String name);
	MetEntity updateMet(MetEntity met , String name);
	String deleteMet(String name);
}
