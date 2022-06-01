package tema5arrays;

public class Ejemplo1Array2Dimensiones {

	public static void main(String[] args) {

		// final int NUM_CASILLAS = 5;
		// int[] x = new int[NUM_CASILLAS];
		// int[] x2 = {1,2,3,4,5};
		//--------------------------------------
		final int NUM_FILAS = 3;
		final int NUM_COLUMNAS = 5;
		int[][] tablero = new int[NUM_FILAS][NUM_COLUMNAS];
		tablero[1][1] = 7;
		tablero[2][4] = 9;
		tablero[0][3] = 3;
		//---------------------------------------
		int[][] tablero2 = {{0,0,0,3,0},{0,7,0,0,0},{0,0,0,0,9}};
		System.out.println("fin");
	}

}
