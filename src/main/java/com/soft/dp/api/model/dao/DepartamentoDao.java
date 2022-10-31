package com.soft.dp.api.model.dao;

import java.util.List;

import com.soft.dp.api.model.entities.Departamento;

public interface DepartamentoDao {

	void save(Departamento departamento);
	void update(Departamento departamento);
	void delete(Long id);
	Departamento findById(Long id);
	List<Departamento> findAll();
	
}
