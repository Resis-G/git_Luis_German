package tema4;

public class Perro {
// atributos
	String identificador;
	String raza;
	int edad;
	String alimentacion;

// constructores
	public Perro(String identificador, String raza, int edad, String alimentacion) {
		this.identificador = identificador;
		this.raza = raza;
		this.edad = edad;
		this.alimentacion = alimentacion;
	}
	
	public Perro(String identificador, int edad, String alimentacion) {
	this.identificador = identificador;
	this.edad = edad;
	this.alimentacion = alimentacion;
	this.raza = "sin especificar";
	}
	
	public Perro() {
	this.identificador = "sin especificar";
	this.edad = 0;
	this.alimentacion = "sin especificar";
	this.raza = "sin especificar";	
}

// metodos
	public void mostrarPerro(  )
	{
		System.out.println("identificador del perro " + this.identificador);
		System.out.println("raza del perro: " + this.raza);
		System.out.println("alimentacion del perro: " + this.alimentacion);
		System.out.println("edad del perro: " + this.edad);
	}
     
	//------------------------------------------
	public void incrementarEdadEnUno( )
	{
		this.edad = this.edad + 1;
	}
	//------------------------------------------

	public void calcularCosteVacunacion()
	{
		int costeVacunacion = 0;
		if(this.edad > 10)
		{
			costeVacunacion = 12;
		}
		else {
			costeVacunacion = 10;
		}
		System.out.println("el coste de la vacunacion es " + costeVacunacion);
	}
	//-----------------------------------------------------
	public void cambiarRazaDelPerro(String nuevaRaza )
	{
		this.raza = nuevaRaza;
	}
	//-------------------------------------------------------
	public void cambiarIdentificador(String nuevoIdentificador)
	{
		this.identificador = nuevoIdentificador;
	}
	//------------------------------------------------------------
	public void cambiarEdad(int nuevaEdad) //nueva edad es un parámetro de entrada
	{
		this.edad = nuevaEdad;
	}
	//------------------------------------------------------------
	public void cambiarAlimentacionPerro(String nuevaAlimentacion)
	{
		this.alimentacion = nuevaAlimentacion;
	}
	//------------------------------------------------------------

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}
	//----------------------------------------------------------------------
	public String cogerIdentificador()
	{
		return this.identificador;
	}
	//------------------------------------------------------------------------
	public int cogerEdad()
	{
		return this.edad;
	}
	//-------------------------------------------------------------------------
	public String cogerRaza()
	{
		return this.raza;
	}
	//---------------------------------------------------------------------------
	public String cogerAlimentacion()
	{
		return this.alimentacion;
	}
	//------------------------------------------------------------------

	public String getIdentificador() {
		return identificador;
	}

	public String getRaza() {
		return raza;
	}

	public int getEdad() {
		return edad;
	}

	public String getAlimentacion() {
		return alimentacion;
	}

	
}
