package tema5arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Ciudad {
	// atributos
	private String cod_ciudad;
	private String nombre_ciudad;
	private ArrayList<Semaforo> semaforos = null; 
	//------------------------------------------
	public Ciudad(String cod_ciudad, String nombre_ciudad, ArrayList<Semaforo> semaforos) 
	{
		this.cod_ciudad = cod_ciudad;
		this.nombre_ciudad = nombre_ciudad;
		this.semaforos = semaforos;
	}
	//-------------------------------------------
	public Ciudad(String cod_ciudad, String nombre_ciudad) {
		this.cod_ciudad = cod_ciudad;
		this.nombre_ciudad = nombre_ciudad;
		this.semaforos = new ArrayList<Semaforo>();
	}
	//------------------------------------------------
	public Ciudad() {
		this.cod_ciudad = "sin especificar";
		this.nombre_ciudad = "sin especificar";
		this.semaforos = new ArrayList<Semaforo>();
	}
	//---------------------------------------------------
	public String getCod_ciudad() {
		return cod_ciudad;
	}
	public void setCod_ciudad(String cod_ciudad) {
		this.cod_ciudad = cod_ciudad;
	}
	public String getNombre_ciudad() {
		return nombre_ciudad;
	}
	public void setNombre_ciudad(String nombre_ciudad) {
		this.nombre_ciudad = nombre_ciudad;
	}
	public ArrayList<Semaforo> getSemaforos() {
		return semaforos;
	}
	public void setSemaforos(ArrayList<Semaforo> semaforos) {
		this.semaforos = semaforos;
	}
	//-----------------------------------------------------

	public void mostrarCiudad()
	{
		System.out.println("CODIGO CIUDAD: " + this.cod_ciudad);
		System.out.println("NOMBRE CIUDAD: " + this.nombre_ciudad);
		for (Semaforo s : this.semaforos) {
			s.mostrarSemaforo();
		}
	}
   //----------------------------------------------------------
	public void apagarSemaforo(String id_semaforo)
	{
		for (Semaforo s : semaforos) {
			if(s.getId_semaforo().equals(id_semaforo))
			{
				s.setEncendido(false);
				break;
			}
		}
	}
	  //----------------------------------------------------------
	public void encenderSemaforo(String id_semaforo)
		{
			for (Semaforo s : this.semaforos) {
				if(s.getId_semaforo().equals(id_semaforo))
				{
					s.setEncendido(true);
					break;
				}
			}
		}
	//----------------------------------------------------------
	public void cambiarColorSemaforo(String id_semaforo, ColoresSemaforo nuevoColor)
	{
		for (Semaforo s : this.semaforos) {
			if(s.getId_semaforo().equals(id_semaforo))
			{
				s.setColor(nuevoColor);
			}
		}
	}
	//----------------------------------------------------------
	public void addSemaforo(Semaforo s)
	{
		this.semaforos.add(s);
	}
	//----------------------------------------------------------
	public void borrarSemaforo(Semaforo s)
	{
		this.semaforos.remove(s);
	}
	public void borrarSemaforo(String id_Semaforo)
	{
		// this.semaforos.remove(new Semaforo(id_Semaforo,0,0,ColoresSemaforo.ROJO,false));
		Iterator<Semaforo> it = this.semaforos.iterator();
		while(it.hasNext()) // mientras queden casillas por mirar
		{
			Semaforo s = it.next(); // coger la siguiente casilla
			if(s.getId_semaforo().equalsIgnoreCase(id_Semaforo))
			{
				it.remove();
				break;
			}
		}
	}
	//-----------------------------------------------------------
	 public boolean mostrarDatosDeUnSemaforo(String id_semaforo)
	 {
		for (int i=0; i< this.semaforos.size();i++) {
			Semaforo s = this.semaforos.get(i);
			if(s.getId_semaforo().equalsIgnoreCase(id_semaforo))
			{
				s.mostrarSemaforo();
				return true;
			}
		} 
		return false;
	 }
}
