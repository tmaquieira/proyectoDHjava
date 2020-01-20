import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Carrito {
	private static Integer contadorCarritos = 0;
	private Integer idCarrito;
	//private List<Comprable> listaDeProductosAComprar;
	private Usuario usuario;
	private ArrayList<Producto> unaListaDeProductos;


	public Carrito(Usuario usuario) {
		//TODO: Verificar que esto funcione bien para autoincrementar el id
		contadorCarritos += 1;	//contadorCarritos = contadorCarritos + 1;
		this.idCarrito = contadorCarritos;
		this.unaListaDeProductos = new ArrayList<Producto>();
		//this.listaDeProductosAComprar = listaDeProductosAComprar;
	}
	
	public Double mostrarTotal() {
		Double total = 0.0;
		Iterator<Producto> iterador = this.unaListaDeProductos.iterator();
		while(iterador.hasNext()){
			Producto productoActual = iterador.next();
			total += productoActual.getPrecio();
		}
		return total;
	}
	
	public void finalizarCompra() {
		//Necesitamos que el usuario indique el metodo de pago
		//Validar que to-do salga bien para recién ahí genere una nueva operación
		Operacion operacionActual = new Operacion(idCarrito, "e", this);
		usuario.aniadirOperacion(operacionActual);
	}
	
	public void eliminarProducto(Producto unProducto) {
		unaListaDeProductos.remove(unProducto);
	}

	public void agregarProducto(Producto unProducto){
		unaListaDeProductos.add(unProducto);
	}
	public void vaciarCarrito(){
		unaListaDeProductos = new ArrayList<Producto>();
	}



}
