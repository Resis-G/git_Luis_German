package tema3repeticiones;

public class aleatorios {

	public static void main(String[] args) {

		int mayor = 35;
		int peque�o = 25;
		
		for(int i=0; i<100; i++)
		{
			int numeroAleatorio = (int)(Math.random()*(mayor-peque�o+1) +peque�o);
			System.out.print(" " + numeroAleatorio);
		}

	}

}
