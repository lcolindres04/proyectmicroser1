package com.microser.lc.cliente.implementacion;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.microser.lc.cliente.entity.*;
import com.microser.lc.cliente.repository.*;
import com.microser.lc.cliente.service.*;

import jakarta.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesImplem implements IClientes {

	@Autowired
	protected ClientesRepository clientesRepository;

	@Override
	public List<Clientes> findAll() {
		return (List<Clientes>) clientesRepository.findAll();
	}

	@Override
	public Optional<Clientes> findById(Integer id) {
		return clientesRepository.findById(id);
	}

	@Override
	public Clientes save(Clientes cliente) {
		return clientesRepository.save(cliente);
	}

	@Override
	public Clientes update(Integer id, Clientes cliente) {
		Optional<Clientes> optionalCliente = clientesRepository.findById(id);
		if (optionalCliente.isPresent()) {
			Clientes existingCliente = optionalCliente.get();
			existingCliente.setNombre(cliente.getNombre());
			existingCliente.setEmail(cliente.getEmail());
			existingCliente.setTelefono(cliente.getTelefono());
			existingCliente.setDireccion(cliente.getDireccion());
			existingCliente.setNit(cliente.getNit());
			return clientesRepository.save(existingCliente);
		}
		throw new EntityNotFoundException("Cliente no encontrado");
	}

	@Override
	public Integer deleteById(Integer id) {
		if (!clientesRepository.existsById(id)) {
			throw new EntityNotFoundException("Cliente no encontrado");
		} else {
			clientesRepository.deleteById(id);
			return 204;
		}
	}

	@Override
	public Clientes save1(Clientes clientes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Clientes update1(UUID id, Clientes clientes) {
		// TODO Auto-generated method stub
		return null;
	}


}
