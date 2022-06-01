package tema5arraylist;

import java.io.IOException;
import java.util.Scanner;

public class ProgramaCoche {
	private static Scanner sc ;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int opcion = 0;
		   Coche c = new Coche();
           //--------------------------------------------------------
		   crearCoche(c);
		   //---------------------------------------------------------
		
		do {
			mostrarMenu();
			System.out.println("dame la opcion: ");
			opcion = sc.nextInt();
			sc.nextLine();
			//--------------------------------------------
			switch(opcion)
			{
			case 1:
				c.mostrarCoche();
				break;
			case 2:
				c.inflarRuedas();
				break;
			case 3:
				double precioRuedas = c.obtenerPrecioRuedas();
				System.out.println("el precio total de las ruedas es : " + precioRuedas);
				break;
			case 4:
				System.out.println("--------define ahora la puerta nueva:----------");
				System.out.println("identificador de la puerta-> ");
				String idpuerta = sc.nextLine();
				System.out.println("color puerta (BLANCO/NEGRO/VERDE/ROJO)");
				String textocolor = sc.nextLine();
				textocolor = textocolor.toUpperCase().trim(); //quito los espacios en blanco y convierto a mayusculas
				Colores colorpuerta = Colores.BLANCO;
				switch(textocolor)
				{
				case "BLANCO": 
					colorpuerta = Colores.BLANCO;
				break;
				case "NEGRO": 
					colorpuerta = Colores.NEGRO;
				break;
				case "VERDE": 
					colorpuerta = Colores.VERDE;
				break;
				case "ROJO": 
					colorpuerta = Colores.ROJO;
				break;
				default:
					colorpuerta = Colores.BLANCO;
				}
				System.out.println("¿ventanilla abierta? (SI/NO)");
				String textoventanilla = sc.nextLine();
				boolean abierta = false;
				if(textoventanilla.equalsIgnoreCase("SI"))
				{
					abierta = true;
				}
				Puerta puertaNueva = new Puerta(idpuerta,colorpuerta,abierta);
				System.out.println("ahora dime el identificador de la rueda que quieres cambiar: ");
				String idpuertaVieja = sc.nextLine();
				Puerta puertaVieja = new Puerta(idpuertaVieja,Colores.BLANCO,false);
				c.cambiarPuerta(puertaVieja,puertaNueva);
				break;
			case 5:
				System.out.println("Ahora dime el color de la puerta/s que quieres quitar: ");
				System.out.println("color puerta (BLANCO/NEGRO/VERDE/ROJO)");
				String textocolor1 = sc.nextLine();
				textocolor1 = textocolor1.toUpperCase().trim(); //quito los espacios en blanco y convierto a mayusculas
				Colores colorpuerta1 = Colores.BLANCO;
				switch(textocolor1)
				{
				case "BLANCO": 
					colorpuerta1 = Colores.BLANCO;
				break;
				case "NEGRO": 
					colorpuerta1 = Colores.NEGRO;
				break;
				case "VERDE": 
					colorpuerta1 = Colores.VERDE;
				break;
				case "ROJO": 
					colorpuerta1 = Colores.ROJO;
				break;
				default:
					colorpuerta1 = Colores.BLANCO;
				}
				c.quitarPuertasDelColor(colorpuerta1);
				break;
			case 6:
				break;
			default:
				System.out.println("opción incorrecta, vuelve a probar ");
				break;
		 //--------------------------------------------------
			}
		}while(opcion != 6);
		
		sc.close();
	}

	private static void crearCoche(Coche c) {
		    System.out.println("dame la matricula: ");
		    String matricula = sc.nextLine();
			c.setMatricula(matricula);
			//------------------------------------------
			System.out.println("dame la marca: ");
			String marca = sc.nextLine();
			c.setMarca(marca);
			//------------------------------------------
			System.out.println("precio del coche: ");
			double precio = sc.nextDouble();
			sc.nextLine();
			c.setPrecio(precio);
			//------------------------------------------
			for(int i=0; i<4; i++)
			{
				System.out.println("--------define ahora la rueda:----------");
				System.out.println("identificador de la rueda-> ");
				String idrueda = sc.nextLine();
				System.out.println("marca de la rueda-> ");
				String marcarueda = sc.nextLine();	
				System.out.println("modelo de la rueda-> ");
				String modelorueda = sc.nextLine();
				System.out.println("precio de la rueda->");
				double preciorueda = sc.nextDouble();
				sc.nextLine();
				System.out.println("¿rueda inflada? (SI/NO)");
				String ruedainflada = sc.nextLine();
				boolean inflado = false;
				if(ruedainflada.equalsIgnoreCase("SI"))
				{
					inflado = true;
				}
				c.getRuedas().add(new Rueda(idrueda, marcarueda, modelorueda, preciorueda, inflado));
			}
			for(int i=0; i< 4 ; i++)
			{
				System.out.println("--------define ahora la puerta:----------");
				System.out.println("identificador de la puerta-> ");
				String idpuerta = sc.nextLine();
				System.out.println("color puerta (BLANCO/NEGRO/VERDE/ROJO)");
				String textocolor = sc.nextLine();
				textocolor = textocolor.toUpperCase().trim(); //quito los espacios en blanco y convierto a mayusculas
				Colores colorpuerta = Colores.BLANCO;
				switch(textocolor)
				{
				case "BLANCO": 
					colorpuerta = Colores.BLANCO;
				break;
				case "NEGRO": 
					colorpuerta = Colores.NEGRO;
				break;
				case "VERDE": 
					colorpuerta = Colores.VERDE;
				break;
				case "ROJO": 
					colorpuerta = Colores.ROJO;
				break;
				default:
					colorpuerta = Colores.BLANCO;
				}
				System.out.println("¿ventanilla abierta? (SI/NO)");
				String textoventanilla = sc.nextLine();
				boolean abierta = false;
				if(textoventanilla.equalsIgnoreCase("SI"))
				{
					abierta = true;
				}
				c.getPuertas().add(new Puerta(idpuerta,colorpuerta, abierta));
			}
             //-----------------------------------------------------------
	}

	private static void mostrarMenu() {
		
		System.out.println("-------------------------------------------");
		System.out.println(
				  "1) Mostrar datos del coche\r\n"
				+ "2) Inflar ruedas\r\n"
				+ "3) Mostrar precio total de las ruedas\r\n"
				+ "4) Cambiar puerta\r\n"
				+ "5) Quitar puertas de un color:\r\n"
				+ "6) Salir");
	}

}
