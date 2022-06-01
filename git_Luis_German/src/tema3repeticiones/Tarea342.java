package tema3repeticiones;

import java.util.Scanner;

public class Tarea342 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int NUMERO_ALUMNOS = 10; // constante, una variable que no puede cambiar su valor
		
		
		int aprobados = 0;
		int suspensos = 0;
		double notaMasBaja=10;
		double notaMasAlta=0;
		double suma = 0.0;
		double sumaAprobados = 0.0;
		double sumaSuspensos = 0.0;
		
		for(int i=1; i<=NUMERO_ALUMNOS; i++)
		{
			double nota = 0.0;
			//-----------------------------------------------------
			do {	
			System.out.println("dime la nota del alumno " + i);
			nota = sc.nextDouble();
			sc.nextLine();
			if(nota < 0 || nota > 10)
			{
				System.out.println("nota no valida, vuelve a intertarlo");
			}
			}while(nota <0 || nota > 10);
			//------------------------------------------------------
			suma = suma + nota;
			//------------------------------------------------------
			if(nota >= 5)
			{
				// ha aprobado el alumno
				// aprobados++;
				aprobados = aprobados + 1;
				sumaAprobados = sumaAprobados + nota;
			}
			else {
				// ha suspendido el alumno
				// suspensos++;
				suspensos = suspensos + 1;
				sumaSuspensos = sumaSuspensos + nota;
			}
			//-----------------------------------------------------
			if(nota < notaMasBaja)
			{
				notaMasBaja = nota;
			}
			//-----------------------------------------------------
			if(nota > notaMasAlta)
			{
				notaMasAlta = nota;
			}
			//---------------------------------------------------------
		}
		

		
		System.out.println("NUMERO DE ALUMNOS QUE HAN APROBADO: " + aprobados);
		System.out.println("NUMERO DE ALUMNOS QUE HAN SUSPENDIDOS: " + suspensos);
		System.out.println("NOTA MAS ALTA: " + notaMasAlta);
		System.out.println("NOTA MAS BAJA: " + notaMasBaja);
		if(NUMERO_ALUMNOS > 0)
		{
			double media = suma / NUMERO_ALUMNOS;
			System.out.println("NOTA MEDIA DEL GRUPO: " + media);
			double mediaAprobados = sumaAprobados / aprobados;
			System.out.println("NOTA MEDIA DE LOS ALUMNOS QUE APRUEBAN: " + mediaAprobados);
			double mediaSuspensos = sumaSuspensos / suspensos;
			System.out.println("NOTA MEDIA DE LOS ALUMNOS QUE SUSPENDEN: " + mediaSuspensos);
		}
		sc.close();
	}

}
