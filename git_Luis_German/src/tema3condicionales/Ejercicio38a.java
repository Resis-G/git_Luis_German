package tema3condicionales;

import java.util.Scanner;



public class Ejercicio38a {
/*
 * Haz un programa que pida un número del 1 al 7 y diga el día de la semana correspondiente.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("dame el día de la semana (1..7) ");
		int dia = sc.nextInt();
       
		if(dia == 1)
        {
        	System.out.println("LUNES");
        }
        else if(dia ==2)
        {
        	System.out.println("MARTES");
        }
        else if(dia == 3)
        {
        	System.out.println("MIERCOLES");        	
        }
        else if(dia == 4)
        {
        	System.out.println("JUEVES");        	

        }
        else if(dia == 5)
        {
        	System.out.println("VIERNES");        	

        }     
        else if(dia == 6)
        {
        	System.out.println("SABADO");        	

        }
        else if(dia == 7)
        {
        	System.out.println("DOMINGO");        	
        }
        else {
        	System.out.println("OPCION INCORRECTA");
        }

		sc.close();
	}

}
