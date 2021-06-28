package com.example.service;

import java.util.List;

import com.example.models.ClientEntity;

public interface ClientService {
	
	
	List<ClientEntity> getAllClient();
	ClientEntity getClientById(int id);
	ClientEntity createClient(ClientEntity client);
	ClientEntity updateClient(ClientEntity client , int id);
	ClientEntity deleteClient(int id);
	
	

}
