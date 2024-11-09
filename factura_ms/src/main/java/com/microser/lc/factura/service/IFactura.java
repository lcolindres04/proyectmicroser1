package com.microser.lc.factura.service;

import java.util.List;
import java.util.Optional;

import com.microser.lc.factura.DTO.FacturaRequest;
import com.microser.lc.factura.entity.Factura;

public interface IFactura {

	List<Factura> findAll();
	Optional<Factura> findByNit(String nit);
	Factura save(Factura factura);
	Factura update(Integer id, Factura factura);
	Factura crearFactura(FacturaRequest facturaRequest);
	Integer deleteById(Integer id);
	
		
	}
	
