package tema3condicionales;

import java.util.Scanner;

public class Ejercicio34 {
/*
 * 4.	Haz un programa que pida tres n�meros y detecte si se han introducido en orden creciente.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("dame el primer n�mero: ");
		double x = sc.nextDouble();
		sc.nextLine(); // esta orden es para limpiar el salto de l�nea
		
		System.out.println("dame el segundo n�mero: ");
		double y = sc.nextDouble();
		sc.nextLine(); // esta orden es para limpiar el salto de l�nea
		
		System.out.println("dame el tercer n�mero: ");
		double z = sc.nextDouble();
		sc.nextLine(); // esta orden es para limpiar el salto de l�nea

		if(x<=y && y<=z)
		{
			System.out.println("est�n orden ascendente. Mostrando los n�meros: ");
			System.out.println("-> " + x + " -> " + y + " -> " + z);
		}
		else {
			System.out.println("no est�n en orden ascendente");
		}
		sc.close();
	}

}
