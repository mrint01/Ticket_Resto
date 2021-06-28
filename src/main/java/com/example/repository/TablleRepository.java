package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.models.TableEntity;

public interface TablleRepository extends JpaRepository<TableEntity, Integer> {

	//TableEntity findById(int numero);
}
