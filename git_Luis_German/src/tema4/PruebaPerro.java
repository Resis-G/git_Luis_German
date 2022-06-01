package tema4;

import java.util.Scanner;


public class PruebaPerro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// OBJETOS
		//------------------------------------------------------------
		Perro p1 = new Perro("123SE","Pastor Alemán",3,"1,5kg carne");
		p1.setEdad(3);
		p1.incrementarEdadEnUno();
		System.out.println("dame la nueva alimentacion");
		String x = sc.nextLine();
		p1.setAlimentacion(x);
		p1.setIdentificador("3344s");
		p1.setRaza("bulldog");
		p1.mostrarPerro();
		p1.calcularCosteVacunacion();
		//------------------------------------------------------------
		String identificadorDelPerroP1 = p1.getIdentificador();
		int edadDelPerroP1 = p1.getEdad();
		String laRazaDelPerroP1 = p1.getRaza();
		String laAlimentacionP1 = p1.getAlimentacion();
		//------------------------------------------------------------
		
		System.out.println("--------------------------------------------------------------");
		System.out.println("el identificador del perro es "+ identificadorDelPerroP1);
		System.out.println("la edad perro es " + edadDelPerroP1);
		System.out.println("la raza del perro es " + laRazaDelPerroP1);
		System.out.println("la alimentacion del perro es " + laAlimentacionP1);
		System.out.println("--------------------------------------------------------------");
		
		sc.close();

	}

}
