package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.backend.apirest.models.dao.IDetalleVentaDao;
import com.bolsadeideas.springboot.backend.apirest.models.entity.DetalleVenta;

@Service
public class DetalleVentaServiceImpl implements IDetalleVentaService{

	@Autowired
	private IDetalleVentaDao detalleVentaDao;
	

	@Override
	@Transactional(readOnly=true)
	public List<DetalleVenta> findAll() {
		return (List<DetalleVenta>)detalleVentaDao.findAll();
	}

}
