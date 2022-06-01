package tema5arrays;

public class PruebaBoleto {

	public static void main(String[] args) {
		
		Boleto b1 = new Boleto();
		//---------------------------------------
		b1.generarNumerosAleatorios();
        //--------------------------------------------
		b1.mostrarBoleto();
		//--------------------------------------------
		Apuesta a_ganadora = new Apuesta();
		a_ganadora.rellenarApuestaConNumerosAleatorios();
		System.out.println("COMBINACION GANADORA");
		a_ganadora.mostrarApuesta();
		//--------------------------------------------
		b1.comprobarAciertos(a_ganadora);

	}

}
