package tema2;

import java.util.Scanner;
// import javax.swing.JOptionPane;

public class Ejercicio12 {
/*
 * 	Programa que calcule el n�mero de kil�metros correspondientes a un valor de millas marinas introducidas por teclado. (El n�mero de kil�metros de una milla marina es de 1,852). Por ejemplo, si el n�mero que introduces por teclado es un 3.5, deber�a mostrar el mensaje �3.5 millas marinas corresponden con 6.482 kil�metros�
 */
	public static void main(String[] args) {

		final double KMPORMILLA = 1.852; // las constante se ponen en mayusculas como primeras l�neas
		
	//	String texto = JOptionPane.showInputDialog("dame las millas marinas");
	//	double millas = Double.valueOf(texto);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("dame las millas marinas");
		double millas = sc.nextDouble();
		
		double kms = KMPORMILLA * millas;
		System.out.println(millas + " millas marinas son " + kms + " kilometros");
		sc.close();
	}

}
