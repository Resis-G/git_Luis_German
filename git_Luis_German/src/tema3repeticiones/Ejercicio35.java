package tema3repeticiones;

import java.util.Scanner;

public class Ejercicio35 {
/*
 * Programa que imprima la tabla de multiplicar de un n�mero entero positivo (pide dicho n�mero por teclado).
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("dame el numero para mostrar su tabla de multiplicar: ");
		int numero = sc.nextInt();
		//----------------------------------------------------------------------------
		for(int i=1; i<=10; i++)
		{
			int resultado = numero * i;
			System.out.println(numero + " x " + i + " = " + resultado);
		}
		sc.close();
	}

}
