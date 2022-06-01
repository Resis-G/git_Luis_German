package tema2;

import java.util.Scanner;

//import javax.swing.JOptionPane;

public class Ejercicio13 {

	/*
	 * Programa que traduzca de grados centígrados a grados Kelvin y Farenheit. 
	 */
	
	public static void main(String[] args) {
		
	//	String texto = JOptionPane.showInputDialog("dame los grados centigrados");
	//	float centigrados = Float.valueOf(texto);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("dame los grados centigrados: ");
		float centigrados = sc.nextFloat();
		
		float kelvin = centigrados + 273.0f ;
		float farenheit = centigrados * 9.0f / 5.0f + 32.0f;
		// muestro los resultados
		System.out.println(centigrados + " grados centigrados son " + kelvin + " grados kelvin");
		System.out.println(centigrados + " grados centigrados son " + farenheit + " grados farenheit");
		
		sc.close();
	}

}
