package tema4;

public class Entrenamiento {
 // atributos
	private int dias;
	private int metros;

	// constructor--------------------------------------
	public Entrenamiento(int dias, int metros) {
		this.dias = dias;
		this.metros = metros;
	}

	public Entrenamiento() {
		this.dias = 0;
		this.metros = 0;
	}
//-------------------------------------------------------
// getters y setters

	public int getDias() {
		return this.dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public int getMetros() {
		return metros;
	}

	public void setMetros(int metros) {
		this.metros = metros;
	}
	//---------------------------------------------------

	public void incrementarMetros(int metros) {
		this.metros = this.metros + metros;
	}
	
	public void disminuirMetros(int metros)
	{
		this.metros = this.metros - metros;
	}
	public void incrementarMetrosDias(int metros, int dias)
	{
		this.metros = this.metros + metros;
		this.dias = this.dias + dias;
	}
	
	public double calcularMetrosDia(  )
	{
		double media = (double)this.metros / (double) this.dias;
		return media;
	}

	public void mostrarEntrenamiento(  ) {
		System.out.println("----------------------------------------");
		System.out.println("metros recorridos " + this.metros ); // metodos get sirven para coger valores de los atributos
		System.out.println("dias de entrenamiento " + this.dias);
		System.out.println("metros recorridos por dia " + this.calcularMetrosDia());
		System.out.println("----------------------------------------");	
	}
	
}
