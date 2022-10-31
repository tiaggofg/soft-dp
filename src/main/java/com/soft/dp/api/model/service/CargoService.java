package com.soft.dp.api.model.service;

import java.util.List;

import com.soft.dp.api.model.entities.Cargo;

public interface CargoService {

	void save(Cargo cargo);
	void update(Cargo cargo);
	void delete(Long id);
	Cargo findById(Long id);
	List<Cargo> findAll();
	
}
