package tema5arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Coche {
	// atributos
	private String matricula;
	private String marca;
	private double precio;
	private ArrayList<Rueda> ruedas = null;
	private ArrayList<Puerta> puertas = null;
	//----------------------------------------------
	public Coche(String matricula, String marca, double precio, ArrayList<Rueda> ruedas, ArrayList<Puerta> puertas) {
		this.matricula = matricula;
		this.marca = marca;
		this.precio = precio;
		this.ruedas = ruedas;
		this.puertas = puertas;
	}
	//-----------------------------------------------
	public Coche(String matricula, String marca, double precio) {
		this.matricula = matricula;
		this.marca = marca;
		this.precio = precio;
		this.ruedas = new ArrayList<Rueda>();
		this.puertas = new ArrayList<Puerta>();
	}
	//-----------------------------------------------
	public Coche() {
		this.matricula = "se";
		this.marca = "se";
		this.precio = 0.0;
		this.ruedas = new ArrayList<Rueda>();
		this.puertas = new ArrayList<Puerta>();
	}
	//-----------------------------------------------
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public ArrayList<Rueda> getRuedas() {
		return ruedas;
	}
	public void setRuedas(ArrayList<Rueda> ruedas) {
		this.ruedas = ruedas;
	}
	public ArrayList<Puerta> getPuertas() {
		return puertas;
	}
	public void setPuertas(ArrayList<Puerta> puertas) {
		this.puertas = puertas;
	}
	//-------------------------------------------------------
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
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
		Coche other = (Coche) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}
	//------------------------------------------------------------
	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", marca=" + marca + ", precio=" + precio + ", ruedas=" + ruedas
				+ ", puertas=" + puertas + "]";
	}
	//------------------------------------------------------------
	public void mostrarCoche()
	{
		System.out.println("--------------------------------------");
		System.out.println("matricula -> " + this.matricula);
		System.out.println("marca -> " + this.marca);
		System.out.println("ruedas -> ");
		for (Rueda r : this.ruedas) {
			r.mostrarRueda();
		}
		System.out.println("puertas -> ");
		for (Puerta p : this.puertas) {
			p.mostrarPuerta();
		}
	}
	//-----------------------------------------------------------
	public void inflarRuedas() {
		for(Rueda r: this.ruedas)
		{
			r.setInfladoOK(true);
		}
   //-------------------------------------------------------------
		
	}
	public double obtenerPrecioRuedas() {
		double suma = 0.0;
		for(Rueda r: this.ruedas)
		{
		   suma = suma + r.getPrecio();	// incrementar una variable
		}
		return suma;
	}
	//-----------------------------------------------------------
	public void cambiarPuerta(Puerta p1, Puerta p3) {
		/*
		 for (Puerta p : this.puertas) {
		      if(p.equals(p1))
		      {
		    	p1.setNumerop(p3.getNumerop());
		    	p1.setColor(p3.getColor());
		    	p1.setVentanillaAbierta(p3.isVentanillaAbierta());
		      }
		}
		*/
		puertas.remove(p1);
		puertas.add(p3);
	}
	//------------------------------------------------------------
	public void quitarPuertasDelColor(Colores color) {
	
		Iterator<Puerta> it = this.puertas.iterator();
		while(it.hasNext())
		{
			Puerta p = it.next();
			if(p.getColor() == color)
				{
			          it.remove();
				}
			}
		}

	//---------------------------------------------------------------	
}
