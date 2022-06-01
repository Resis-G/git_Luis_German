package tema3condicionales;

import java.util.Scanner;

public class Ejercicio310 {

	/*
	 * Haz un programa que pida una letra y detecte si es una vocal.
	 */
	public static void main(String[] args) {
        //-----------------------------------------------
		Scanner sc = new Scanner(System.in);
		System.out.println("dame una letra: ");
		String texto = sc.nextLine();
		//------------------------------------------------
		char letra = texto.charAt(0);
		//------------------------------------------------
		if(
				letra == 'a' || letra == 'A' || 
				letra == 'e' || letra == 'E' ||
				letra == 'i' || letra == 'I' ||
				letra == 'o' || letra == 'O' ||
				letra == 'u' || letra == 'U'  
		   )
		{
			System.out.println("ES UNA VOCAL");
		}
		else {
			System.out.println("NO ES UNA VOCAL");
		}
		sc.close();
	}

}
