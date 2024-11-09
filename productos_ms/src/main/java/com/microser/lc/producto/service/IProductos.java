package com.microser.lc.producto.service;

import java.util.List;
import java.util.Optional;

import com.microser.lc.producto.intity.*;

public interface IProductos {
	
	List<Productos> findAll();
	Optional<Productos> findById(Integer id_Producto);
	Productos save(Productos productos);
	Productos update(Integer id_Productos, Productos productos);
	Integer deleteById(Integer id);


}
