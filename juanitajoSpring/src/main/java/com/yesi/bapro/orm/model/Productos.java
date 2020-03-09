package com.yesi.bapro.orm.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.validation.constraints.Pattern.Flag;

@Entity(name = "productos")
public class Productos {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@NotEmpty(message="El nombre del producto no puede estar vacío")
	@Size(min=2, max=30, message="El nombre debe contener entre 2 y 30 caracteres")
	private String nombre;
	@NotEmpty(message="La descripción del producto no puede estar vacía")
	@Size(min=20, max=200, message="La descripción debe contener entre 20 y 200 caracteres")
	private String descripcion;
	@NotNull(message="El precio no puede ser nulo")
	private Double precio;
	@NotNull(message="El stock no puede ser nulo")
	private Integer stock;
	@ManyToOne //pertenece a 1 categoria
	@JoinColumn(name="categoria_id")
	private Categoria categoria;
	@ManyToOne //pertenece a 1 categoria
	@JoinColumn(name="color_id")
	private Color color;
	@NotEmpty(message="La ruta de la foto no puede estar vacía")
	private String fotoProd;

	@ManyToMany(mappedBy ="carrito")
	private List<Usuario> usuarios;
	
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	
	public Productos() {
	}

	public Productos(Integer id, String nombre, String descripcion, Double precio, Color color, Integer stock, Categoria categoria, String fotoProd) { 
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.color = color;
		this.stock = stock;
		this.categoria = categoria;
		this.fotoProd = fotoProd;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}	

	public String getFotoProd() {
		return fotoProd;
	}

	public void setFotoProd(String fotoProd) {
		this.fotoProd = fotoProd;
	}
	
/*	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}*/
}