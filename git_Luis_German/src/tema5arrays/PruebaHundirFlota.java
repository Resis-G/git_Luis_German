package tema5arrays;

import java.util.Scanner;

public class PruebaHundirFlota {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//--------------------------------------------
		HundirFlota hf = new HundirFlota(5,5,6);
		hf.mostrarTablero();
		//--------------------------------------------

		while(hf.flotaHundida() == false)
		{
			System.out.println("dame la fila-> ");
			int fila = sc.nextInt();
			sc.nextLine(); // limpiar salto de línea
			System.out.println("dame la columna -> ");
			int columna = sc.nextInt();
			sc.nextLine();
			hf.realizarJugada(fila,columna);
			hf.mostrarTableroDestapado();
		}
		System.out.println("enhorabuena, has hundido toda la flota!!");
	}

}
