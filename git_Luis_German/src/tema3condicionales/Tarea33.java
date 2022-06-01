package tema3condicionales;

import java.util.Scanner;

/*
  Programa que lea 3 números de teclado y
  los muestre ordenados de mayor a menor.
 */

public class Tarea33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("dame el primer numero ");
		int x = sc.nextInt();
		sc.nextLine(); // esto limpia el salto de línea residual que quedó en la memoria sc
		
		System.out.println("dame el segundo numero ");
		int y = sc.nextInt();
		sc.nextLine(); // esto limpia el salto de línea residual que quedó en la memoria sc
		
		
		System.out.println("dame el tercer numero ");
		int z = sc.nextInt();
		sc.nextLine(); // esto limpia el salto de línea residual que quedó en la memoria sc
		
		if(x>=y && y>=z)
		{
			System.out.println(x+ " > " + y + " > " + z );
		}else if(x>=y && z>= x )
		{
			System.out.println(z+ " > " + x + " > " + y );
		}
		else if(y >=z && z>= x)
		{
			System.out.println(y+ " > " + z + " > " + x );

		}
		else if(z >=y && x >= z)
		{
			System.out.println(x + " > " + z + " > " + y );

		}
		else if(y >=x && x >= z)
		{
			System.out.println(y + " > " + x + " > " + z );

		}
		else {
			System.out.println(z + " > " + y + " > " + x );
		}
		
		
		sc.close();
	}

}
