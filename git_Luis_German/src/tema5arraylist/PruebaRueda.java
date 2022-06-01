package tema5arraylist;

import java.util.ArrayList;
import java.util.Iterator;


public class PruebaRueda {

	public static void main(String[] args) {
		
		Rueda r1 = new Rueda("r1", "michelin", "2022", 80.0, true);
		Rueda r2 = new Rueda("r2", "michelin", "2022", 80.0, true);
		Rueda r3 = new Rueda("r3", "michelin", "2022", 80.0, true);
		Rueda r4 = new Rueda("r4", "michelin", "2022", 80.0, true);
		
	//	r1.mostrarRueda();
		
		ArrayList<Rueda> ruedas = new ArrayList<Rueda>();
		ruedas.add(r1);
		ruedas.add(r2);
		ruedas.add(r3);
		ruedas.add(new Rueda("r4", "michelin", "2022", 80.0, true));
		// ruedas.remove(new Rueda("r4","","",0.0,false));
		borrar_rueda(ruedas, "r4");
		//--------------------------------------------------------------------
		for (Rueda rueda : ruedas) {
		       rueda.mostrarRueda();	
		}
/*
		for(int i=0; i<ruedas.size();i++)
		{
			Rueda rueda = ruedas.get(i);
		}
*/
	}

	private static void borrar_rueda(ArrayList<Rueda> ruedas, String id_rueda) 
	{
		
	/*	Iterator<Rueda> it = ruedas.iterator();
		while(it.hasNext())
		{
			Rueda r = it.next();
			if(r.getNumeror().equalsIgnoreCase(id_rueda))
			{
				it.remove();
				break;
			}
		}
		*/
        for (Iterator iterator = ruedas.iterator(); iterator.hasNext();) {
			Rueda rueda = (Rueda) iterator.next();
			if(rueda.getNumeror().equalsIgnoreCase(id_rueda))
			{
				iterator.remove();
				break;
			}
		}
	}

}
