package tema3repeticiones;

import java.util.Scanner;
/*
 * �AVERIGUAR N�MERO�:  
El objetivo del juego es averiguar un n�mero secreto. Pide por teclado repetidamente 
un n�mero hasta averiguar el n�mero secreto.  
Cada vez que pidas un n�mero debes mostrar uno de los siguientes mensajes: 
�  �Est�s muy lejos� si la diferencia entre el n�mero secreto y el que has escrito 
es mayor que 10 
� �est�s a menos de 10� si la diferencia entre el n�mero secreto y el que has 
escrito es menor que 10 
� �Estas a menos de 5� si la diferencia entre el n�mero secreto y el que has 
escrito es menor de 5. 
� �casi aciertas� si la diferencia entre el n�mero secreto y el que has escrito es 
menor de 3. 
� �Acertaste� si has acertado el n�mero. Termina el programa en ese instante. 
 * 
 * 
 */
public class Tarea343 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero_secreto =0;
		int numero = 0;
		final int MAX_TIRADAS = 4;
		int intentos = 1;
		//-------------------------------------------------------------------
		// este codigo ser�a para generar un n�mero aleatorio entre 1 y 100
		int menor = 10;
		int mayor = 30;
		numero_secreto = (int)(Math.random()*(mayor-menor+1) + menor);
		//-------------------------------------------------------------------
		boolean acabar = false;
		do {
			System.out.println("dame un n�mero: ");
			numero = sc.nextInt();
			sc.nextLine();
			//------------------------------------------------
			int diferencia = Math.abs(numero - numero_secreto);
			if(diferencia == 0)
			{
				System.out.println("HAS GANADO");
				//break; // opcion 1, poner break para acabar la repeticion
				// acabar = true; // opcion 2, definir un boolean para acabar
			}
			else if(diferencia <3)
			{
				System.out.println("esta a menos de 3");
			}
			else if(diferencia  < 5)
			{
				System.out.println("esta a menos de 5");
			}
			else if(diferencia  < 10)
			{
				System.out.println("esta a menos de 10");
			}
			else {
				System.out.println("est�s a m�s de 10 ");
			}
			intentos++;
			if(intentos > MAX_TIRADAS)
			{
				System.out.println("has perdido");
				break;
			}
	//	}while(true); // opcion1
	//	}while(acabar == false); // opcion2
		}while(numero != numero_secreto); // opcion 3, poner la condici�n directamente
		System.out.println("FIN");
	}

}
