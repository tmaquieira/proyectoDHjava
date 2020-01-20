import java.util.Date;

public class Operacion {
	private Integer idOperacion;
	private String metodoDePago;
	private Date fecha;
	private Double precioFinal;
	//claves foraneas
	private Usuario usuarioId;
	private Carrito carrito;
	
	 

	
	public Operacion(Integer idOperacion, String metodoDePago, Carrito carrito /*Double precioFinal*/) {
		this.idOperacion = idOperacion;
		this.metodoDePago = metodoDePago;
		this.fecha = new Date();
		this.precioFinal = precioFinal;
		this.carrito = carrito;
	}

	/*public Double calcularPrecio(){
		Double precioInicial = carrito.mostrarTotal();
		//APLICAR DESCUENTO

	}*/

	public Integer getIdOperacion() {
		return idOperacion;
	}

	public void setIdOperacion(Integer idOperacion) {
		this.idOperacion = idOperacion;
	}

	public String getMetodoDePago() {
		return metodoDePago;
	}

	public void setMetodoDePago(String metodoDePago) {
		this.metodoDePago = metodoDePago;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Double getPrecioFinal() {
		return precioFinal;
	}

	public void setPrecioFinal(Double precioFinal) {
		this.precioFinal = precioFinal;
	}
	public void emitirFactura() {
		System.out.println("Valor de la factura es:" + this.precioFinal);
	}
	
	

}
