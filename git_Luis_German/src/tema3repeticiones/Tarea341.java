package tema3repeticiones;

import java.util.Scanner;

public class Tarea341 {
/*
 * TIEMPO DE DURACIÓN DE UN VIAJE:  
 
Un viajero quiere saber cuánto tiempo ha tardado en realizar un viaje. Ha parado 10 
veces y conoce la duración en minutos de cada uno de los 10 tramos del viaje. 
Haz un programa que pida por teclado el tiempo que invirtió el viajero en cada uno 
de los tramos y calcula el tiempo total del viaje en formato horas y minutos. 
Por ejemplo: 
 
Dime la duración en minutos del tramo 1: 15 
Dime la duración en minutos del tramo 2: 30 
Dime la duración en minutos del tramo 3: 87 
......... 
Tiempo total de viaje: 2 horas y 12 minutos
 */
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int minutosTotales = 0;
		// pedir los minutos en cada uno de los 10 tramos (repeticion de 10 vueltas)
		
		for(int i = 1 ; i<=10; i++)
		{
			int minutosTramo =0;
			//------------------------------------------------------------------------
			do {
				// pedir lo que ha tardado en cada tramo
				System.out.println("dime los minutos que tardastes en recorrer el tramo " + i);
				minutosTramo = sc.nextInt();
				sc.nextLine(); // limpiamos el salto de línea
				if(minutosTramo <=0)
				{
					System.out.println("dame un número mayor que cero, vuelve a intentarlo");
				}
			}while(minutosTramo<=0);
			//-----------------------------------------------------------------------
			minutosTotales = minutosTotales+ minutosTramo; // incrementar una variable una cantidad
		}
		// System.out.println("has tardado " + minutosTotales + " minutos en recorrer todo el camino");
		//---------------------------------------------------------------------------------------------
		// horasfinales = minutos / 60;
		// minutosfinales = minutos % 60;
		int horasFinales = minutosTotales / 60;
		int minutosFinales = minutosTotales % 60;
		if(horasFinales > 0)
		{
			System.out.println("horas empleadas en recorrer el camino completo: " + horasFinales + " horas");

		}
		if(minutosFinales >0)
		{
			System.out.println("minutos empleados en recorrer el camino: " + minutosFinales + " minutos");
		}
		//--------------------------------------------------------------------------------------------
		sc.close();
	}

}
