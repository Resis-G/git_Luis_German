package tema3repeticiones;

import java.util.Scanner;

public class Tarea323 {

	/*
	 * JUEGO ACERTAR O ACERCARSE MÁS AL NUMERO SECRETO”:  
El objetivo del juego consiste en acertar o acercarse lo más posible y sin pasarse, a un 
número secreto que desconocen los dos jugadores. Por ejemplo, para las pruebas 
puedes darle el valor 10 al número secreto. 
• Pide por teclado la jugada del jugador1 y del jugador2.  Por ejemplo, imagina 
que el jugador1 eligió el número 7 y el jugador2 el número 8. 
 
• Muestra el ganador del juego.  
✓ Si los dos jugadores se pasan no hay ganador. 
✓ Si los dos jugadores eligen el mismo número quedan empate (si no se 
pasaron) 
✓ Si la distancia al número secreto del jugador2 es menor que la del 
jugador1 gana el jugador2. En el ejemplo, ganaría el jugador2 pues la 
distancia al número secreto es 2 mientras que la distancia al número 
secreto del jugador1 es 3. 
Si la distancia al número secreto del jugador1 es menor que la del jugador2 gana el 
jugador1 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mayor = 25;
		int menor = 1;
		final int NUMERO_SECRETO = (int) (Math.random()*(mayor-menor + 1) + menor); // constante
		//--------------------------------------------------------
		System.out.println("dame la jugada del jugador1: ");
		int numeroJugador1 = sc.nextInt();
		sc.nextLine();
		//--------------------------------------------------------
		System.out.println("dame la jugada del jugador2: ");
		int numeroJugador2 = sc.nextInt();
		sc.nextLine();
		//--------------------------------------------------------
		if(numeroJugador1 > NUMERO_SECRETO && numeroJugador2>NUMERO_SECRETO)
		{
			System.out.println("EMPATE, OS HABÉIS PASADO");
		}
		else if(numeroJugador1 <= NUMERO_SECRETO && numeroJugador2>NUMERO_SECRETO)
		{
			System.out.println("EL JUGADOR2 SE HA PASADO, GANA EL JUGADOR1");
		}
		else if(numeroJugador2 <= NUMERO_SECRETO && numeroJugador1>NUMERO_SECRETO)
		{
			System.out.println("EL JUGADOR1 SE HA PASADO, GANA EL JUGADOR2");
		}
		else if(numeroJugador1 == numeroJugador2)
		{
			System.out.println("HABÉIS EMPATADO");
		}
		else {
			// si llegamos aquí, ninguno se ha pasado nison iguales
			int distancia1 = NUMERO_SECRETO - numeroJugador1;
			int distancia2 = NUMERO_SECRETO - numeroJugador2;
			if(distancia1 > distancia2)
			{
				System.out.println("HA GANADO EL JUGADOR2");
			}
			else {
				System.out.println("HA GANADO EL JUGADOR1");
			}
			sc.close();
		}
		System.out.println("el numero secreto era el "+ NUMERO_SECRETO);
	}

}
