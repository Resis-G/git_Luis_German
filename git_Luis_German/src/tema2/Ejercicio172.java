package tema2;

import java.util.Scanner;

public class Ejercicio172 {

/*
 *  Diseña un programa Java que solicite un número de 5 dígitos del teclado, separe el número en sus dígitos individuales y los muestre por pantalla. Por ejemplo, si el número es 53123 que muestre:  5   3    1    2    3
 */
	public static void main(String[] args) {

		// "52345"  -> "5 2 3 4 5"

		// voy a resolverlo empleando el resto %
		Scanner sc = new Scanner(System.in);
		
		System.out.println("dame el numero de cinco cifras: ");
		String texto = sc.nextLine();
		
		char primeraCifra = texto.charAt(0);
		char segundaCifra = texto.charAt(1);
		char terceraCifra = texto.charAt(2);
		char cuartaCifra = texto.charAt(3);
		char quintaCifra = texto.charAt(4);
		System.out.println(primeraCifra + " " + segundaCifra + " " +terceraCifra + " " + cuartaCifra +" " + quintaCifra);
	
		sc.close();
	}

}
