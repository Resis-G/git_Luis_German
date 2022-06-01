package tema4;

/*
 * 
8. Haz un programa que informe del consumo medio de gasolina de un coche. 
Para ello disponemos de los siguientes datos 
que se han obtenido por teclado: 
• El kilometraje que estábamos cuando se repostó. (ej: 120) 
• El kilometraje actual. (ej: 180) 
• Lo litros de gasolina cuando se repostó. (ej: 20) 
• Los litros de gasolina actual. (ej: 17) 
 
 El programa devolverá la siguiente información: 
 Kilómetros recorridos: 60 km 
Gasolina gastada: 3 litros 
Consumo medio cada 100 kms: 5 litros (haz una regla de 3 para sacarlo) 
 
 
 */

public class Extra45 {

	public static void main(String[] args) {
		
		// Coche c1 = new Coche();
		Coche c2 = new Coche(2000,50);
		// Coche c3 = new Coche(2000,2100, 20, 15);
		//---------------------------------
		c2.incrementar_kms(200);
		c2.disminuir_gas(13);
		c2.incrementar_kms(300);
		c2.disminuir_gas(20);
		c2.incrementar_kms(100);
		c2.disminuir_gas(8);
		//------------------------------
		c2.mostrarCoche();
		//------------------------------
		
		
	}

}
