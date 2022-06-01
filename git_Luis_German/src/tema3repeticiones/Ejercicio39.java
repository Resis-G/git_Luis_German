package tema3repeticiones;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio39 {
	/*
	 * 	Calcular el número de aprobados de una clase de 12 alumnos (lee las doce notas por teclado y cuenta cuántos aprobados hubo). ¿cuál ha sido la nota media del curso?
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int NUM_ALUMNOS = 12;
		int cont = 1;
		int aprobados = 0;
		int suspensos = 0;
		double suma = 0.0;
		while(cont<=12)
		{
			System.out.println("dame la nota del alumno " + cont);
			double nota = sc.nextDouble();
			sc.nextLine();
			if(nota >=5 && nota <=10)
			{
				aprobados++;
				suma = suma + nota;
			}
			else if(nota >= 0 && nota <5)
			{
				suspensos++;
				suma = suma + nota;
			}
			else {
				System.out.println("nota no válida, te la vuelvo a pedir: ");
				cont--;
			}
			cont++;
		}
			System.out.println("Número de aprobados: " + aprobados);
			System.out.println("Número de suspensos: " + suspensos);

			if(NUM_ALUMNOS >0)
			{
				double media = suma /NUM_ALUMNOS;
				DecimalFormat df = new DecimalFormat("#.00");
				System.out.println("La nota media vale: " + df.format(media));
			}
		
		sc.close();
	}

}
