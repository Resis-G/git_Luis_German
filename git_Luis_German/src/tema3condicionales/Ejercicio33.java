package tema3condicionales;

import java.util.Scanner;

public class Ejercicio33 {

	/*
	 * haz un programa que s�lo permita introducir los caracteres S y N.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("dame una letra ");
		String texto = sc.nextLine(); // "S"

		char letra = texto.charAt(0); // 'S'
		if(letra == 'S' || letra == 'N')
		{
			System.out.println("es una letra v�lida");
		}
		else 
		{
		
			System.out.println("no es una letra v�lida");
		}
		sc.close();
	}

}
