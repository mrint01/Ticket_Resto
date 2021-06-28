package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.models.ClientEntity;

public interface ClientRepository extends JpaRepository<ClientEntity, Integer> {

}
