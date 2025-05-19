package com.truper.test.service;


import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.truper.test.dto.ArticuloDTO;
import com.truper.test.dto.ProductoDTO;
import com.truper.test.entity.Orden;
import com.truper.test.entity.Producto;

import repository.OrdenRepository;
import repository.ProductoRepository;

@Service
public class TruperService {
	
	private final ProductoRepository productoRepository;	
	private final OrdenRepository ordenRepository;
	
	public TruperService(ProductoRepository productoRepository, OrdenRepository ordenRepository) {
		super();
		this.productoRepository = productoRepository;
		this.ordenRepository = ordenRepository;
	}

	public long compra(List<ArticuloDTO> articulos) {
		
		Orden orden = new Orden();
		double total = 0;
		for (ArticuloDTO articulo : articulos) {
			Optional<Producto> producto = productoRepository.findById(articulo.getIdProducto());
			if(producto.isPresent()) {
				total = producto.get().getPrecio()*articulo.getCantidad();				
			}
			orden.setTotal(total);
			orden.setFecha(new Date());
		}		
		orden = ordenRepository.save(orden);
		
		return orden.getId();		
		
	}	
	
	public Orden obtieneCompra(long idOrden) {
		return ordenRepository.findById(idOrden).orElse(null);	
		
	}
	
	public void actualizaCompra(ProductoDTO dto) {
		
		Optional<Producto> productoOp = productoRepository.findById(dto.getId());
		productoOp.ifPresent(x->{
			x.setPrecio(dto.getCantidad());
			productoRepository.save(x);
		});
				
	}

}
