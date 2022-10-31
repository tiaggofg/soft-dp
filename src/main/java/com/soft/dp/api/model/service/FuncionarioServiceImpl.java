package com.soft.dp.api.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.soft.dp.api.model.dao.FuncionarioDao;
import com.soft.dp.api.model.entities.Funcionario;

@Service
@Transactional
public class FuncionarioServiceImpl implements FuncionarioService {

	@Autowired
	private FuncionarioDao dao;
	
	public void save(Funcionario funcionario) {
		dao.save(funcionario);
	}

	public void update(Funcionario funcionario) {
		dao.update(funcionario);
	}

	public void delete(Long id) {
		dao.delete(id);
	}

	@Transactional(readOnly = true)
	public Funcionario findById(Long id) {
		return dao.findById(id);
	}

	@Transactional(readOnly = true)
	public List<Funcionario> findAll() {
		return dao.findAll();
	}

}
