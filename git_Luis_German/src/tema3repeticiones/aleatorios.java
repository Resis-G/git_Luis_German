package tema3repeticiones;

public class aleatorios {

	public static void main(String[] args) {

		int mayor = 35;
		int pequeño = 25;
		
		for(int i=0; i<100; i++)
		{
			int numeroAleatorio = (int)(Math.random()*(mayor-pequeño+1) +pequeño);
			System.out.print(" " + numeroAleatorio);
		}

	}

}
