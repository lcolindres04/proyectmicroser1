package com.microser.lc.factura.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.microser.lc.factura.entity.Factura;

public interface FacturaRepository extends JpaRepository<Factura, Integer> {
	 Optional<Factura> findByNit(String nit);

}
