package com.yesi.bapro.orm.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity(name = "usuarios") 
//@table(name="usuarios") sin esta connotacion, la tabla se genera de 0
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //IDENTITY
	private Integer id;
	@NotNull(message="El nombre no puede estar vacío")
	@NotEmpty(message="El nombre no puede estar vacío")
	@Size(min=2, max=30, message="El nombre debe tener entre 2 y 30 caracteres")
	private String nombre;
	@NotNull(message="El apellido no puede estar vacío")
	@Size(min=2, max=30, message="El apellido debe tener entre 2 y 30 caracteres")
	private String apellido;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@NotNull(message="La fecha de nacimiento no puede estar vacía")
	private Date fechaDeNacimiento;
	@NotNull(message="La nacionalidad no puede estar vacía")
	private String nacionalidad;
	@Column(nullable = false, unique = true)
	private String dni;
	private String domicilio;
	private String telFijo;
	private String telCelular;
	private String mail;
	private String contrasenia;

	public Usuario() {

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
}