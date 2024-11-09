package com.microser.lc.cliente.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import com.microser.lc.cliente.entity.*;

public interface ClientesRepository extends CrudRepository<Clientes, Integer> {
	Optional<Clientes> findByNit(String nit);

}
