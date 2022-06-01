package tema3condicionales;

import java.util.Scanner;

public class Ejercicio38b {

	/*
	 * Haz un programa que pida un número del 1 al 7 y diga el día de la semana correspondiente.
	 */
		public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("dame el día de la semana (1..7) ");
		int dia = sc.nextInt();
		//--------------------------------------------------------
		switch(dia)
		{
		case 1:
				System.out.println("LUNES");
				break; // esta orden sirve para terminar el switch
		case 2:
				System.out.println("MARTES");
				break;
		case 3:
				System.out.println("MIERCOLES");
				break;
		case 4:
				System.out.println("JUEVES");
				break;
		case 5:
				System.out.println("VIERNES");
				break;
		case 6:
				System.out.println("SABADO");
				break;
		case 7:
				System.out.println("DOMINGO");
				break;
		default:
				System.out.println("OPCION INCORRECTA");
				break;
		}
		sc.close();
	}

}
