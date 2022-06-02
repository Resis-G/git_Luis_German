package serie_aritmetica;

/*Definir una clase que permita representar una serie aritmética; una serie tal
viene caracterizada por el primer elemento de la serie y el incremento o diferencia
entre dos elementos sucesivos de la serie. Implementar un método que permita calcular
la suma de los n primeros elementos de la serie (utilizar un bucle para realizar
operacíón) y otro método para mostrar los n primeros términos (ej. 9.10 de Aprender a
programar con Java).
*/

public class SerieAritmetica {
	
	private int a1; // primer término
	private int d; // incremento o diferencia de un término a otro
	
	
	
	public int getA1() {
		return a1;
	}

	public void setA1(int a1) {
		this.a1 = a1;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	SerieAritmetica(int a1, int d){
		this.a1 = a1;
		this.d = d;
	}
	
	// método para mostrar los n primeros términos de la serie
	public void muestra(int n) {
		// se muestran los n primeros términos de la serie
		int i;
		int an;
		
		an = a1;
		for(i = 1; i <= n; i++) {
			System.out.println("a" + i + ": " + an);
			an = an + d;
		}
	}
	
	// método para sumar los n primeros términos de la serie
	public int suma(int n) {
		int i, an, suma=0;
		for(i=0; i < n; i++) {
			an = a1 + (i * d);
			suma = suma + an;
		}
		return suma;
	}

}
