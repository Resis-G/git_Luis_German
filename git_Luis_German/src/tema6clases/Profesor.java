package tema6clases;

import java.util.ArrayList;

public class Profesor extends Persona{
	// atributos nuevos
	ArrayList<String> modulos;

	public Profesor(String dni, String nombre, String apellidos, String email, ArrayList<String> modulos) {
		super(dni, nombre, apellidos, email);
		this.modulos = modulos;
	}
	public Profesor(String dni, String nombre, String apellidos, String email) {
		super(dni, nombre, apellidos, email);
		this.modulos = new ArrayList<String>();
	}
	public Profesor()
	{
		super();
		this.modulos = new ArrayList<String>();
	}
	//----------------------------------------------
	public ArrayList<String> getModulos() {
		return modulos;
	}
	public void setModulos(ArrayList<String> modulos) {
		this.modulos = modulos;
	}
	//-----------------------------------------------
	@Override
	public String toString() {
		return  super.toString() + " modulos=" + modulos ;
	}
}
