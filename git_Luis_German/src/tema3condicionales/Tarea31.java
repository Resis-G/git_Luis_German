package tema3condicionales;

import java.util.Scanner;

public class Tarea31 {

/*
 *  Pide por teclado un número correspondiente al precio de un producto. Muestra por pantalla el mensaje “el precio del producto es caro” (vale más de 10), “tiene un precio normal” (el precio es menor o igual que 10 y mayor que 5) o “el precio es bajo” (vale igual o menos que 5).
 */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("dame el precio del producto: ");
		float numero = sc.nextFloat();
		
		if(numero >10)
		{
			System.out.println("el precio es caro");
		}
		else if(numero >5 && numero <=10 )
			{
				System.out.println("el precio es normal");
			}			
		else if (numero >=0 && numero <=5){
			System.out.println("el precio es bajo");
  	    }
		else {
			System.out.println("error, el precio no puede ser negativo");
		}
		
		sc.close();
	}
}
