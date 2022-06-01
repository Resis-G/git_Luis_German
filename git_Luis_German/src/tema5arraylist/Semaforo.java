package tema5arraylist;

public class Semaforo {
// atributos----------------
	private String id_semaforo;
	private double latitud;
	private double longitud;
	private ColoresSemaforo color;
	private boolean encendido;
//--CONSTRUCTOR ----------------------------
	public Semaforo(String id_semaforo, double latitud, double longitud, ColoresSemaforo color, boolean encendido) {
		this.id_semaforo = id_semaforo;
		this.latitud = latitud;
		this.longitud = longitud;
		this.color = color;
		this.encendido = encendido;
	}
	
public Semaforo() {
	this.id_semaforo = "sinuso";
	this.latitud = 0.0;
	this.longitud = 0.0;
	this.color = ColoresSemaforo.ROJO;
	this.encendido = false;
}

//-----------GETTERS Y SETTERS----------------------------
	public String getId_semaforo() {
		return id_semaforo;
	}
	public void setId_semaforo(String id_semaforo) {
		this.id_semaforo = id_semaforo;
	}
	public double getLatitud() {
		return latitud;
	}
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	public ColoresSemaforo getColor() {
		return color;
	}
	public void setColor(ColoresSemaforo color) {
		this.color = color;
	}
	public boolean isEncendido() {
		return encendido;
	}
	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	//--------------------------------------------------------
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_semaforo == null) ? 0 : id_semaforo.hashCode());
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
		Semaforo other = (Semaforo) obj;
		if (id_semaforo == null) {
			if (other.id_semaforo != null)
				return false;
		} else if (!id_semaforo.equals(other.id_semaforo))
			return false;
		return true;
	}
	//-------------------------------------------------------------
	public void mostrarSemaforo()
	{
		System.out.println("----------------------------");
		System.out.println("ID SEMAFORO: " + this.id_semaforo);
		System.out.println("LATITUD: " + this.latitud);
		System.out.println("LONGITUD: " + this.longitud);
		System.out.println("COLOR: " + this.color);
		if(this.encendido == true)
		{
			System.out.println("SEMAFORO ENCENDIDO");
		}
		else {
			System.out.println("SEMAFORO APAGADO");
		}
	}
	//-------------------------------------------------------------

	@Override
	public String toString() {
		return "Semaforo [id_semaforo=" + this.id_semaforo + ", latitud=" + latitud + ", longitud=" + longitud + ", color="
				+ color + ", encendido=" + encendido + "]";
	}

	
}
