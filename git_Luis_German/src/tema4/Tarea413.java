package tema4;

/*
 * 1.	Vamos a dar un enfoque orientado a objetos al ejercicio 6 de la tarea la tarea 2.1. Define dentro de un paquete llamado ejercicio3, la siguiente clase llamada Menu:

Menu
//atributos
String nombreCliente =��;
String primerPlato =��;
Float precioPrimer = 0.0f;
String segundoPlato =��;
Float preciosegundo = 0.0f;
String postre =��;
Float precioPostre = 0.0f;

//m�todos getters y setters
<define los m�todos para coger/asignar los datos de cada atributo>

//otros m�todos
float iva()    //devuelve el iva del men�
float total()    //devuelve el precio total del men� (incluyendo el iva)

void mostrarMenu() //devuelve la factura del men�
 

Ahora, en el mismo paquete, crea una clase llamada PruebaMenu que contenga un programa principal (m�todo main):
�	A�ade un objeto del tipo Menu
�	Lee por teclado el nombre del cliente, los datos del men�, y as�gnalos a las variables miembro del objeto creado.
�	Ejecuta el m�todo mostrarMenu() y muestra los datos del menu.

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
