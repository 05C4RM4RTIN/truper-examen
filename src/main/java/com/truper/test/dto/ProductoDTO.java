package com.truper.test.dto;

import lombok.Data;

@Data
public class ProductoDTO {
	
	private long id;
	private double cantidad;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

}
