package tema3condicionales;

import java.text.DecimalFormat;
import java.util.Scanner;

/*

Que calcule el sueldo que le corresponde al trabajador de una empresa que cobra 
40.000 euros anuales, el programa debe realizar los c�lculos en funci�n de los 
siguientes criterios:  
 
� Si lleva m�s de 10 a�os en la empresa se le aplica un aumento del 10%. 
� Si lleva menos de 10 a�os pero m�s que 5 se le aplica un aumento del 7%. 
� Si lleva menos de 5 a�os pero m�s que 3 se le aplica un aumento del 5%. 
� Si lleva menos de 3 a�os se le aplica un aumento del 3%. 
 
*/

public class Ejercicio312 {

	public static void main(String[] args) {

		final double AUMENTO1 = 0.10; // constante
		final double AUMENTO2 = 0.07;
		final double AUMENTO3 = 0.05;
		final double AUMENTO4 = 0.03;
		//-------------------------------------------------------
		double sueldo = 40000.0;
		double aumento = 0.0;
		
		//-------------------------------------------------------
		Scanner sc = new Scanner(System.in);
		System.out.println("dame la antig�edad: ");
		int antiguedad = sc.nextInt();
		if(antiguedad <0)
		{
				System.out.println("no puedes tener una antig�edad menor que cero");
				System.out.println("fin");
		}
		else {
			//------------------------------------------------------
			if(antiguedad >= 10)
			{
				aumento = sueldo * AUMENTO1;
			}
			else if( antiguedad >=5 && antiguedad <10) // LA SEGUNDA CONDICION SOBRA!!!
			{
				aumento = sueldo * AUMENTO2;
			}
			else if( antiguedad >=3 && antiguedad <5) // LA SEGUNDA CONDICION SOBRA!!!
			{
				aumento = sueldo * AUMENTO3;
			}
			else if( antiguedad >=0 && antiguedad <3) // LA SEGUNDA CONDICION SOBRA!!!
			{
				aumento = sueldo * AUMENTO4;
			}
			
			double totalSueldo = sueldo + aumento;
			DecimalFormat df = new DecimalFormat("#.00");
			System.out.println("el aumento de sueldo es: " + df.format(aumento) + "�");
			System.out.println("el nuevo sueldo ser�: " + df.format(totalSueldo)+ "�");
			//--------------------------------------------------------------
			sc.close();
		}
		
		
		
	}

}
