package com.example.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.extend.Dessert;
import com.example.extend.Entre;
import com.example.extend.Plat;
import com.example.models.MetEntity;
import com.example.repository.DessertRepository;
import com.example.repository.EntreRepository;
import com.example.repository.MetRepository;
import com.example.repository.PlatRepository;

@Service
public class MetServiceIml implements MetService {

	private MetRepository metrepo;
	private EntreRepository metrepoentr;
	private PlatRepository metrepoplat;
	private DessertRepository metrepodess;

	public MetServiceIml() {

	}

	// constructor
	@Autowired
	public MetServiceIml(MetRepository metrepo, EntreRepository metrepoentr, PlatRepository metrepoplat,
			DessertRepository metrepodess) {
		super();
		this.metrepo = metrepo;
		this.metrepoentr = metrepoentr;
		this.metrepoplat = metrepoplat;
		this.metrepodess = metrepodess;
	}

	// create new Met Entre
	@Override
	public MetEntity createMetEntre(MetEntity meto) {

		MetEntity m = new Entre(meto.getNom(), meto.getPrix());
		return metrepoentr.save(m);

	}

	// create new Met Plat
	@Override
	public MetEntity createMetPlat(MetEntity meto) {

		MetEntity p = new Plat(meto.getNom(), meto.getPrix());

		return metrepoplat.save(p);

	}

	// create new Met Dessert
	@Override
	public MetEntity createMetDessert(MetEntity meto) {

		MetEntity d = new Dessert(meto.getNom(), meto.getPrix());

		return metrepodess.save(d);

	}

	// get all mets
	public List<MetEntity> getAllMets() {
		return metrepo.findAll();
	}

	// get met by id
	public MetEntity getMetByName(String name) {

		MetEntity met;
		Optional<MetEntity> opt = metrepo.findById(name);
		if (opt.isPresent())
			met = opt.get();
		else
			throw new NoSuchElementException("Met with this name is not found");

		return met;
	}

	// update met
	@Override
	public MetEntity updateMet(MetEntity met, String name) {
		MetEntity m = this.getMetByName(name);
		if (m.getNom() != null) {
			m.setNom(met.getNom());
		}
		if (m.getPrix() != 0) {
			m.setPrix(met.getPrix());
		}
		return metrepo.save(m);
	}

	// delete met
	@Override
	public String deleteMet(String name) {
		// MetEntity met = this.getMetByName(name);
		metrepo.deleteById(name);

		return " Deleted ";
	}

	// get all Plats
	public List<MetEntity> getAllPlat() {
		return metrepoplat.findAll();

	}

}
