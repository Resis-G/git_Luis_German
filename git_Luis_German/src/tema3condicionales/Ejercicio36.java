package tema3condicionales;

import java.util.Scanner;

public class Ejercicio36 {
/*
 * Haz un programa que pida tres n�meros e indicar si el tercero es igual a la suma del primero y el segundo.
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

		double suma = x + y;
		if(suma != z)
		{
			System.out.println("la suma de los dos primeros n�meros es distinto al tercer n�mero");
			System.out.println(x + " + " + y + " != " + z);
		}
		else {
			System.out.println("la suma de los dos primeros n�meros es igual al tercer n�mero");
			System.out.println(x + " + " + y + " = " + z);
		}
		sc.close();
		
	}

}
