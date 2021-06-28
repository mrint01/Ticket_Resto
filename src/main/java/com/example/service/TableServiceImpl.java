package com.example.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.TableEntity;
import com.example.repository.TablleRepository;

@Service
public class TableServiceImpl implements TableService {

	private TablleRepository tablerepo;
	
	// constructor
	@Autowired
	public TableServiceImpl(TablleRepository tablerepo) {
		super();
		this.tablerepo = tablerepo;
	}

	// create new table
	@Override
	public TableEntity createTable(TableEntity table) {
		return tablerepo.save(table);
	}
	
	
	// get all tables
	@Override
	public List<TableEntity> getAllTables() {
		return tablerepo.findAll();
	}

	
	// find table by id
	@Override
	public TableEntity getTableById(int id) {
		TableEntity entity;
		Optional<TableEntity> opt = tablerepo.findById(id);
		if(opt.isPresent())
			entity = opt.get();
		else
			throw new NoSuchElementException("table with this id is not found");
		
		return entity;
	}

	

	// update table by id
	@Override
	public TableEntity updateTable(TableEntity table, int id) {
		TableEntity oldtable = this.getTableById(id);
		if(table.getNumero() != 0 ) {
			oldtable.setNumero(table.getNumero());
		}
		if(table.getNbcouvert() != 0 ) {
			oldtable.setNbcouvert(table.getNbcouvert());
		}
		if(table.getType() != null ) {
			oldtable.setType(table.getType());
		}
		if(table.getSupplement() != 0 ) {
			oldtable.setSupplement(table.getSupplement());
		}
		
		tablerepo.save(oldtable);
		
		
		return oldtable;
	}

	// delete table by id
	@Override
	public String deleteTable(int id) {
		TableEntity entityToDelete = getTableById(id);
		tablerepo.delete(entityToDelete);
		return " Deleted ";
		
	}

}
