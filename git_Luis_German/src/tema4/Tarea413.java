package tema4;

/*
 * 1.	Vamos a dar un enfoque orientado a objetos al ejercicio 6 de la tarea la tarea 2.1. Define dentro de un paquete llamado ejercicio3, la siguiente clase llamada Menu:

Menu
//atributos
String nombreCliente =””;
String primerPlato =””;
Float precioPrimer = 0.0f;
String segundoPlato =””;
Float preciosegundo = 0.0f;
String postre =””;
Float precioPostre = 0.0f;

//métodos getters y setters
<define los métodos para coger/asignar los datos de cada atributo>

//otros métodos
float iva()    //devuelve el iva del menú
float total()    //devuelve el precio total del menú (incluyendo el iva)

void mostrarMenu() //devuelve la factura del menú
 

Ahora, en el mismo paquete, crea una clase llamada PruebaMenu que contenga un programa principal (método main):
•	Añade un objeto del tipo Menu
•	Lee por teclado el nombre del cliente, los datos del menú, y asígnalos a las variables miembro del objeto creado.
•	Ejecuta el método mostrarMenu() y muestra los datos del menu.

 * 
 
 * 
 */
import java.util.Scanner;

public class Tarea413 {

	public static void main(String[] args) {
		
		// voy a crear dos objetos de tipo Menu
		Menu menuDiario1 = new Menu("pepe", "arroz", 3.25, "pollo", 4.25,"cafe", 1.30);
		//double iva1 = menuDiario1.calcularIva();
		// double total1 = menuDiario1.calcularTotal();
		menuDiario1.mostrarFactura();
		//------------------------------------------------------------------
		Menu menuFinDeSemana = new  Menu();
		menuFinDeSemana.setNombre("juan");
		menuFinDeSemana.setNombrePrimero("ensalada");
		menuFinDeSemana.setPrecioPrimero(2.50);
		menuFinDeSemana.setNombreSegundo("pescado");
		menuFinDeSemana.setPrecioSegundo(5.80);
		menuFinDeSemana.setNombrePostre("flan");
		menuFinDeSemana.setPrecioPostre(2.75);
		//double iva2 = menuFinDeSemana.calcularIva();
		//double total2 = menuFinDeSemana.calcularTotal();
		menuFinDeSemana.mostrarFactura();
		//-----------------------------------------------------------------------
	}

}
