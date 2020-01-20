import java.util.ArrayList;
import java.util.List;

public class Usuario {
	//Variables
	private Integer idUsuario;
	private String mail;
	private String contrasena;
	private String nombre;
	private String apellido;
	private Integer numeroDoc;
	private List<Operacion> listaDeCompras;
	private List<Producto> carrito; // hace falta un array list de productos o solo instanciaria Carrito carrito?
	private ArrayList<Usuario> carteraDeClientes;
	
	//Constructor Completo
	public Usuario(String mail, String contrasena, String nombre, String apellido, Integer numeroDoc) {
		this.mail = mail;
		this.contrasena = contrasena;
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroDoc = numeroDoc;
		this.listaDeCompras = new ArrayList<Operacion>();
		this.carrito = new ArrayList<Producto>();
	}

	//Getters & Setters

	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getContrasena() {
		return contrasena;
	}


	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
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


	public Integer getNumeroDoc() {
		return numeroDoc;
	}


	public void setNumeroDoc(Integer numeroDoc) {
		this.numeroDoc = numeroDoc;
	}
	
	
	/*public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}*/
	//metodos o responsabilidades

	/*public void registrarse(String mail, String contrasena, String nombre, String apellido, Integer numeroDoc) {
		Usuario nuevoUsuario = null;
		carteraDeClientes = new ArrayList<Usuario>();
		carteraDeClientes.add(nuevoUsuario);
	}
	public boolean loguearse() {

		private boolean tieneDescuento() {
			return porcentajeDescuento != null && porcentajeDescuento > 0;
		}
	}
		
	}*/
	public void consultarOperaciones() {
		
	}

	public void aniadirOperacion(Operacion e) {
		listaDeCompras.add(e);
	}
}
