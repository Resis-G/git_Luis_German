package tema3condicionales;

import java.util.Scanner;

public class Tarea32 {

/*
 * Pide por teclado un n�mero correspondiente a la posici�n obtenida por un corredor en la carrera. Si el corredor qued� primero, muestra por pantalla el texto �campe�n�, si qued� segundo �subcampe�n�, si lleg� en tercera posici�n muestra �tercero�. En cualquier otro caso muestra el mensaje �lo importante es participar� (utiliza un switch)
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("dame la posicion de carrera: ");
		int posicion = sc.nextInt();
		
		switch(posicion)
		{
			case 1:
				System.out.println("campeon");
				break;
			case 2:
				System.out.println("subcampe�n");
				break;
			case 3:
				System.out.println("tercero");
				break;
			default:	
				System.out.println("lo importante es participar");
		}
		sc.close();
		

	}

}
