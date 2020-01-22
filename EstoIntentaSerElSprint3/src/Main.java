import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Usuario unUsuario = new Usuario("tumail@mail.com", "12345", "nombre", "apellido", 21333444);
		Carrito unCarrito = new Carrito(unUsuario);
		Producto unProducto = new Producto("Carterita Loca", "Cartera bien loca con muchos detalles absurdos", 1000.5, "Rosa");


	}

}
