package tema2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio15 {

	/*
	 * 	Programa que lea por teclado el nombre del alumno y las tres notas de los exámenes de la evaluación. Muestra por pantalla la nota media que ha sacado
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// variables
		String nombre = "";
		double nota1 = 0.0;
		double nota2 = 0.0;
		double nota3 = 0.0;
		double media =0.0;
		
		// dar valores por teclado a las variables
		System.out.println("dame el nombre");
		nombre = sc.nextLine();
		
		System.out.println("dame la primera nota: ");
		nota1 = sc.nextDouble();
		// limpiar el salto de línea
		sc.nextLine();
		System.out.println("dame la segunda nota: ");
		nota2 = sc.nextDouble();
		// limpiar el salto de línea
		sc.nextLine();
		System.out.println("dame la tercera nota: ");
		nota3 = sc.nextDouble();
		// limpiar el salto de línea
		sc.nextLine();
		
		// calculamos la media
		media = (nota1+nota2+nota3) / 3.0;
		 // double mediaRedondeada = Math.round(media * 100.0) / 100.0;
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("la nota media del alumno " + nombre + " vale " + df.format(media));
		
		sc.close();
	}

}
