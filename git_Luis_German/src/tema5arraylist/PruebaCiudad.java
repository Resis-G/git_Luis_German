package tema5arraylist;

import java.util.ArrayList;

public class PruebaCiudad {

	public static void main(String[] args) {
		
		ArrayList<Semaforo> semaforos = new ArrayList<Semaforo>();
		semaforos.add(new Semaforo("s1", 23.2, -18.2, ColoresSemaforo.ROJO, true));
		semaforos.add(new Semaforo("s2", 23.2, -19.2, ColoresSemaforo.ROJO, false));
		semaforos.add(new Semaforo("s3", 23.2, -17.2, ColoresSemaforo.ROJO, false));
		semaforos.add(new Semaforo("s4", 23.2, -128.2, ColoresSemaforo.ROJO, false));
		Ciudad c1 = new Ciudad("c1", "Seseña", semaforos);
		//c1.mostrarCiudad();
		//-------------------------------------------------------------
		

		Ciudad c2 = new Ciudad("c2", "illescas");
		c2.getSemaforos().add(new Semaforo("s4", 23.2, -128.2, ColoresSemaforo.ROJO, false));
		c2.getSemaforos().add(new Semaforo("s5", 233.2, -28.2, ColoresSemaforo.VERDE, true));

		c2.apagarSemaforo("s5");
		c2.cambiarColorSemaforo("s4", ColoresSemaforo.AMBAR);
		c2.addSemaforo(new Semaforo("s6",23,34,ColoresSemaforo.ROJO, false));
		c2.borrarSemaforo("s4");
		//c2.mostrarCiudad();
		boolean mostradoOK = c2.mostrarDatosDeUnSemaforo("s8");
		if(mostradoOK == true)
		{
			System.out.println("encontrado el semaforo");
		}
		else {
			System.out.println("semaforo no encontrado");
		}
		
	}

}
