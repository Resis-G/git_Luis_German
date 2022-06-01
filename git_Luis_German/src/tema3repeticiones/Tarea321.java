package tema3repeticiones;

import java.util.Scanner;

/*
 * “PRECIO FINAL DE ENTRADA DE CINE”  
Haz un programa que calcule el precio final de una entrada de cine, teniendo en 
cuenta los siguientes puntos: 
 
Inicialmente, se le pregunta al cliente la edad que tiene y el día de la semana que 
desea ir al cine.  
• Si el cliente está jubilado (tiene una edad igual o superior a 65 años), el precio 
de la entrada será de 3 euros. 
• Si el cliente es general (su edad es igual o superior a 18 años y menor de 65 
años), el precio de la entrada será de 5 euros. 
• Si el cliente es menor de edad (tiene menos de 18 años) el precio de la entrada 
será de 4 euros. 
• Si la edad introducida es menor o igual que cero, avisa con un mensaje de error 
que la edad introducida no puede ser negativa y asigna un precio de la entrada 
de 5 euros. 
 
Ten también en cuenta, que si el día de la semana elegido es el martes (días del 
espectador), el precio de la entrada tendrá un descuento de un euro sobre el precio 
anteriormente calculado.
 */
public class Tarea321 {

	public static void main(String[] args) {
	
		final String codigoSecreto ="ALCINE10";

   // recoger los datos de entrada desde el teclado		
   //------------------------------------------------------------------
   Scanner sc = new Scanner(System.in);
   System.out.println("dame la edad que tienes ");
   int edad = sc.nextInt(); // para leer un entero utilizo nextInt()
   sc.nextLine(); // limpiar el salto de línea
   System.out.println("dame ahora el día de la semana: ");
   String dia = sc.nextLine(); // para leer un string utilizo nextLine
   //-------------------------------------------------------------------
   double precioEntrada = 0.0;
   
   if(edad >= 65) // es jubilado
   {
	  precioEntrada = 3.0;
   }
   else if( edad >= 18 && edad < 65) // es general
   {
	   precioEntrada = 5.0;
   }
   else if (edad<18 && edad >=0) // es niño
   {
	   precioEntrada = 4.0;
   }
   else // edad errónea
   {
	   System.out.println("edad errónea, te asigno 5€ que es el precio por defecto:");
	   // ha habido un error
	   precioEntrada = 5.0;
   }
   //---------------------------------------------------------------------
   double descuento = 0.0;
   if(dia.equalsIgnoreCase("martes"))
   {
	   descuento = 1.0;
   }
   //---------------------------------------------------------------------
   double precio = precioEntrada - descuento;
   //---------------------------------------------------------------------
   System.out.println("dispones de código promocional? (SI/NO) ");
   String respuesta = sc.nextLine(); // para leer un texto (String) hay que utilizar nextLine()
   double descuento2 = 0.0;
   if(respuesta.equalsIgnoreCase("SI"))
   {
	   System.out.println("pues dame el código promocional......");
	   String codigo = sc.nextLine();
	   if(codigo.equals(codigoSecreto))
	   {
		   descuento2 = precio * 0.10;
	   }
   }
   //------------------------------------------------------------------------
   System.out.println("el precio de la entrada es " + precioEntrada +"€");
   System.out.println("el descuento por día del espectador es de " + descuento + "€");
   System.out.println("el descuento por código promocional es de " + descuento2 + "€");
   double preciofinal = precioEntrada - descuento - descuento2;
   System.out.println("el precio final es " + preciofinal + "€");
   sc.close();
	}

}
