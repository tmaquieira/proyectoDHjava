package com.yesi.bapro.orm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="productos")
public class Productos {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nombre;
	private String descripcion;
	private Double precio;
	private String color;
	private Integer stock;

	public Productos() {
	}


	public Productos(Integer id, String descripcion, Integer stock, String nombre, Double precio, String color) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.stock = stock;
		this.nombre = nombre;
		precio = precio;
		this.color = color;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Integer getStock() {
		return stock;
	}


	public void setStock(Integer stock) {
		this.stock = stock;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Double getprecio() {
		return precio;
	}


	public void setprecio(Double precio) {
		precio = precio;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	

	

}
