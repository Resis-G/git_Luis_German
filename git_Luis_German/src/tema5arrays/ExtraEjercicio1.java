package tema5arrays;

/*
 * Define un array de 100 casillas con números enteros aleatorios entre el -50 y el 50. 
A continuación, muestra por pantalla: 
• Cantidad de números mayores que cero 
• Cantidad de números menores o iguales que cero 
• Cantidad de número pares 
• Cantidad de números impares
 */
public class ExtraEjercicio1 {

	public static void main(String[] args) {
		
		final int CANT_NUMEROS = 10;
		int[] numeros = new int[CANT_NUMEROS];
		//-------------------------------------------------------------
		int menor = -50;
		int mayor = 50;
		//-------------------------------------------------------------
		for(int i=0; i< CANT_NUMEROS; i++)
		{
			int numero = (int)(Math.random()*(mayor-menor+ 1))+menor;
			System.out.print(" " + numero);
				numeros[i] = numero;
		}
		//------------------------------------------------------------
		int mayoresCero = 0;
		int menoresCero = 0;
		int pares = 0;
		int impares = 0;
		for(int i=0; i< numeros.length; i++)
		{
			int numero = numeros[i];
			if(numero > 0)
			{
				mayoresCero++;
			}
			if(numero <= 0)
			{
				menoresCero++;
			}
			if(numero %2 == 0)
			{
				pares++;
			}
			else
			{
				impares++;
			}
		}
		System.out.println("\n-------------------------------------");
		System.out.println("cantidad de positivos " + mayoresCero);
		System.out.println("cantidad de negativos " + menoresCero);
		System.out.println("cantidad de pares " + pares);
		System.out.println("impares " + impares);
	}

}
