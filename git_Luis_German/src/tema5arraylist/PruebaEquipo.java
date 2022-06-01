package tema5arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class PruebaEquipo {

	public static void main(String[] args) {
/*	Equipo e1 = new Equipo("e1","procesador1","memoria1",100.0);
	Equipo e2 = new Equipo("e2","procesadsfgfgor1","memdfgdfgdfgdoria1",104350.0);

	if(e1.equals(e2))
	{
		System.out.println("son iguales");
	}
	else {
		System.out.println("son distintos");
	}
*/
		ArrayList<Equipo> equipos_aula = new ArrayList<Equipo>();
		final int NUM_EQUIPOS = 3;
		
		// rellenamos ahora el arrayList de equipo
		for(int i=0; i< NUM_EQUIPOS; i++)
		{
			String idequipo = JOptionPane.showInputDialog("dame el nombre del equipo " + i);
			String procesador = JOptionPane.showInputDialog("dame el procesador ");
			String memoria = JOptionPane.showInputDialog("dame la memoria ");
			String textoprecio = JOptionPane.showInputDialog("dame el precio ");
			double precio = Double.valueOf(textoprecio);
			Equipo ea1 = new Equipo(idequipo,procesador,memoria, precio);
			equipos_aula.add(ea1);
		}
		
		// mostrar el contenido de un arrayList
	/*	for(int i=0; i < equipos_aula.size(); i++)
		{
			Equipo e = equipos_aula.get(i);
			e.mostrarEquipo();
		}
	*/
		//-------------------------------------------
	/*	for (Equipo e : equipos_aula) {
			e.mostrarEquipo();
		}
		*/
		//-------------------------------------------
		
		// buscar un elemento en el arrayList para mostrarlo y borrarlo
/*		String id_equipo_buscado ="e4";
		for (Equipo e : equipos_aula) {
		       String id_equipo = e.getId_equipo();
		       if(id_equipo.equalsIgnoreCase(id_equipo_buscado))
		       {
		    	   System.out.println("*******************");
		    	   System.out.println("EQUIPO ENCONTRADO !!!!");
		    	   e.setProcesador("nuevo procesador");
		    	   e.mostrarEquipo();
		    	   equipos_aula.remove(e); // PROBLEMA, FALLA
		    	break;
		       }
		}
	
		//---------------------------------------------------------
		System.out.println("quedan los siguientes equipos:");
		for (Equipo e : equipos_aula) 
		{
			e.mostrarEquipo();
		}
//---------------------------------------------------------
	*/
		//---------------------------------------------------------
/*
		String memoria_buscada ="4gb";
		for (Equipo e : equipos_aula) {
			String memoria = e.getMemoria();
			if(memoria.equalsIgnoreCase(memoria_buscada))
			{
		    	System.out.println("*******************");
		    	System.out.println("MEMORIA ENCONTRADA!!!!");
		    	e.mostrarEquipo();
		    	equipos_aula.remove(e);
			}
		}
	*/
		String memoria_buscada ="4gb";
		Iterator<Equipo> it = equipos_aula.iterator();
		while(it.hasNext()) // mientras queden casillas por recorrer
		{
			Equipo e = it.next(); // next sirve para leer una casilla
 		  	String memoria = e.getMemoria();
			if(memoria.equalsIgnoreCase(memoria_buscada))
			{
		    	System.out.println("*******************");
		    	System.out.println("MEMORIA ENCONTRADA!!!!");
		    	e.mostrarEquipo();
		    	it.remove(); // se borra desde el iterador, no desde el arrayList
			}
		}
		

		System.out.println("quedan los siguientes equipos:");
		for (Equipo e : equipos_aula) 
		{
			e.mostrarEquipo();
		}
	/*	
		for (Iterator<Equipo> it1 = equipos_aula.iterator(); it1.hasNext();) 
		{
			Equipo e =  it1.next();
			String memoria = e.getMemoria();
			if(memoria.equalsIgnoreCase(memoria_buscada))
			{
		    	System.out.println("*******************");
		    	System.out.println("MEMORIA ENCONTRADA!!!!");
		    	e.mostrarEquipo();
		    	it.remove(); // se borra desde el iterador, no desde el arrayList
			}
		}
		*/
}

		
}
