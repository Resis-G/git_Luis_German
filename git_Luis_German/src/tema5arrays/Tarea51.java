package tema5arrays;

import java.util.Scanner;

/*
 * Haz Programa que lea por teclado las temperaturas de los 10 últimos días y los 
almacene en un array de números decimales.  
 
A continuación, muestra e implementa el siguiente menú: 
1) Temperatura media 
2) Temperatura máxima 
3) Temperatura mínima 
4) Días por encima de la media 
5) Salir 
 
• Temperatura media: muestra la temperatura media de los últimos 10 días 
• Temperatura máxima: muestra la máxima temperatura alcanzada. 
• Temperatura mínima: muestra la mínima temperatura alcanzada. 
• Días por encima de la media: muestra los días que tuvieron una temperatura 
por encima de la temperatura media. 
 */
public class Tarea51 {
	//--------------------------------------------------------------------------
	private static double calcularTemperaturaMenor(double[] temperaturas) {
		double menor = temperaturas[0];
		for(int i=0; i< temperaturas.length; i++)
		{
			double casilla = temperaturas[i];
			if(casilla < menor)
			{
				menor = casilla;
			}
		}
		return menor;
	}
	//--------------------------------------------------------------------------
	private static double calcularTemperaturaMayor(double[] temperaturas) {
		
		double mayor = temperaturas[0];
		for(int i=0; i< temperaturas.length; i++)
		{
			double casilla = temperaturas[i];
			if(casilla > mayor)
			{
				mayor = casilla;
			}
		}
		return mayor;
	}

	//--------------------------------------------------------------------------
	private static double calcularTemperaturaMedia(double[] temperaturas) {
		double suma = 0.0;
		for(int i=0; i<temperaturas.length;i++)
		{
			double casilla = temperaturas[i];
			suma  = suma + casilla;
		}
		double media = suma / temperaturas.length;
		return media;
	}
	//-------------------------------------------------------------------------
	private static void mostrarDiasPorEncimaDeLaMedia(double[] temperaturas) {
		double media = calcularTemperaturaMedia(temperaturas);
		for(int i=0; i< temperaturas.length; i++)
		{
			double casilla = temperaturas[i];
			if(casilla >= media)
			{
				System.out.println("dia " + i + "->" + casilla + "ºC");
			}
		}
		
	}
	//-------------------------------------------------------------------------
	private static void mostrarMenu() {
		System.out.println("1) Temperatura media ");
		System.out.println("2) Temperatura maxima ");
		System.out.println("3) Temperatura minima ");
		System.out.println("4) Dias por encima de la media ");
		System.out.println("5) Salir  ");
		System.out.println("---------------------------------- ");
		System.out.println("Elige opcion:  ");		
	}
	//-------------------------------------------------------------------------
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//----------------------------------------------------
		final int NUM_DIAS = 10;
		double[] temperaturas = new double[NUM_DIAS];
		//-------------------------------------------------
		for(int i=0; i< NUM_DIAS; i++)
		{
			System.out.println("DAME LA TEMPERATURA DEL DIA " + i);
			double temp = sc.nextDouble();
			temperaturas[i] = temp; // asignar un valor a una casilla
		}
		
		//-------------------------------------------------
		for(int i=0; i< NUM_DIAS; i++)
		{
			double temp = temperaturas[i]; // leer el valor de una casilla
            System.out.print(" ," + temp);
		}
		System.out.println("");
		//-------------------------------------------------
		int opcion = 0;
		do {
				mostrarMenu( );
				opcion = sc.nextInt();
				sc.nextLine();
				switch(opcion)
				{
				case 1:
					double media = calcularTemperaturaMedia(temperaturas);
					System.out.println("*********************************************");
					System.out.println("la temperatura media vale: " + media);
					System.out.println("*********************************************");
					break;
				case 2:
					double max = calcularTemperaturaMayor(temperaturas);
					System.out.println("*********************************************");
					System.out.println("la temperatura mayor vale: " + max);
					System.out.println("*********************************************");
					break;
				case 3:
					double min = calcularTemperaturaMenor(temperaturas);
					System.out.println("*********************************************");
					System.out.println("la temperatura menor vale: " + min);
					System.out.println("*********************************************");
					break;
				case 4: 
					mostrarDiasPorEncimaDeLaMedia(temperaturas);
					break;
				case 5:
					System.out.println("que tenga buen dia");
					break;
				default:
					System.out.println("opcion inválida, vuelve a intentarlo");
					break;
				}
			}
		while(opcion != 5);
		System.out.println("FIN");

	}


	
	


}
