package tema3repeticiones;

import java.util.Scanner;

public class Ejercicio37 {

	/*
	 * 	Diseñar un programa que lea sucesivamente números hasta que se encuentres uno 
		que sea par. Cuando lo encuentres escribe “has encontrado un número par”. Utiliza la 
		repetición do while.  
	 */
	public static void main(String[] args) {
		// vamos a hacer este ejercicio con una repeticion while y luego con una repeticion do-while
		Scanner sc = new Scanner(System.in);
		int numero = 1;
		while(numero % 2 == 1 )
		{
		         System.out.println("dame un numero "); 	
		         numero = sc.nextInt();
		         sc.nextLine();
		}
		System.out.println("encontrastes el número par -> " + numero);
		sc.close();
	}

}
