package tema3repeticiones;

import java.util.Scanner;

public class Ejercicio38 {

	/*
	 * 	Pedir una palabra contraseña mientras no metas la palabra correcta.
	 */
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String clave = "casa";
		 String texto = "";
		 int intentos = 1;
		do {
			 if(intentos > 3)
			 {
				 System.out.println("sobrepasastes el numero de intentos, adios");
				 sc.close();
				 return; // acabar el main
				// System.exit(1); // acabar todo
			 }
			 System.out.println("dame la contraseña ");
			 texto = sc.nextLine();
			 intentos++;
		}while( texto.equals(clave) == false );
		
		System.out.println("bienvenidos");
		sc.close();
	}


}
