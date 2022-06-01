package tema3condicionales;

import java.util.Scanner;

public class Ejercicio36 {
/*
 * Haz un programa que pida tres números e indicar si el tercero es igual a la suma del primero y el segundo.
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

		double suma = x + y;
		if(suma != z)
		{
			System.out.println("la suma de los dos primeros números es distinto al tercer número");
			System.out.println(x + " + " + y + " != " + z);
		}
		else {
			System.out.println("la suma de los dos primeros números es igual al tercer número");
			System.out.println(x + " + " + y + " = " + z);
		}
		sc.close();
		
	}

}
