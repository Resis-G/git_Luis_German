package tema3repeticiones;

import java.util.Scanner;

public class Ejercicio372 {

	/*
	 * 	Dise�ar un programa que lea sucesivamente n�meros hasta que se encuentres uno 
		que sea par. Cuando lo encuentres escribe �has encontrado un n�mero par�. Utiliza la 
		repetici�n do while.  
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
		
		System.out.println("encontrastes el n�mero par -> " + numero);
	    sc.close();
	}
}
