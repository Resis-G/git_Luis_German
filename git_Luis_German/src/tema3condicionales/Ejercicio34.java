package tema3condicionales;

import java.util.Scanner;

public class Ejercicio34 {
/*
 * 4.	Haz un programa que pida tres números y detecte si se han introducido en orden creciente.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("dame el primer número: ");
		double x = sc.nextDouble();
		sc.nextLine(); // esta orden es para limpiar el salto de línea
		
		System.out.println("dame el segundo número: ");
		double y = sc.nextDouble();
		sc.nextLine(); // esta orden es para limpiar el salto de línea
		
		System.out.println("dame el tercer número: ");
		double z = sc.nextDouble();
		sc.nextLine(); // esta orden es para limpiar el salto de línea

		if(x<=y && y<=z)
		{
			System.out.println("están orden ascendente. Mostrando los números: ");
			System.out.println("-> " + x + " -> " + y + " -> " + z);
		}
		else {
			System.out.println("no están en orden ascendente");
		}
		sc.close();
	}

}
