package com.soft.dp.api.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.soft.dp.api.model.dao.DepartamentoDao;
import com.soft.dp.api.model.entities.Departamento;

@Service
@Transactional
public class DepartamentoServiceImpl implements DepartamentoService {

	@Autowired
	private DepartamentoDao dao;

	public void save(Departamento departamento) {
		dao.save(departamento);
	}

	public void update(Departamento departamento) {
		dao.update(departamento);
	}

	public void delete(Long id) {
		dao.delete(id);
	}

	@Transactional(readOnly = true)
	public Departamento findById(Long id) {
		return dao.findById(id);
	}

	@Transactional(readOnly = true)
	public List<Departamento> findAll() {
		return dao.findAll();
	}
	
}
