package tema5arrays;

public class Animal {
	// atributos
	private String nombre;
	private String especie;
	//-----------------------------------------------
	// constructores
	public Animal(String nombre, String especie) {
		this.nombre = nombre;
		this.especie = especie;
	}
	//-----------------------------------------------
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	//----------------------------------------------
	public void mostrarAnimal()
	{
		System.out.println("especie-> " + this.especie + " ,nombre-> "+ this.nombre);
	}
	//----------------------------------------------

}
