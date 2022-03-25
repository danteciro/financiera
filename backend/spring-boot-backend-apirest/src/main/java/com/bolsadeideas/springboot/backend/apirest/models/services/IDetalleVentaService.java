package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;

import com.bolsadeideas.springboot.backend.apirest.models.entity.DetalleVenta;

public interface IDetalleVentaService {
	
	public List<DetalleVenta> findAll();
	
}
