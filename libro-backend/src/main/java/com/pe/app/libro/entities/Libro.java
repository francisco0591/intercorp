package com.pe.app.libro.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table(name="Libro")
public class Libro {
	
	@Id
	private long idlibro;
    private String titulo;
	private String paginas;
	private String fechapublicacion;
    private String genero;
    private int idautor;
	public long getIdlibro() {
		return idlibro;
	}
	public void setIdlibro(long idlibro) {
		this.idlibro = idlibro;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getPaginas() {
		return paginas;
	}
	public void setPaginas(String paginas) {
		this.paginas = paginas;
	}
	public String getFechapublicacion() {
		return fechapublicacion;
	}
	public void setFechapublicacion(String fechapublicacion) {
		this.fechapublicacion = fechapublicacion;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getIdautor() {
		return idautor;
	}
	public void setIdautor(int idautor) {
		this.idautor = idautor;
	}
	
	
}

