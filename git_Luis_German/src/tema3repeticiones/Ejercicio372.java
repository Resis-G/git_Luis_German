package tema3repeticiones;

import java.util.Scanner;

public class Ejercicio372 {

	/*
	 * 	Diseñar un programa que lea sucesivamente números hasta que se encuentres uno 
		que sea par. Cuando lo encuentres escribe “has encontrado un número par”. Utiliza la 
		repetición do while.  
	 */
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		do {
			 System.out.println("dame un numero "); 	
	         numero = sc.nextInt();
	         sc.nextLine();
		//	String texto = JOptionPane.showInputDialog("dame un numero");
		//	numero = Integer.valueOf(texto);
		}while(numero % 2 == 1);
		
		System.out.println("encontrastes el número par -> " + numero);
	    sc.close();
	}
}
