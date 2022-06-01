package interfacesgraficas;

import java.util.Arrays;

public class Alumno {
    private final int NUM_NOTAS = 3;
	private String nombre;
	private double[] notas;
	
	public Alumno(String nombre, double[] notas) {
		this.nombre = nombre;
		this.notas = notas;
	}

	public Alumno(String nombre) {
		this.nombre = nombre;
		notas = new double[NUM_NOTAS];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public int getNUM_NOTAS() {
		return NUM_NOTAS;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Alumno other = (Alumno) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	public double calcularMedia()
	{
		double suma = 0.0;
		if(notas.length == 0)
		{
			return 0.0;
		}
		for(int i=0; i<NUM_NOTAS; i++)
		{
			suma = suma + notas[i];
		}
		double media = suma/NUM_NOTAS;
		return media;
	}
	
	@Override
	public String toString() {
		return "Alumno [NUM_NOTAS=" + NUM_NOTAS + ", nombre=" + nombre + ", notas=" + Arrays.toString(notas) + "]";
	}
	
	
	
	
	
	
}
