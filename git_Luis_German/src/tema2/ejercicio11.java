package tema2;

import java.util.Scanner;

public class ejercicio11 {

	/*
	 * 1.	Programa que lea por teclado un n�mero entero y nos visualice el cuadrado de ese n�mero. Por ejemplo, si el n�mero que introduces por teclado es un 3, deber�a mostrar el mensaje �el cuadrado del n�mero 3 es 9�
	 */
	public static void main(String[] args) {
	 
	 Scanner sc = new Scanner(System.in); // cogemos el teclado prestado
	 System.out.println("dame un numero");
	 int numero = sc.nextInt();
	 
	 long cuadrado = numero * numero;
	 System.out.println("el cuadrado del numero " + numero + " vale " + cuadrado);
	 sc.close(); // el teclado se libera aqui
	 
	}

}
