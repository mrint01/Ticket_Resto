package com.example.service;

import java.util.List;

import com.example.models.TableEntity;

public interface TableService {
	
	List<TableEntity> getAllTables();
	TableEntity getTableById(int id);
	TableEntity createTable(TableEntity  table);
	TableEntity updateTable(TableEntity table , int id);
	String deleteTable(int id);

}
