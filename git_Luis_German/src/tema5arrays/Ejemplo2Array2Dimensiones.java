package tema5arrays;

public class Ejemplo2Array2Dimensiones {

	public static void main(String[] args) {
		// vamos a implementar un array 5x5 de números aleatorios (1..10)
		final int NUM_FILAS = 5;
		final int NUM_COLUMNAS = 5;
		int[][] tablero = new int[NUM_FILAS][NUM_COLUMNAS];
		//-------------------------------------------------------
		for(int i=0; i<NUM_FILAS; i++)
		{ 
			for(int j=0; j<NUM_COLUMNAS; j++)
			{
				tablero[i][j] = (int)(Math.random()*10);
			}
		}
		//--------------------------------------------------
		// AHORA MUESTRO EL TABLERO
		for(int i=0; i<tablero.length; i++)
		{
			for(int j=0; j<tablero[i].length; j++)
			{
				System.out.print(" " + tablero[i][j]);
			}
			System.out.println();
		}
		//-------------------------------------------------
		System.out.println("fin");
		
	}

}
