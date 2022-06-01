package tema2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio16 {
	/*
	 * 	Queremos imprimir la factura realizada por un cliente en el restaurante.
	 * Por ejemplo:
	 * 
 Nombre: Jose Luis
---------------------------------------------------
Primer plato: 
arroz -> 5 euros

Segundo plato: 
pescado -> 10 euros

Postre: 
Flan -> 2 euros
---------------------------------------------------
Precio Comida: 17 euros
Iva (21%):  3,51 euros
---------------------------------------------------
Total: 20,51 euros

	 */
	public static void main(String[] args) {

		final double IVA = 0.21; // constante

		// variables
		String nombre ="";
		String primero ="";
		String segundo ="";
		String tercero ="";
		double precio1 = 0.0;
		double precio2 = 0.0;
		double precio3 = 0.0;
		double precioIVA = 0.0;
		double precioTotal = 0.0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("dame el nombre del cliente: ");
		nombre = sc.nextLine();
		
		System.out.println("dame el primer plato: ");
		primero = sc.nextLine();
		System.out.println("dame el precio del primer plato: ");
		precio1 = sc.nextDouble();
		// a veces se queda un salto de linea que hay limpiar
		sc.nextLine();
		
		System.out.println("dame el segundo plato: ");
		segundo = sc.nextLine();
		System.out.println("dame el precio del segundo plato: ");
		precio2 = sc.nextDouble();
		// a veces se queda un salto de linea que hay limpiar
		sc.nextLine();		
		
		System.out.println("dame el tercer plato: ");
		tercero = sc.nextLine();
		System.out.println("dame el precio del tercer plato: ");
		precio3 = sc.nextDouble();
		// a veces se queda un salto de linea que hay limpiar
		sc.nextLine();	
		
		double suma = precio1 + precio2 + precio3;
		precioIVA = suma * IVA;
		precioTotal = suma + precioIVA;
		
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("-----------------------------------");
		System.out.println("nombre: " + nombre);
		System.out.println(" primer plato:\t" + primero + " -> " + precio1+"€");
		System.out.println(" segundo plato:\t" + segundo + " -> " + precio2+"€");
		System.out.println(" tercer plato:\t" + tercero + " -> " + precio3+"€");
		System.out.println("-----------------------------------");
		System.out.println("\tTOTAL:\t" + df.format(suma)+"€");
		System.out.println("\tIVA:\t" + df.format(precioIVA)+"€");
		System.out.println("\tTOTAL A PAGAR:\t" + df.format(precioTotal)+"€");
		System.out.println("-----------------------------------");


		sc.close();
	}

}
