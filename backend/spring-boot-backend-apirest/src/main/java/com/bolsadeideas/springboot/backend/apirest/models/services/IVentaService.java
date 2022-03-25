package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Venta;

public interface IVentaService {

	public List<Venta> findAll();
	public Venta save(Venta venta);
	public void delete(Integer id);
	public Venta findById(Integer id);
	
}
