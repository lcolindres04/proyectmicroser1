package com.microser.lc.cliente.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.microser.lc.cliente.entity.Clientes;

public interface IClientes {

	List<Clientes> findAll();
	Optional<Clientes> findById(Integer id);
	Clientes save(Clientes clientes);
	Clientes update(Integer id, Clientes clientes);
	Integer deleteById(Integer id);
	Clientes save1(Clientes clientes);
	Clientes update1(UUID id, Clientes clientes);
}
