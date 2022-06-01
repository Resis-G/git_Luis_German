package tema4;

public class Alumno {
 // atributos
	private String dni;
	private String nombre;
	private int edad;
	private String curso;
//---------------------------------------	
	// constructores
	public Alumno(String dni, String nombre, int edad, String curso) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.curso = curso;
	}
	//-------------------------------------
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCurso() {
		return this.curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	//-----------------------------------------------------
}
