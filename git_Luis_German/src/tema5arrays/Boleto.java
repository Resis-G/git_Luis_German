package tema5arrays;

public class Boleto {

	final int NUMERO_APUESTAS = 8;
	Apuesta[] boleto;

	public Boleto(Apuesta[] boleto) {
		this.boleto = boleto;
	}
	public Boleto() {
		this.boleto = new Apuesta[NUMERO_APUESTAS];
	}
	//-----------------------------------------------
	public Apuesta[] getBoleto() {
		return boleto;
	}
	public void setBoleto(Apuesta[] boleto) {
		this.boleto = boleto;
	}
	
	//-----------------------------------------------------
	
	public void mostrarBoleto()
	{
		for(int i=0; i<NUMERO_APUESTAS; i++)
		{
			Apuesta a1 = this.boleto[i];
			a1.mostrarApuesta();
		}
	}
	public void addApuesta(int casilla, int[] numeros) {
		Apuesta a1 = new Apuesta(numeros);
		boleto[casilla] = a1;
	}
	public void generarNumerosAleatorios() {
		for(int i=0; i<NUMERO_APUESTAS; i++)
		{
			Apuesta a = new Apuesta();
			a.rellenarApuestaConNumerosAleatorios();
			this.boleto[i] = a;
		}
		
	}
	public void comprobarAciertos(Apuesta a_ganadora) {
		for(int i=0; i < NUMERO_APUESTAS; i++)
		{
			Apuesta a = this.boleto[i];
			int aciertos = a.comprobarApuesta(a_ganadora);
			System.out.println("en la apuesta " + i + " has acertado " + aciertos  + " numeros");
		}
	}
}
