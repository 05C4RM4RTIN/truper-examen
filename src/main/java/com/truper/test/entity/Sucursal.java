package com.truper.test.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Sucursal {
	@Id
	private long id;
	private String nombre;
	@OneToMany
	private List<Orden> ordenes= new ArrayList<Orden>();
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Orden> getOrdenes() {
		return ordenes;
	}
	public void setOrdenes(List<Orden> ordenes) {
		this.ordenes = ordenes;
	}

	
}
