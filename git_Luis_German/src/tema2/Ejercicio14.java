package tema2;

import java.util.Scanner;

// import javax.swing.JOptionPane;

public class Ejercicio14 {

	/*
	 * 	Programa que lea dos números enteros por teclado y que imprima el resultado de sumarlos, restarlos, multiplicarlos, dividirlos y el resto de la división:
	 */
	
	public static void main(String[] args) {
	/*	String textoNumero1 = JOptionPane.showInputDialog("dame el primer numero");
		String textoNumero2 = JOptionPane.showInputDialog("dame el segundo numero");
		double x = Double.valueOf(textoNumero1);
		double y = Double.valueOf(textoNumero2);
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("dame el primer numero");
		double x = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("dame el segundo numero");
		double y = sc.nextDouble();
		sc.nextLine();

		double suma = x + y;
		System.out.println(x + " + " + y + " = " + suma);
		double resta = x - y;
		System.out.println(x + " - " + y + " = " + resta);
		double multiplicacion = x * y;
		System.out.println(x + " * " + y + " = " + multiplicacion);
		double division = x / y;
		System.out.println(x + " / " + y + " = " + division);
		double resto = x % y;
		System.out.println(x + " % " + y + " = " + resto);

		sc.close();
	}

}
