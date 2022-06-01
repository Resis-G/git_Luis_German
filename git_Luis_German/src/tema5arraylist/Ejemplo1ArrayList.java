package tema5arraylist;

import java.util.ArrayList;

public class Ejemplo1ArrayList {

	public static void main(String[] args)
	{
		// crear un arrayList
		ArrayList<Factura> facturas = new ArrayList<Factura>();
		
		// añadir casillas al arrayList
		Factura f1 = new Factura("1","agua",32);
		Factura f2 = new Factura("2","basuras",32);
		Factura f3 = new Factura("3","luz",300);
		facturas.add(f1);
		facturas.add(f2);
		facturas.add(f3);
		
		// coger una casilla del arrayList
	/*	Factura casilla_cero = facturas.get(0) ;
		casilla_cero.mostrarFactura();
		Factura casilla_uno = facturas.get(1);
		casilla_uno.mostrarFactura();
	*/	
		// borrar una casilla
		// facturas.remove(1);
		Factura f5 = new Factura("4","Lo que sea" , 0);
		facturas.add(f5);
		//facturas.remove(f3);
		//facturas.remove(f5);
		//------------------------------------------------
		
		// LEER TODAS LAS CASILLAS DE UN ARRAYLIST
	/*	for(int i=0; i< facturas.size(); i++)
		{
			Factura casilla = facturas.get(i);
			casilla.mostrarFactura();
		}
	*/	
		//-----------------------------------------------
		
		facturas.add(new Factura("5","otra cosa",20));
		

		for (Factura casilla : facturas) {
			casilla.mostrarFactura();
		}
		//-----------------------------------------------
	}
}
