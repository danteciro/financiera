package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.backend.apirest.models.dao.IVentaDao;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Venta;


@Service
public class VentaServiceImpl implements IVentaService{
	@Autowired
	private IVentaDao ventaDao;


	@Override
	@Transactional(readOnly=true)
	public List<Venta> findAll() {
		
			return (List<Venta>)ventaDao.findAll();
	}

	@Override
	@Transactional
	public Venta save(Venta venta) {
		return ventaDao.save(venta);
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		ventaDao.deleteById(id);
		
	}

	@Override
	@Transactional(readOnly=true)
	public Venta findById(Integer id){
		 
		return ventaDao.findById(id).orElse(null);
	}
}
