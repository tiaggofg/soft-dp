package com.soft.dp.api.model.service;

import java.util.List;

import com.soft.dp.api.model.entities.Funcionario;

public interface FuncionarioService {

	void save(Funcionario funcionario);
	void update(Funcionario funcionario);
	void delete(Long id);
	Funcionario findById(Long id);
	List<Funcionario> findAll();
	
}
