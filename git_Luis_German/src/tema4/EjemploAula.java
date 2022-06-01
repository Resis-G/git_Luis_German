package tema4;

import java.util.Scanner;

public class EjemploAula {

	public static void main(String[] args) {

		// voy a crear objetos de la clase ordenador
		// un objeto podeis verlo con una variable de tipo ordenador
		Scanner sc = new Scanner(System.in);
		
		System.out.println("dame el identificador del ordenador");
		String identificador = sc.nextLine();
		System.out.println("dame los datos del disco duro ");
		String discoduro = sc.nextLine();
		System.out.println("dame ahora los datos de la RAM");
		String memoriaRAM =sc.nextLine();
		System.out.println("dame la antiguedad del ordenador ");
		int anyosantiguedad = sc.nextInt();
		sc.nextLine(); // limpiar el salto de línea
		
		Ordenador o7 = new Ordenador(identificador, discoduro, memoriaRAM, anyosantiguedad); 
		o7.mostrarOrdenador();
		// sc.close();
	}

}
