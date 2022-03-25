package com.bolsadeideas.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="venta")
public class Venta implements Serializable{

@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VENT_SEQ")
@SequenceGenerator(sequenceName = "VENTA_SEQ", allocationSize = 1, name = "VENT_SEQ")
private Integer id;


@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name="id_cliente")
private Cliente cliente;

private Date fecha;

@PrePersist
public void prePersist(){
	java.util.Date date = new java.util.Date();
	fecha=new Date(date.getTime());
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}



public Cliente getCliente() {
	return cliente;
}

public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}

public Date getFecha() {
	return fecha;
}

public void setFecha(Date fecha) {
	this.fecha = fecha;
}



private static final long serialVersionUID = 1L;
}
