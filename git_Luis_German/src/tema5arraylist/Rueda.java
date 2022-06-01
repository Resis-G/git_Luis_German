package tema5arraylist;

import java.util.Iterator;

public class Rueda {
// atributos
	private String numeror;
	private String marca;
	private String modelo;
	private double precio;
	private boolean infladoOK;
// constructores
	public Rueda(String numeror, String marca, String modelo, double precio, boolean infladoOK) {
		this.numeror = numeror;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.infladoOK = infladoOK;
	}
	public Rueda(String numeror, String marca, String modelo, double precio) {
		this.numeror = numeror;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.infladoOK = true; // valor por defecto es inflado
	}
	public Rueda() {
		this.numeror = "se";
		this.marca = "se";
		this.modelo = "se";
		this.precio = 0.0;
		this.infladoOK = true; // valor por defecto es inflado
	}	
// metodos getters y setters	
	public String getNumeror() {
		return numeror;
	}
	public void setNumeror(String numeror) {
		this.numeror = numeror;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean isInfladoOK() {
		return infladoOK;
	}
	public void setInfladoOK(boolean infladoOK) {
		this.infladoOK = infladoOK;
	}
	//-----------------------------------------------------------
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeror == null) ? 0 : numeror.hashCode());
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
		Rueda other = (Rueda) obj;
		if (numeror == null) {
			if (other.numeror != null)
				return false;
		} else if (!numeror.equals(other.numeror))
			return false;
		return true;
	}
	//-------------------------------------------------------
	@Override
	public String toString() {
		return "Rueda [numeror=" + numeror + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio
				+ ", infladoOK=" + infladoOK + "]";
	}
	//--------------------------------------------------------
	public void mostrarRueda()
	{
		System.out.println("-------------------------------------------");
		System.out.println("numero de rueda -> " + this.numeror);
		System.out.println("marca -> " + this.marca);
		System.out.println("modelo -> " + this.modelo);
		System.out.println("precio-> " + this.precio);
		if(this.infladoOK == true )
		{
			System.out.println("inflado correcto ");

		}
		else {
			System.out.println("la rueda no está inflada");
		}
	}

	
}
