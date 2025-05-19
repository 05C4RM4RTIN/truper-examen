package com.truper.test.entity;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Orden {
	@Id
	@GeneratedValue
	private long Id;
	private Date fecha;
	private double total;
	@OneToMany
	private List<Producto> productos= new ArrayList<Producto>();
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	} 
 
	
}
