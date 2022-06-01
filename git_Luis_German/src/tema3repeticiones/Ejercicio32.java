package tema3repeticiones;

import java.util.Scanner;

public class Ejercicio32 {

	public static void main(String[] args) {
		/*
		 * Muestra mensualmente el dinero total que tienes acumulado en el banco si cada mes 
           ingresas en éste  900 euros. ¿Cuánto dinero tendrás al final del año?
		 */
			Scanner sc = new Scanner(System.in);
			
			double dinero = 0.0;
			double incremento = 0.0;
			
			for( int i = 1; i<= 12; i++)
			{
				System.out.println("dame el dinero que vas a meter este mes");
				incremento = sc.nextDouble();
				// limpiar el salto de linea
				sc.nextLine();
				
				// System.out.println("numero de mes: " + i);
				dinero = dinero +  incremento;
				System.out.println("dinero del mes " + i + "->" + dinero+ "€");
			}
			sc.close();
	}

}
