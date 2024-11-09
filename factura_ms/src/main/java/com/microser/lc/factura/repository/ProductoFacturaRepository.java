package com.microser.lc.factura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microser.lc.factura.entity.ProductoFactura;

@Repository
	public interface ProductoFacturaRepository extends JpaRepository<ProductoFactura, Integer> {
	    
	}


