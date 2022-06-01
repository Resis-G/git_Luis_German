package tema5arraylist;

import java.util.ArrayList;

public class PruebaCoche {

	public static void main(String[] args) {
		
		//--------------------------------------------------
		ArrayList<Puerta> puertas = new ArrayList<Puerta>();
		Puerta p1 = new Puerta("p1",Colores.ROJO, true);
		Puerta p2 = new Puerta("p2",Colores.ROJO, true);
		Puerta p3 = new Puerta("p3",Colores.VERDE, false);
		Puerta p4 = new Puerta("p4",Colores.ROJO, true);
		puertas.add(p1);
		puertas.add(p2);
		puertas.add(p3);
		puertas.add(new Puerta("p4",Colores.ROJO, true));
		//---------------------------------------------------
		ArrayList<Rueda> ruedas = new ArrayList<Rueda>();
		Rueda r1 = new Rueda("r1", "michelin", "2022", 80.0, false);
		Rueda r2 = new Rueda("r2", "michelin", "2022", 80.0, false);
		Rueda r3 = new Rueda("r3", "michelin", "2022", 100.0, false);
		Rueda r4 = new Rueda("r4", "michelin", "2022", 80.0, false);
		ruedas.add(r1);
		ruedas.add(r2);
		ruedas.add(r3);
		ruedas.add(new Rueda("r4", "michelin", "2022", 80.0, true));
		//--------------------------------------------------------------
		
		Coche c1 = new Coche("1234jwd","seat", 21000.0,ruedas,puertas);
	//	c1.mostrarCoche();
		//--------------------------------------------------------------
		
		
		Coche c2 = new Coche("1234asd", "citroen", 20000.0);
		c2.getPuertas().add(p1);
		c2.getPuertas().add(p2);
		c2.getPuertas().add(p3);
		c2.getPuertas().add(p4);
		c2.getRuedas().add(r1);
		c2.getRuedas().add(r2);
		c2.getRuedas().add(r3);
		c2.getRuedas().add(r4);
		c2.inflarRuedas();
		double precioRuedas = c2.obtenerPrecioRuedas();
		// c2.cambiarPuerta(p1,p3);
		System.out.println("el precio de las ruedas es " + precioRuedas);
		c2.quitarPuertasDelColor(Colores.ROJO);
		c2.mostrarCoche();

	}

}
