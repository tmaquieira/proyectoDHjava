import java.util.Date;

public class Main {

	public static void main(String[] args) {
		//crear usuario
		 Usuario unUsuario= new Usuario("tumail@mail.com","12345","nombre","apellido",21333444);
			//System.out.println("Igrese su usuario"+ unUsuario);
	   
		Carrito unCarrito = new Carrito(unUsuario);
			//System.out.println("Ingrese el producto:" + unCarrito);
		
		//Operacion unaOperacion = new Operacion(1,"tarjeta",10.50);
		//System.out.println("El valor de la factura es:" + una Operacion);
		
		Comprable unProducto = new Producto(1, "carterita loca","cartera bien loca",10.5,"rosa");
			//System.out.println("Ingrese el nombre del producto:" + unProducto);

		System.out.println("https://www.arquitecturajava.com/");

	/*
		Integer plata = 300;
		Integer comprable = 200;
		if(Comprable<plata) {
			System.out.println("Compra");
		}else if(comprable==plata) {
			System.out.println("La quiero");
		}else {
			System.out.println("Me quedo con las ganas");
		}
		
		cantiad=0;
		valorProducto=200;
		precioFinal=(valorProducto+cantidad);
        System.out.println("El valor de la factura es:"+ precioFinal);
		
	*/
	}
	

}
