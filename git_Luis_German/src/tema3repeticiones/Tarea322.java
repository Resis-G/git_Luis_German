package tema3repeticiones;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Tarea322 {

	/*
	 * CALCULAR ESTADÍSTICAS DEL VIAJE AL MUSEO”  
 
Un grupo de alumnos desea hacer un viaje al museo del Prado. Para ello, se contrata 
un autobús que tiene fijado un precio, independiente del número de alumnos que 
vayan (por ejemplo, 350 euros.). Pide el precio del alquiler del autobús. 
 
Por otro lado, pide también por teclado el número de alumnos que van al viaje y el 
precio de la entrada que debe pagar cada alumno. (por ejemplo, 60 alumnos y el 
precio de la entrada 10 euros). 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("dame el precio del alquiler del autobus: ");
		double precioAutobus = sc.nextDouble();
		sc.nextLine(); // quitar el salto de línea
		//--------------------------------------------------------------------------
		System.out.println("dame el número de alumnos: ");
		int numeroAlumnos = sc.nextInt();
        sc.nextLine();
        //--------------------------------------------------------------------------
        System.out.println("dame el precio de la entrada: ");
        double precioEntrada = sc.nextDouble();
        sc.nextLine();
        //--------------------------------------------------------------------------
        double totalRecaudado = numeroAlumnos * precioEntrada;
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("el total recaudado es de " + df.format(totalRecaudado)+"€");
        //--------------------------------------------------------------------------
        double beneficio = totalRecaudado - precioAutobus;
        if(beneficio > 0.0)
        {
        	System.out.println("el beneficio del viaje fue de " + df.format(beneficio) +"€");
        }
        else if(beneficio == 0.0)
        {
        	System.out.println("sin beneficio ni perdidas");
        }
        else {
        	System.out.println("el viaje tuvo unas perdidas de " + df.format(Math.abs(beneficio)) +"€");
        }
        	sc.close();
	}

}
