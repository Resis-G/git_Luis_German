package tema3condicionales;

import java.util.Scanner;

// import javax.swing.JOptionPane;

public class Ejercicio37 {

	/*
	 * Haz un programa que muestre un men� que contemple las opciones �Archivo�, �Buscar� y �Salir�, en caso de que no se introduzca una opci�n correcta se notificar� por pantalla.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("dame una opci�n (Buscar,Abrir,Salir): ");
		String opcion = sc.nextLine();
		// String opcion = JOptionPane.showInputDialog("dame una opci�n (Buscar,Abrir,Salir): ");

		//---------------------------------------------------------
		if(     opcion.equalsIgnoreCase("buscar") || 
				opcion.equalsIgnoreCase("abrir") || 
				opcion.equalsIgnoreCase("salir")	)
		{
			System.out.println("opcion correcta");
		}
		else {
			System.out.println("opcion incorrecta");
		}
		sc.close();
	}

}
