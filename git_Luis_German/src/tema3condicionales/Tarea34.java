package tema3condicionales;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Tarea34 {
	/*
	 * En un determinado comercio se realiza un descuento dependiendo del precio de 
	del producto. Si el precio es inferior a 100 euros, no se hace descuento; si es 
	mayor o igual a 100 euros y menor que 200 euros, se hace un 5% de descuento, y 
	si es mayor o igual a 200 euros, se hace un 10% de descuento. Haz un programa 
	que lea por teclado el precio de un producto y nos calcula y muestre por pantalla 
	su precio final. 
	 */
	
	public static void main(String[] args)
	{
		// constantes
		final double DESCUENTO1 = 0.05;
		final double DESCUENTO2 = 0.10;
		//-------------------------------------------------------
		Scanner sc = new Scanner(System.in);
		System.out.println("dame el precio del producto: ");
		double precio = sc.nextDouble();
		//--------------------------------------------------------
		double descuento = 0.0;
		if(precio >0.0)
		{
			if(precio >0.0 && precio <100.0 )
			{
				descuento = 0.0;
			}
			else if(precio >=100.0 && precio <200.0)
			{
				descuento = precio * DESCUENTO1;
			}
			else if(precio>=200.0)
			{
				descuento = precio * DESCUENTO2;
			}
		
			DecimalFormat df = new DecimalFormat("#.00");
			System.out.println("el descuento aplicado es de : " + df.format(descuento));
			double precioFinal = precio - descuento;
			System.out.println("El precio final del producto es " + df.format(precioFinal));
		}
		else {
			System.out.println("error el precio no puede ser negativo");
		}
		sc.close();
}
}
