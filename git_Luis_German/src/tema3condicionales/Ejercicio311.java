package tema3condicionales;

import java.util.Scanner;

public class Ejercicio311 {

	/*
	 * Haz un programa que lea un importe bruto y calcule su importe neto, si es mayor de 15.000 se le aplicará un 16% de impuestos, en caso contrario se le aplicará un 10%.
	 */
	public static void main(String[] args) {
		final double IVA1 = 0.16;
		final double IVA2 = 0.10;
		final double CANTIDAD = 15000.0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("dame el importe bruto que has ganado: ");
		double importeBruto = sc.nextDouble();
		//-----------------------------------------------------------------
			if(importeBruto <= 0 || importeBruto > 10000000)
			{
				System.out.println("error al poner el sueldo bruto, valor no permitido");
			}
			else {
				double retenciones = 0.0;
				if(importeBruto >= CANTIDAD)
				{
					retenciones = importeBruto * IVA1;
					
				}
				else {
					retenciones = importeBruto * IVA2;
					
				}
				System.out.println("tienes que pagar a hacienda " + retenciones + "€");
				double importeNeto = importeBruto - retenciones;
				System.out.println("has ganado el neto de " + importeNeto+ "€");

			}
			sc.close();
			}
		//-----------------------------------------------------------------
		

}
