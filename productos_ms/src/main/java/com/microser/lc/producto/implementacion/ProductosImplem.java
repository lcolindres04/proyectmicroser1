package com.microser.lc.producto.implementacion;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.microser.lc.producto.service.*;
import com.microser.lc.producto.intity.*;
import com.microser.lc.producto.repository.*;

@Service
public class ProductosImplem implements IProductos {
	
	@Autowired
	protected ProductosRepository productosRepository;
	
	@Override
	public List<Productos> findAll() {
		return (List<Productos>) productosRepository.findAll();
	}
	
	   @Override
	    public Optional<Productos> findById(Integer idproducto) {
	        return productosRepository.findById(idproducto);
	    }
	
	
	@Override
	public Productos save(Productos productos) {
		return productosRepository.save(productos);
	}
	
	
	@Override
	public Productos update(Integer idProducto, Productos producto) {
		Optional<Productos> optionalProducto = productosRepository.findById(idProducto);
				if (optionalProducto.isPresent()) {
					Productos existingProducto = optionalProducto.get();
					existingProducto.setProducto(producto.getProducto());
					existingProducto.setDescripcion(producto.getDescripcion());
					existingProducto.setPrecio(producto.getPrecio());
					existingProducto.setStock(producto.getStock());
					return productosRepository.save(existingProducto);
				}
			return null;
	}
	
	@Override
	public Integer deleteById(Integer idProducto) {
	    if (!productosRepository.existsById(idProducto)) {
	        return 404; // Not Found
	    } else {
	        productosRepository.deleteById(idProducto);
	        return 204; // No Content
	    }
	}
	

}
