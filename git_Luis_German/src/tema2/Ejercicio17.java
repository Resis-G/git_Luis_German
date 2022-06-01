package tema2;

import java.util.Scanner;

public class Ejercicio17 {

/*
 * 	Diseña un programa Java que solicite un número de 5 dígitos del teclado, separe el número en sus dígitos individuales y los muestre por pantalla. Por ejemplo, si el número es 53123 que muestre:  5   3    1    2    3
 */
	public static void main(String[] args) {
		// "52345"  -> "5 2 3 4 5"

		// voy a resolverlo empleando el resto %
		Scanner sc = new Scanner(System.in);
		
		System.out.println("dame el numero: ");
		int numero = sc.nextInt();
		// sc.nextLine();
		
		int cociente1 = numero / 10000;
		int resto1 = numero % 10000;
		
		int cociente2 = resto1 / 1000;
		int resto2 = resto1 % 1000;
		
		int cociente3 = resto2 / 100;
		int resto3 = resto2 % 100;
		
		int cociente4 = resto3 / 10;
		int resto4 = resto3 % 10;
		
		System.out.println("el numero separado ha quedado así: ");
		System.out.println(cociente1 + " " + cociente2 + " " + cociente3 + " " + cociente4 + " " + resto4);
		
		// ultima línea
		sc.close();
	}

}
