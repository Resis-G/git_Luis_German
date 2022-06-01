package tema5arraylist;

public class Equipo {

	// atributos
	private String id_equipo;
	private String procesador;
	private String memoria;
	private double precio;
	//------------------------------------------------------------------------------------
	public Equipo(String id_equipo, String procesador, String memoria, double precio) {
		this.id_equipo = id_equipo;
		this.procesador = procesador;
		this.memoria = memoria;
		this.precio = precio;
	}
	//------------------------------------------------------------------------------------
	public String getId_equipo() {
		return id_equipo;
	}
	public void setId_equipo(String id_equipo) {
		this.id_equipo = id_equipo;
	}
	public String getProcesador() {
		return procesador;
	}
	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	public String getMemoria() {
		return memoria;
	}
	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	//---------------------------------------------------------------------------------
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_equipo == null) ? 0 : id_equipo.hashCode());
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
		Equipo other = (Equipo) obj;
		if (id_equipo == null) {
			if (other.id_equipo != null)
				return false;
		} else if (!id_equipo.equals(other.id_equipo))
			return false;
		return true;
	}
	//--------------------------------------------------------------------------------------
	public void mostrarEquipo()
	{
		System.out.println("---------------------------------------------------");
		System.out.println("equipo:  " + this.id_equipo);
		System.out.println("procesador: " + this.procesador);
		System.out.println("memoria: " + this.memoria);
		System.out.println("precio: " + this.precio);
	}

	
	
	
}
