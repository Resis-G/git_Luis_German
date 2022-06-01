package tema3repeticiones;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Tarea332 {

	/*
	 * CALCULAR ESTADÍSTICAS DEL EXAMEN” (3 puntos) 
 
Pide por teclado la nota obtenida por 3 alumnos en el último examen y muestra por 
pantalla la siguiente información: (redondea los resultados a dos decimales) 
NUMERO DE ALUMNOS QUE APRUEBAN EL EXAMEN:   
NOTA MAS BAJA DEL EXAMEN: 
NOTA MEDIA DE LOS ALUMNOS QUE APRUEBAN EL EXAMEN:   
• Un alumno aprueba el examen si saca una nota igual o superior a 5 puntos. 
• Para sacar la nota media de los alumnos que aprueban el examen, cuenta 
solamente los alumnos que superaron el examen. Por ejemplo, si el alumno1 
saca un 3, el alumno2 un 5, y el alumno3 un 6, la nota media de los alumnos 
aprobados el examen sería de 5,5. (pues (5+6)/2 = 5,5 y la nota del alumno1 no 
cuenta). Si ningún alumno aprueba el examen, dicha media será cero
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int NUM_ALUMNOS = 3; // constante 
		int aprobados = 0;
		double notaMasBaja = 10000.0;
		double suma = 0.0;
		for(int i=1; i<=NUM_ALUMNOS; i++)
		{
			// pedir nota
			System.out.println("dime la nota del alumno: " + i);
			double nota = sc.nextDouble();
			// limpiar el salto de línea
			sc.nextLine();
			if(nota>=5 && nota <= 10)
			{
				aprobados++; // incrementa en uno el número de aprobados
				             // aprobados = aprobados + 1;
			}
			if(nota < notaMasBaja)
			{
				notaMasBaja = nota; // cambio la nota mas baja por la nueva nota
			}
			suma = suma + nota;
		}
		
		DecimalFormat df = new DecimalFormat("#.00");
		if(NUM_ALUMNOS > 0)
		{
			System.out.println("el número de aprobados fue de " + aprobados);
			System.out.println("la nota mas baja fue de : " + notaMasBaja);
			double media = suma / NUM_ALUMNOS;
			System.out.println("la nota media es de " + df.format(media));
		}
		else {
		System.out.println("no hay alumnos");
		}
		sc.close();
	}

}
