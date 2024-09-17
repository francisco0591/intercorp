package com.pe.app.libro.dto;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

public class AutorDTO implements Serializable{
	private long idautor;
    private String nombre;
	private String apellido;
	private String nacionalidad;
    private String fechanacimiento;
	public long getIdautor() {
		return idautor;
	}
	public void setIdautor(long idautor) {
		this.idautor = idautor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	
}
