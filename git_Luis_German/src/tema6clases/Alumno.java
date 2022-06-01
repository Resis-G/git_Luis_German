package tema6clases;

public class Alumno extends Persona {
    // atributos propios de la clase persona
	private String cursoActual;
	// constructor

	public Alumno(String dni, String nombre, String apellidos, String email, String cursoActual) {
		super(dni, nombre, apellidos, email);
		this.cursoActual = cursoActual;
	}

	public String getCursoActual() {
		return cursoActual;
	}

	public void setCursoActual(String cursoActual) {
		this.cursoActual = cursoActual;
	}
	//---------------------------------------------------

	@Override
	public String toString() {
		return super.toString() + ", cursoActual=" + cursoActual ;
	}
	
	
	
}
