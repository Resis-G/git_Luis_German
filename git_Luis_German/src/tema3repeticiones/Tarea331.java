package tema3repeticiones;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Tarea331 {
/*
 * “PRECIO FINAL DEL PEDIDO EN LA HAMBURGUESERÍA” (4 puntos) 
Haz un programa que calcule el precio final de un pedido en la hamburguesería 
teniendo en cuenta los siguientes puntos: 
 
Inicialmente, se le preguntará al cliente qué tipo de hamburguesa quiere: 
• Si elige la hamburguesa “Mac Pollo” el precio de la hamburguesa será de 3 
euros. 
• Si elige “XXL” el precio de la hamburguesa será de 4 euros. 
• Si elige otra hamburguesa, muestra el mensaje “lo siento, no tenemos esa 
hamburguesa, te pongo la Mac Pollo” y asígnale el precio de la hamburguesa a 
3 euros. 
 
Ahora pide el complemento: 
• Si elige patatas, el precio del complemento es 2 euros. 
• Si elige coca cola, el precio del complemento es 2,5 euros. 
• Si elige no, el precio del complemento es 0 euros. 
• Si elige cualquier otra cosa, muestra un mensaje de error que ponga, no existe 
ese complemento. Asigna un precio de complemento a 0 euros. 
 
Finalmente, pregunta al cliente si dispone un código promocional: 
• si su respuesta es “si”, pide que el código promocional. Si el código insertado es 
“MAC15” realiza un descuento del 15% sobre el precio calculado anteriormente 
(hamburguesa + complemento).   
• Si su respuesta es “no”, no obtendrá descuento por código promocional. 
 
Muestra por pantalla los siguientes datos: 
✓ Precio de la hamburguesa 
✓ Precio de la hamburguesa con el complemento 
✓ Descuento por cupón promocional 
✓ Precio final del pedido aplicado el descuento.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final String CODIGO_SECRETO = "MAC123";
		double descuento = 0.0;
		double precioMenu = 0.0;
		//---------------------------------------------------------------
		System.out.println("dame el tipo de hamburguesa: (Mac Pollo, XXL)");
		String tipoHamburguesa = sc.nextLine();
		double precioHamburguesa = 0.0;
		if(tipoHamburguesa.equalsIgnoreCase("Mac pollo"))
		{
			precioHamburguesa = 3.0;
		}
		else if(tipoHamburguesa.equalsIgnoreCase("XXL"))
		{
			precioHamburguesa = 4.0;
		}
		else {
			System.out.println("no disponemos de esa Hamburguesa, te pongo Mac Pollo a 3€");
			tipoHamburguesa = "Mac Pollo";
			precioHamburguesa = 3.0;
		}
		//----------------------------------------------------------------
		System.out.println("dame el complemento: (coca cola, patatas)");
		String tipoComplemento= sc.nextLine();
		double precioComplemento = 0.0;
		if(tipoComplemento.equalsIgnoreCase("patatas"))
		{
			precioComplemento = 2.0;
		}
		else if(tipoComplemento.equalsIgnoreCase("coca cola"))
		{
			precioComplemento = 2.5;
		}
		else if(tipoComplemento.equalsIgnoreCase("no"))
		{
			precioComplemento = 0.0;
		}
		else {
			System.out.println("no tengo ese complemento ");
			precioComplemento = 0.0;
		}
		//----------------------------------------------------------------
		precioMenu = precioHamburguesa + precioComplemento;
		System.out.println("¿dispone de un código promocional? (SI/NO)");
		String respuesta = sc.nextLine();
		if(respuesta.equalsIgnoreCase("SI"))
		{
			System.out.println("vale, dime el código: ");
			String codigo = sc.nextLine();
			if(codigo.equals(CODIGO_SECRETO))
			{
				System.out.println("enhorabuena, ha conseguido un descuento de un 15%");
				descuento = precioMenu * 0.15;
			}		
		}
		else {
			System.out.println("no obtiene descuento por código promocional");
		}
		double precioFinal = precioMenu - descuento;
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("----------------------------------------");
		System.out.println("precio de la hamburguesa-> " + df.format(precioHamburguesa)+ "€");
		System.out.println("precio del complemento -> " + df.format(precioComplemento)+ "€");
		System.out.println("TOTAL PRECIO MENU: " + df.format(precioMenu)+"€");
		System.out.println("DESCUENTO POR CÓDIGO PROMOCIONAL: " + df.format(descuento)+"€");
		System.out.println("TOTAL A PAGAR: " + df.format(precioFinal) +"€");
		System.out.println("----------------------------------------");
		sc.close();
		
		

	}

}
