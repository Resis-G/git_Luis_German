package tema4;

public class Ordenador {

	// atributos
	String identificador;
	String disco;
	String RAM;
	int anyos;
	
	// darle valores iniciales a las variables
	// constructor
	public Ordenador(String identificador, String disco, String RAM, int anyos) {
		this.identificador = identificador;
		this.disco = disco;
		this.RAM = RAM;
		this.anyos = anyos;
	}
	
	public Ordenador(String identificador, String disco, int anyos) {
		this.identificador = identificador;
		this.disco = disco;
		this.anyos = anyos;
		this.RAM = "4GB DDR4";
	}
	

	public Ordenador() {
		this.identificador = null;
		this.disco = null;
		this.anyos = 0;
		this.RAM = null;
	}

	// métodos
	public void mostrarOrdenador()
	{
		System.out.println("identificador del ordenador: " + this.identificador);
		System.out.println("disco duro: " + this.disco);
		System.out.println("ram: " + this.RAM);
		System.out.println("años: " + this.anyos);
	}
   
	
	
	
}
