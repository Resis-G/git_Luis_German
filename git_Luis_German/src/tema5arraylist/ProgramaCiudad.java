package tema5arraylist;

import java.util.Scanner;

public class ProgramaCiudad {
	static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int opcion = 0;
		String nombre;
		String codigo;
		//---------------------------------------------------
		System.out.println("dame el codigo de la ciudad: ");
		codigo = sc.nextLine();
		System.out.println("dame el nombre de la ciudad: ");
		nombre = sc.nextLine();
		//---------------------------------------------------
		Ciudad c1 = new Ciudad(codigo,nombre);
		while(opcion != 8)
		{
			mostrarMenu();
			System.out.println("elige opcion: ");
			opcion = sc.nextInt();
			sc.nextLine(); // limpiar el salto de línea \n
			switch(opcion)
			{
			case 1:
				c1.mostrarCiudad();
				break;
			case 2:
				System.out.println("dame el identificador del semáforo que quieres apagar ");
				String id_semaforo = sc.nextLine();
				c1.apagarSemaforo(id_semaforo);
				break;
			case 3:
				System.out.println("dame el identificador del semáforo que quieres encender ");
				String id_semaforo1 = sc.nextLine();
				c1.encenderSemaforo(id_semaforo1);
				break;
			case 4:
				System.out.println("ahora voy a cambiar el color del semáforo que me digas: ");
				System.out.println("dime el identificador del semaforo: ");
				String id_semaforo2 = sc.nextLine();
				ColoresSemaforo cs2 = pedirColorSemaforo();
				c1.cambiarColorSemaforo(id_semaforo2, cs2);
				break;
			case 5:
				System.out.println("ahora voy a solicitar los datos del semáforo que voy a añadir: ");
				System.out.println("identificador del semáforo -> ");
				String ids = sc.nextLine();
				System.out.println("latitud -> ");
				double latitud = sc.nextDouble();
				sc.nextLine(); // limpiar salto de línea (cuando leas double o int)
				System.out.println("longitud -> ");
				double longitud = sc.nextDouble();
				sc.nextLine(); // limpiar salto de línea (cuando leas double o int)
				ColoresSemaforo cs = pedirColorSemaforo();
				boolean encendido = pedirEncendidoApagado();
				Semaforo s1 = new Semaforo(ids,latitud,longitud,cs,encendido);
				c1.addSemaforo(s1);
				break;
			case 6:
				System.out.println("ahora voy a borrar un semaforo: ");
				System.out.println("dime el identificador del semaforo que quieres borrar: ");
				String id_semaforo3 = sc.nextLine();
				c1.borrarSemaforo(id_semaforo3);
				break;
			case 7:
				System.out.println("ahora quiero mostrar un semaforo: ");
				System.out.println("dime el identificador del semaforo que quieres mostrar: ");
				String id_semaforo4 = sc.nextLine();
				c1.mostrarDatosDeUnSemaforo(id_semaforo4);
				break;
			case 8:
				break;
			default:
				System.out.println("opción no válida, vuelve a intentarlo");
				break;
			}
		}
		sc.close();
	}

	private static ColoresSemaforo pedirColorSemaforo() {
		System.out.println("el semaforo estará verde, ambar o rojo? ");
		System.out.println("v -> verde, a -> ambar, r-> rojo");
		System.out.println("elige opcion: (v/a/r)");
		String opcion1 = sc.nextLine();
		if(opcion1.equalsIgnoreCase("v")) {
			return ColoresSemaforo.VERDE;
		}
		else if(opcion1.equalsIgnoreCase("a"))
		{
			return ColoresSemaforo.AMBAR;
		}
		else if(opcion1.equalsIgnoreCase("r"))
		{
			return ColoresSemaforo.ROJO;
		}
		else {
			return ColoresSemaforo.ROJO;
		}
	}

	private static boolean pedirEncendidoApagado() {
		System.out.println("el semaforo estará encendido o apagado? ");
		System.out.println("e -> encendido, a -> apagado");
		System.out.println("elige opcion: (e/a)");
		String opcion1 = sc.nextLine();
		if(opcion1.equalsIgnoreCase("e"))
		{
			return true;
		}
		else if(opcion1.equalsIgnoreCase("a"))
		{
			return false;
		}
		return false;
	}

	private static void mostrarMenu() {
		System.out.println("-----------------------------------------");
		System.out.println("1-> mostrar ciudad");
		System.out.println("2-> apagar semaforo");
		System.out.println("3-> encender semaforo");
		System.out.println("4-> cambiar color del semaforo");
		System.out.println("5-> Añadir semáforo");
		System.out.println("6-> Borrar semáforo");
		System.out.println("7-> Mostrar datos de un semáforo");
		System.out.println("8-> salir");
	}

}
