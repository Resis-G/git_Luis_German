package tema5arrays;

public class Apuesta {
	int[] numeros;
	final int CANT_NUMEROS = 6;
	//----------------------------------
	public Apuesta(int[] numeros) {
		this.numeros = numeros;
	}
	
	public Apuesta() {
		this.numeros = new int[CANT_NUMEROS];
	}
	/*
	public Apuesta(int n1, int n2, int n3, int n4, int n5 , int n6) {
		this.numeros = new int[6];
		this.numeros[0] = n1;
		this.numeros[1] = n2;
		this.numeros[2] = n3;
		this.numeros[3] = n4;
		this.numeros[4] = n5;
		this.numeros[5] = n6;
	}
	*/
	//----------------------------------------

	public int[] getNumeros() {
		return numeros;
	}

	public void setNumeros(int[] numeros) {
		this.numeros = numeros;
	}

	public int getCANT_NUMEROS() {
		return CANT_NUMEROS;
	}
	
	//-------------------------------------------
	
	public void mostrarApuesta()
	{
		for(int i=0; i< CANT_NUMEROS; i++)
		{
			System.out.print(" " + this.numeros[i]);
		}
		System.out.println("\n --------------------");
	}

	//-----------------------------------------------
	public void rellenarApuestaConNumerosAleatorios() {
		int mayor = 49;
		int menor =1;
		for(int i=0; i<CANT_NUMEROS; i++)
		{
			int numero = (int)(Math.random()*(mayor-menor+ 1))+menor;
			if(!contiene(this.numeros,numero))
			{
				this.numeros[i] = numero;
			}
			else {
				i--;
			}
		}
	}

	private boolean contiene(int[] numeros2, int numero) {
		for(int i=0; i<numeros2.length; i++)
		{
			int casilla = numeros2[i];
			if(casilla == numero)
			{
				return true;
			}
		}
		return false;
	}

	public int comprobarApuesta(Apuesta a_ganadora) {
		int aciertos = 0;
		for(int i=0; i< CANT_NUMEROS; i++)
		{
			int numero = this.numeros[i];
			if(contiene(a_ganadora.getNumeros(), numero))
			{
				aciertos++;
			}
		}
		return aciertos;
	}
}
