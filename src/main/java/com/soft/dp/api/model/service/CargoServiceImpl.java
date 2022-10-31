package com.soft.dp.api.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.soft.dp.api.model.dao.CargoDao;
import com.soft.dp.api.model.entities.Cargo;

@Service
@Transactional
public class CargoServiceImpl implements CargoService {

	@Autowired
	private CargoDao dao;
	
	public void save(Cargo cargo) {
		dao.save(cargo);
	}

	public void update(Cargo cargo) {
		dao.update(cargo);
	}

	public void delete(Long id) {
		dao.delete(id);
	}

	@Transactional(readOnly = true)
	public Cargo findById(Long id) {
		return dao.findById(id);
	}

	@Transactional(readOnly = true)
	public List<Cargo> findAll() {
		return dao.findAll();
	}
	
}
