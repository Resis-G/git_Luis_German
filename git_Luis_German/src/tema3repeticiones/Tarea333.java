package tema3repeticiones;

import java.util.Scanner;
/*
 * �JUEGO EL SE�OR DE LOS ANILLOS�: (3 puntos) 
El objetivo del juego consiste en preguntar a los dos jugadores participante, qu� 
personaje de la lista de personajes del se�or de los anillos prefiere: 
1-> humano 
2-> ogro 
3 ->elfo 
Teniendo en cuenta, que el humano gana al ogro, el ogro gana al elfo y el elfo gana al 
humano. 
 
� Pide por teclado el personaje del jugador1 y del jugador2.  Por ejemplo, 
imagina que el jugador1 eligi� el ogro y el jugador2 el elfo. 
 
� Muestra por pantalla el ganador del juego.  
En el ejemplo, el ganador ser�a el jugador1, pues el ogro vence al elfo. Si 
eligieran el mismo personaje, quedar�an empate.
 */

public class Tarea333 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------------------");
		System.out.println("1-> HUMANO");
		System.out.println("2-> OGRO");
		System.out.println("3-> ELFO");
		//---------------------------------------------------------------------
		int jugador1 = 0;
		boolean opcion1 = false;
		do {
			System.out.println("dame la jugada del jugador1: (1..3)");
			jugador1 = sc.nextInt();
			sc.nextLine(); // limpiar salto de l�nea
			if(jugador1 != 1 && jugador1!=2 && jugador1!=3)
			{
				System.out.println("opcion incorrecta, vuelvelo a intentar.");
				opcion1 = false;
			}
			else {
				opcion1 = true;
			}
		}while(opcion1==false);
		//-----------------------------------------------------------------------
		if(jugador1 == 1) { 
			System.out.println("el jugador1 eligi� HUMANO");
			}
		else if(jugador1 == 2) {
			System.out.println("el jugador1 eligi� OGRO");
		}
		else if(jugador1 == 3) {
			System.out.println("el jugador1 eligi� ELFO");
		}
		//---------------------------------------------------------------------
		int jugador2 = 0;
		boolean opcion2 = false;
		do {
			// System.out.println("dame la jugada del jugador2: (1..3)");
			// jugador2 = sc.nextInt();
			//sc.nextLine(); // limpiar salto de l�nea
			jugador2 = (int)(Math.random()*3 + 1);
			if(jugador2 != 1 && jugador2!=2 && jugador2!=3)
			{
				System.out.println("opcion incorrecta, vuelvelo a intentar.");
				opcion2 = false;
			}
			else {
				opcion2 = true;
			}
		}while(opcion2==false);
		//-----------------------------------------------------------------------
		if(jugador2 == 1) { 
			System.out.println("el jugador2 eligi� HUMANO");
			}
			else if(jugador2 == 2) {
				System.out.println("el jugador2 eligi� OGRO");
			}
			else if(jugador2 == 3) {
				System.out.println("el jugador2 eligi� ELFO");
			}
		//---------------------------------------------------------------------
//------------------------------------------------------------------------------
		if(jugador1 == jugador2)
		{
			System.out.println("habeis empatado, elegisteis el mismo personaje");
		}
		else if(jugador1 == 1 && jugador2 == 2)
		{
			System.out.println("gan� el jugador1, el humano gana al ogro");
		}
		else if(jugador1 == 1 && jugador2 == 3)
		{
			System.out.println("gan� el jugador2, el elfo gana al humano");
		}
		else if(jugador1 == 2 && jugador2 == 3)
		{
			System.out.println("gan� el jugador1, el ogro gana al elfo");
		}	
		else if(jugador1 == 2 && jugador2 == 1)
		{
			System.out.println("gan� el jugador2, el humano gana al ogro");
		}
		else if(jugador1 == 3 && jugador2 == 1)
		{
			System.out.println("gan� el jugador1, el elfo gana al humano");
		}
		else if(jugador1 == 3 && jugador2 == 2)
		{
			System.out.println("gan� el jugador2, el ogro gana al elfo");
		}
		//-------------------------------------------------------------------------
		sc.close();
	}

}
