package numero_mayor_array;

public class MayorNumero {
	/**
	 * Devuelve el elemento de mayor valor de una lista
	 *
	 * @param list
	 *            Un array de enteros
	 * @return El entero de mayor valor de la lista
	 */
	public static int obt_mayorNumero(int lista[]) {
		//produce Exepcion al mirar en un sitio donde hay nada
		int indice, max = Integer.MIN_VALUE;
		for (indice = 0; indice < 4; indice++) {
			
			if (lista[indice] > max) {
				max = lista[indice];
			}
		}
		
		return max;
	}
	public static int obt_mayorNumero_Codigooriginal(int lista[]) {
		
		
		int indice, max = Integer.MIN_VALUE;
		for (indice = 0; indice < lista.length; indice++) {
			
			if (lista[indice] > max) {
				max = lista[indice];
			}
		}
		return max;
		
		
	}
	
	
	public static int obt_mayorNumero2(int lista[]) {
		// se produce exepcion al al tener el primer elemento del array igual a cero
		int indice, max = Integer.MIN_VALUE;
		for (indice = 0; indice < lista.length; indice++) {
			
			if (lista[indice] > max)
			{	int execpcion = max/lista[indice];
				max = lista[indice];
			}
		}
		
		return max;
	}

}
