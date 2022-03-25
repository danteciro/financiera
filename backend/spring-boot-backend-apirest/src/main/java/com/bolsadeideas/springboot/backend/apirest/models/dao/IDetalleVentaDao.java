package com.bolsadeideas.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.backend.apirest.models.entity.DetalleVenta;

public interface IDetalleVentaDao extends CrudRepository<DetalleVenta,Integer>{

}
