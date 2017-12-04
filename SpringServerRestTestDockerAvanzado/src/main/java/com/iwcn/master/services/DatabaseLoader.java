package com.iwcn.master.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.iwcn.master.entities.Producto;
import com.iwcn.master.repositories.ProductoRepository;


@Component
public class DatabaseLoader {
	
	@Autowired
	private ProductoRepository productoRepository;
	   
        
    public void addProduct(String name,int reference,int price,int stock)
    {
    	Producto newProducto = new Producto(name,reference,price,stock);
    	productoRepository.save(newProducto);
    }
  
    public void removeProduct(int id)
    {
    	Producto newProducto = productoRepository.findById(id);
    	productoRepository.delete(newProducto.getId());
    }
  
    public Producto getProduct(int id)
    {
    	return productoRepository.findById(id);
    	
    }
   
    public List<Producto> getAll(){
    	ArrayList<Producto> productos = new ArrayList<>();
    	for (Producto p : productoRepository.findAll()) {
    		productos.add(p);
    	}
    	return productos;
    }
    
    public void editProduct(String name,int reference,int price,int stock,int id) {
    	Producto editProd = this.productoRepository.findById(id);
    	editProd.setName(name);
    	editProd.setReference(reference);
    	editProd.setPrice(price);
    	editProd.setStock(stock);
    	editProd.setId(id);
    	productoRepository.save(editProd);
    }    

}
