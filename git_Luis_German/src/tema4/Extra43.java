package tema4;
/*
 * Clase Pedido:
 Atributos:
 TipoHamburguesa
 PrecioHamburguesa
 TipoComplemento
 PrecioComplemento
 
Los métodos de la clase son:
•	public double calcularPrecioPedido()
Para calcular el precio del pedido debes sumar el precio de la hamburguesa 
y el precio del complemento. Después calcula el IVA (21%) 
y devuelve el precio total del pedido.

•	public void mostrarPedido()
Muestra por pantalla los siguientes datos:
Precio de la hamburguesa
Precio del complemento
Precio IVA
Precio final del pedido.


•	public double calcularDescuento(String codigo)
Si el código insertado es “MAC15” realiza un descuento del 15% 
sobre el precio total del pedido. Devuelve el valor a descontar

Haz un programa de prueba utilizando la clase Pedido.

 * 
 */

public class Extra43 {

	public static void main(String[] args) {
		
		Pedido p1 = new Pedido("xxl",2,"patatas",3);
		double precioHamburguesa = p1.getPrecioHamburguesa();
		
		
		p1.setComplemento("coca cola");
		p1.setPrecioComplemento(2.5);
		double precioComplemento = p1.getPrecioComplemento();
		
		Pedido p2 = new Pedido("Mac pollo", 3.2, "coca cola", 2.5);
		p1.mostrarPedido();
		p2.mostrarPedido();
	}

}
