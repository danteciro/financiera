package com.bolsadeideas.springboot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.springboot.backend.apirest.models.entity.DetalleVenta;
import com.bolsadeideas.springboot.backend.apirest.models.services.IDetalleVentaService;

@CrossOrigin(origins={"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class DetalleVentaRestController {
	
	@Autowired
	private IDetalleVentaService detalleVentaService;
	
	@GetMapping("/detalleVentas")
	public List<DetalleVenta> index(){
		return detalleVentaService.findAll();
	}
}
