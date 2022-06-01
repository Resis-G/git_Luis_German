package tema5arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class pruebaPuerta {

	public static void main(String[] args) {
	/*	
		Puerta p1 = new Puerta("p1", Colores.VERDE, false);
		// para cambiar los valores de los atributos utilizo los metodos set
		p1.setVentanillaAbierta(true);
		p1.setColor(Colores.ROJO);
		p1.setNumerop("p11");
		//-------------------------------------------------------------------
		String nump = p1.getNumerop();
		System.out.println("el numero de puerta es " + nump);
		//-------------------------------------------------------------------
		p1.mostrarPuerta();
	*/
	// ejemplo para añadir casillas a un ArrayList	
	ArrayList<Puerta> puertas = new ArrayList<Puerta>();
	Puerta p1 = new Puerta("p1",Colores.ROJO, true);
	Puerta p2 = new Puerta("p2",Colores.ROJO, true);
	Puerta p3 = new Puerta("p3",Colores.ROJO, true);
	puertas.add(p1);
	puertas.add(p2);
	puertas.add(p3);
	puertas.add(new Puerta("p4",Colores.ROJO, true));
	// puertas.remove(p2);
	borrar_puerta(puertas,"p2");
//--------------------------------------------------------------------------------	
	// mostramos ahora el arrayList
	for (Puerta puerta : puertas) {
		puerta.mostrarPuerta();
	}
//-------------------------------------------------------------------------------
	
	}

	private static void borrar_puerta(ArrayList<Puerta> puertas, String numerop) {
		for (Iterator<Puerta> iterator = puertas.iterator(); iterator.hasNext();) {
			Puerta puerta =  iterator.next();
			if(puerta.getNumerop().equalsIgnoreCase(numerop))
			{
				iterator.remove();
			}
		}		
	}

}
