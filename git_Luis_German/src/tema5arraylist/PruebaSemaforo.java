package tema5arraylist;

public class PruebaSemaforo {

	public static void main(String[] args) {
		
		Semaforo s1 = new Semaforo(); // objeto
		s1.setId_semaforo("s1");
		s1.setLatitud(23.2);
		s1.setLongitud(-34.2);
		s1.setColor(ColoresSemaforo.VERDE);
		s1.setEncendido(true);
		// s1.mostrarSemaforo();
		System.out.println(s1.toString());
		if(s1.getColor() == ColoresSemaforo.VERDE)
		{
			System.out.println("puede pasar");
		}
		else if(s1.getColor() == ColoresSemaforo.AMBAR)
		{
			System.out.println("deberias ir parando");
		}
		else {
			System.out.println("para");
		}
	}

}
