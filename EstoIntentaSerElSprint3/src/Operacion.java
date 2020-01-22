import java.util.Date;

public class Operacion {
	private static Integer contadorOperaciones = 0;
	private Integer idOperacion;
	private String metodoDePago;
	private Date fecha;
	private Double precioFinal;
	// claves foráneas?
	private Usuario usuarioId;
	private Carrito carrito;

	public Operacion(String metodoDePago, Carrito carrito) {
		contadorOperaciones += 1; 
		this.idOperacion = contadorOperaciones;
		this.metodoDePago = metodoDePago;
		this.fecha = new Date();
		this.precioFinal = carrito.mostrarTotal();
		this.carrito = carrito;
	}

	public Integer getIdOperacion() {
		return idOperacion;
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

	/*public void setPrecioFinal(Double precioFinal) {
		this.precioFinal = precioFinal;
	}*/

	public void emitirFactura() {
		System.out.println("Valor de la factura es:" + this.precioFinal);
	}

	/*
	 * public Double calcularPrecio(){ 
	 * Double precioInicial = carrito.mostrarTotal(); //APLICAR DESCUENTO
	 * 
	 * }
	 */
}
