package com.truper.test.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.truper.test.dto.ArticuloDTO;
import com.truper.test.dto.ProductoDTO;
import com.truper.test.entity.Orden;
import com.truper.test.service.TruperService;

@RestController
public class TruperController {
	
	private final TruperService truperService;	
	
	
	public TruperController(TruperService truperService) {
		super();
		this.truperService = truperService;
	}

	@PostMapping("/compra")
	public long compra(@RequestBody(required = true) List<ArticuloDTO> articulos) {
		return truperService.compra(articulos);
		
	}
	
	
	@GetMapping("/detail")
	public Orden obtieneCompra(@PathVariable long idCompra) {
		return truperService.obtieneCompra(idCompra);		
		
	}
	
	@PutMapping("/update")
	public void actualizaCompra(@RequestBody ProductoDTO dto) {
		actualizaCompra(dto);		
		
	}
}
