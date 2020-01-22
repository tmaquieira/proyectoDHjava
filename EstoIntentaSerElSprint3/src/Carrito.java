import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Carrito {
	private static Integer contadorCarritos = 0;
	private Integer idCarrito;
	private Usuario usuario;
	private ArrayList<Producto> unaListaDeProductos;

	public Carrito(Usuario usuario) {
		//para autoincrementar el id
		contadorCarritos += 1; // contadorCarritos = contadorCarritos + 1;
		this.idCarrito = contadorCarritos;
		this.unaListaDeProductos = new ArrayList<Producto>();
	}

	public Double mostrarTotal() {
		Double total = 0.0;
		Iterator<Producto> iterador = this.unaListaDeProductos.iterator();
		while (iterador.hasNext()) {
			Producto productoActual = iterador.next();
			total += productoActual.getPrecio();
		}
		return total;
	}

	public void finalizarCompra() {
		//el usuario debería indicar método de pago
		Operacion operacionActual = new Operacion("métodoPago", this);
		usuario.aniadirOperacion(operacionActual);
	}

	public void eliminarProducto(Producto unProducto) {
		unaListaDeProductos.remove(unProducto);
	}

	public void agregarProducto(Producto unProducto) {
		unaListaDeProductos.add(unProducto);
	}

	public void vaciarCarrito() {
		unaListaDeProductos = new ArrayList<Producto>();
	}

}
