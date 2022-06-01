package tema5arrays;

import java.util.Scanner;

/*
 * JUEGO “BOMBA”.  
Define un array de 10 casillas de tipo boolean y coloca aleatoriamente valores 
true/false a lo largo del array. El valor true indica que hay una bomba y el valor 
false que no hay bomba.  
 
El juego consiste en que dos jugadores deben ir destapando las casillas del array en 
turno.  
• Si la casilla elegida por un jugador tiene un valor true, el jugador pierde y se 
muestra un mensaje BOMBA, HAS PERDIDO.  
• Si la casilla tiene un valor false muestra el mensaje “BIEN HECHO, SIGUE 
ASÍ” 
• El juego termina cuando uno de los dos jugadores elige una casilla una 
casilla con bomba.
 */

public class ExtraEjercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// DEFINIR EL ARRAY DE 10 CASILLAS CON TRUE O FALSE
		final int NUM_CASILLAS = 10;
		int[] tablero = new int[NUM_CASILLAS];
		//--------------------------------------------------
		// rellenamos el tablero con true o con false
		// 0 no tiene bomba
		// 1 tiene bomba
		for(int i=0; i < tablero.length; i++)
		{
			int numero = (int) (Math.random()*2);
			System.out.print(" " + numero);
			tablero[i] = numero;
		}
		//--------------------------------------------------

		do {
			// JUGADOR1 ------------------------------------------------
			System.out.println("\n\n dame una casilla JUGADOR1: (1.." + NUM_CASILLAS + ")");
			int casilla = sc.nextInt() - 1;
			sc.nextLine();
			if(casilla <0 || casilla >= NUM_CASILLAS)
			{
				System.out.println("casilla no valida");
			}
			else {
				if(tablero[casilla] == 1)
				{
					System.out.println("HAS PERDIDO JUGADOR1, HABÍA BOMBA!!");
					break;
				}
				else {
					System.out.println("MUY BIEN, NO HAY BOMBA");
				}
			}
			//----------------------------------------------------------
			// JUGADOR2 ------------------------------------------------
						System.out.println("\n\n dame una casilla JUGADOR2: (1.." + NUM_CASILLAS + ")");
						casilla = sc.nextInt() - 1;
						sc.nextLine();
						if(casilla <0 || casilla >= NUM_CASILLAS)
						{
							System.out.println("casilla no valida");
						}
						else {
							if(tablero[casilla] == 1)
							{
								System.out.println("HAS PERDIDO JUGADOR2, HABÍA BOMBA!!");
								break;
							}
							else {
								System.out.println("MUY BIEN, NO HAY BOMBA");
							}
						}
		}while(true);
	}
}
