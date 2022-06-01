package interfacesgraficas;

public class Alumno2 {

	private String nombre;
	private String telefono;
	private String curso;
	private double precioMatricula;
	//-------------------------------------------
	public Alumno2(String nombre, String telefono, String curso, double precioMatricula) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.curso = curso;
		this.precioMatricula = precioMatricula;
	}
	//--------------------------------------------
	public Alumno2() {
		this.nombre = "";
		this.telefono = "";
		this.curso = "1dam";
		this.precioMatricula = 0.0;
	}
	//--------------------------------------------
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((curso == null) ? 0 : curso.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno2 other = (Alumno2) obj;
		if (curso == null) {
			if (other.curso != null)
				return false;
		} else if (!curso.equals(other.curso))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		return true;
	}
	//---------------------------------------------------------------
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double getPrecioMatricula() {
		return precioMatricula;
	}
	public void setPrecioMatricula(double precioMatricula) {
		this.precioMatricula = precioMatricula;
	}
	//-------------------------------------------------------------
	@Override
	public String toString() {
		return "Alumno2 [nombre=" + nombre + ", telefono=" + telefono + ", curso=" + curso + ", precioMatricula="
				+ precioMatricula + "]";
	}
	//-----------------------------------------------------------------
}
