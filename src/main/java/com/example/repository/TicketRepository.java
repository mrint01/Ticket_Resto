package com.example.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.models.TicketEntity;

public interface TicketRepository extends JpaRepository<TicketEntity, Integer> {

	//List<TicketEntity> findByTables(TableEntity tab);
	
}
