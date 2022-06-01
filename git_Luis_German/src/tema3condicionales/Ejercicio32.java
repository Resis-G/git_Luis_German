package tema3condicionales;

import java.util.Scanner;

public class Ejercicio32 {

	/*
	 * haz un programa que pida un número y diga si es positivo o negativo.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("dame un número ");
		double numero = sc.nextDouble();
		
		if(numero > 0)
		{
			System.out.println("es un numero positivo");
		}
		else {
			if(numero == 0)
			{
				System.out.println(" es el neutro");
			}
			else
			{
				System.out.println("es negativo ");	
			}
		}
		sc.close();
	}

}
