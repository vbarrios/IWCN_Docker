package com.iwcn.master.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	private int reference;
	private int price;
	private int stock;
	public Producto(String name,int reference,int price,int stock)
	{
		this.setName(name);
		this.setReference(reference);
		this.setPrice(price);
		this.setStock(stock);
	}
}
