package tema3condicionales;

import java.util.Scanner;

// import javax.swing.JOptionPane;

public class Ejercicio37 {

	/*
	 * Haz un programa que muestre un menú que contemple las opciones “Archivo”, “Buscar” y “Salir”, en caso de que no se introduzca una opción correcta se notificará por pantalla.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("dame una opción (Buscar,Abrir,Salir): ");
		String opcion = sc.nextLine();
		// String opcion = JOptionPane.showInputDialog("dame una opción (Buscar,Abrir,Salir): ");

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
