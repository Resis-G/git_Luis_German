package tema5arrays;

import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int NUM_ALUMNOS = 10;
		//------------------------------------
/*      double[] notas = new double[NUM_ALUMNOS];
		notas[0] = 0;
		notas[1] = 1;
		notas[2] = 2;
		notas[3] = 3;
		notas[4] = 4;
		notas[5] = 5;
		notas[6] = 6;
		notas[7] = 7;
		notas[8] = 8;
		notas[9] = 9;
*/
		//-----------------------------------------------
		//		double[] notas = {0,1,2,3,4,5,6,7,8,9};
		//-----------------------------------------------
		
		double[] notas = new double[NUM_ALUMNOS];
		for(int i=0; i< NUM_ALUMNOS; i++)
		{
			System.out.println("dame la nota del alumno " + i);
			double nota = sc.nextDouble();
			sc.nextLine();
			notas[i] = nota; // cambia el valor de la casilla
		}
//-----------------------------------------------------------------		
		// recuperar los valores para sumar
		double suma = 0.0;
		for(int i=0; i < NUM_ALUMNOS; i++)
		{
			suma = suma + notas[i]; // coge el valor de la casilla
		}
		//---------------------------------------
		System.out.println("la suma vale " + suma );
		double media = suma / NUM_ALUMNOS;
		System.out.println("La media vale " + media);
		//------------------------------------------------------
		
		// sacar la nota más baja y más alta
		if(notas != null && notas.length > 0)
		{
		double notabaja = notas[0];
		double notaalta = notas[0];
		for(int i= 1; i< NUM_ALUMNOS; i++)
		{
			if(notas[i] < notabaja)
			{
				notabaja = notas[i];
			}
			if(notas[i] > notaalta)
			{
				notaalta = notas[i];
			}
		}
		System.out.println("la nota más alta es: " + notaalta);
		System.out.println("la nota más baja es " + notabaja);
		}
	}

}
