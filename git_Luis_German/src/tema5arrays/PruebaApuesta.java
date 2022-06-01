package tema5arrays;

public class PruebaApuesta {

	public static void main(String[] args) {
		

		int[] numeros= {11,13,15,22,23,34};
	//	Apuesta a1 = new Apuesta();
	//	a1.setNumeros(numeros);
		Apuesta a1 = new Apuesta(numeros);
		a1.mostrarApuesta();
	}

}
