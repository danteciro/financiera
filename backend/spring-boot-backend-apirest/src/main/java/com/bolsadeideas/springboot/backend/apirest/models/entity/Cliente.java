package com.bolsadeideas.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import oracle.sql.DATE;


@Entity
@Table(name="cliente")
public class Cliente implements Serializable{

@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CLI_SEQ")
@SequenceGenerator(sequenceName = "CLIENTES_SEQ", allocationSize = 1, name = "CLI_SEQ")
private Integer id;
private String nombres;
private String apellidos;
private String dni;
private String telefono;
private String email;

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getNombres() {
	return nombres;
}
public void setNombres(String nombres) {
	this.nombres = nombres;
}

public String getApellidos() {
	return apellidos;
}

public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}

public String getDni() {
	return dni;
}

public void setDni(String dni) {
	this.dni = dni;
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

private static final long serialVersionUID = 1L;

}
