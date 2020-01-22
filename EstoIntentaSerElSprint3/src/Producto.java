
public class Producto {
	
	private static Integer contadorProductos = 0;
	private Integer idProducto;
	private String nombreProducto;
	private String descripcion;
	private Double precio;
	private String color;

	public Producto(String nombreProducto, String descripcion, Double precio, String color) {
		contadorProductos += 1; 
		this.idProducto = contadorProductos;
		this.nombreProducto = nombreProducto;
		this.descripcion = descripcion;
		this.precio = precio;
		this.color = color;
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getPrecio() {
		return precio;
	}
	
	/* No se supo cómo resolver:
	public void buscarProductos() {
	}*/

}
