
public class Producto implements Comprable {
private Integer idProducto;
private String nombreProducto;
private String descripcion;
private Double precio;
private String color;

public Producto(Integer idProducto, String nombreProducto, String descripcion, Double precio, String color) {
	this.idProducto = idProducto;
	this.nombreProducto = nombreProducto;
	this.descripcion = descripcion;
	this.precio = precio;
	this.color = color;
}

public Integer getIdProducto() {
	return idProducto;
}

public void setIdProducto(Integer idProducto) {
	this.idProducto = idProducto;
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
public void buscarProductos() {
}


	public Double getPrecio() {
		return precio;
	}



}




