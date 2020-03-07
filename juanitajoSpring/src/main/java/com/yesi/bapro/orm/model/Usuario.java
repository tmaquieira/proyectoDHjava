package com.yesi.bapro.orm.model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Pattern.Flag;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity(name = "usuarios") 
//@table(name="usuarios") sin esta connotacion, la tabla se genera de 0
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //IDENTITY
	private Integer id;
	@NotEmpty(message="El nombre no puede estar vacío")
	@Size(min=2, max=30, message="El nombre debe tener entre 2 y 30 caracteres")
	private String nombre;
	@NotEmpty(message="El apellido no puede estar vacío")
	@Size(min=2, max=30, message="El apellido debe tener entre 2 y 30 caracteres")
	private String apellido;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@NotNull(message="La fecha de nacimiento no puede estar vacía")
	private Date fechaDeNacimiento;
	@NotEmpty(message="Debe elegir una nacionalidad")
	private String nacionalidad;
	@Column(nullable = false, unique = true)
	@NotEmpty(message="El DNI no puede estar vacío")
	private String dni;
	@NotEmpty(message="El domicilio no puede estar vacío")
	@Size(min=12, max=120, message="El domicilio debe tener entre 12 y 120 caracteres")
	private String domicilio;
	@NotEmpty(message="El teléfono fijo no puede estar vacío")
	@Size(min=12, max=12, message="El teléfono fijo debe tener 12 caracteres")
	private String telFijo;
	@NotEmpty(message="El celular no puede estar vacío")
	@Size(min=13, max=13, message="El celular debe tener 13 caracteres")
	private String telCelular;
	@NotEmpty(message="El mail no puede estar vacío")
	//@Pattern(message="No coincide con lo esperado", regexp = "^[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$", flags = Flag.UNICODE_CASE)
	@Email(message="No coincide con lo esperado")
	private String mail;
	@NotEmpty(message="La contraseña no puede estar vacía")
	@Pattern(message="No coincide con lo esperado", regexp = "^(?=.*\\d)(?=.*[\\u0021-\\u002b\\u003c-\\u0040])(?=.*[A-Z])(?=.*[a-z])\\S{8,16}$", flags = Flag.UNICODE_CASE)
	private String contrasenia;
	
	
	
	
	@JoinTable(
			name="carrito",
			joinColumns= @JoinColumn (name= "usuario_id", nullable= false),
			inverseJoinColumns = @JoinColumn (name= "carrito_id", nullable= false)
	
	)
	
	
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Productos> carrito;
	
	public Usuario() {
		this.carrito = new ArrayList<Productos>();
	}
	
	
	
	
	
	
	
	
	
	
	

	public Usuario(Integer id, String nombre, String apellido, Date fechaDeNacimiento, String nacionalidad, String dni,
			String domicilio, String telFijo, String telCelular, String mail, String contrasenia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.nacionalidad = nacionalidad;
		this.dni = dni;
		this.domicilio = domicilio;
		this.telFijo = telFijo;
		this.telCelular = telCelular;
		this.mail = mail;
		this.contrasenia = contrasenia;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getTelFijo() {
		return telFijo;
	}

	public void setTelFijo(String telFijo) {
		this.telFijo = telFijo;
	}

	public String getTelCelular() {
		return telCelular;
	}

	public void setTelCelular(String telCelular) {
		this.telCelular = telCelular;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}



















	public void addProduct (Productos producto)
	{
		if (this.carrito == null) {
			this.carrito = new ArrayList<>();
				
		} this.carrito.add(producto);
	}
	
	public List<Productos> getCarrito(){
		return this.carrito;
	}







}

