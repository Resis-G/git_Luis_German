package tema2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio18 {
	/*
	 * Haz un programa que informe del consumo medio de gasolina de un coche. Para ello disponemos de los siguientes datos que se han obtenido por teclado:
	El kilometraje que estábamos cuando se repostó. (ej: 120)
	El kilometraje actual. (ej: 180)
	Lo litros de gasolina cuando se repostó. (ej: 20)
	Los litros de gasolina actual. (ej: 17)
	 */
	public static void main(String[] args)
	{
		// km iniciales
		// km finales
		// km recorridos = km finales - km iniciales
		
		// gasolina inicial
		// gasolina final
		// gasolina consumida = gasolina inicial - gasolina fina
		
		
		// km recorridos -> gasolina consumida
		// 100 kms       -> resultado
		
		// resultado = 100.0 * gasolina consumida / km recorridos
		Scanner sc = new Scanner(System.in);
		
		System.out.println("dame los kms actuales: ");
		double kmi = sc.nextDouble();
		// limpio el salto de linea por si tengo problemas
		sc.nextLine();
		
		System.out.println("dime ahora la gasolina actual: ");
		double gasi = sc.nextDouble();
		sc.nextLine();
		
		
		System.out.println("dame los kms finales: ");
		double kmf = sc.nextDouble();
		// limpio el salto de linea por si tengo problemas
		sc.nextLine();
		
		System.out.println("dime ahora la gasolina final: ");
		double gasf = sc.nextDouble();
		sc.nextLine();
		
		double km_recorridos = kmf - kmi;
		double gas_gastada = gasi - gasf;
		
		double resultado = 100.0 * gas_gastada / km_recorridos;
		DecimalFormat df = new DecimalFormat("#.0");
		System.out.println("el consumo medio del coche cada 100 kms es de "+ df.format(resultado)  + " litros");
		sc.close();
	}

}
