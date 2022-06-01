package tema3repeticiones;

/*
 * Haz un programa que muestre por pantalla los 100 primeros números positivos. 
Modifica el ejercicio para que muestre la suma de dichos números (acumula la suma 
de la repetición) 
 */

public class Ejercicio33 {

	public static void main(String[] args) {

		int numero = 0;
		int suma = 0;
		for( int i = 1;  i<=100 ; i++ )
		{
			numero = numero + 1;
			suma = suma + numero;
			System.out.print(numero + " ");
		}
		System.out.println("\n\n la suma final de los 100 primeros número vale " + suma);
	}

}
