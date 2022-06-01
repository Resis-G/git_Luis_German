package tema4;

public class Extra44 {

	public static void main(String[] args) {
		
		Entrenamiento e1 = new Entrenamiento();
		//---------------------------------------------
		e1.setMetros(2000); // sirven para cambiar valores de los atributos
		e1.setDias(10);
		//----------------------------------------------
		e1.mostrarEntrenamiento();
		//-----------------------------------------------
		// Entrenamiento e2 = new Entrenamiento(3, 3000);
		e1.incrementarMetros(1001);
		e1.disminuirMetros(10);
		e1.mostrarEntrenamiento();
		//-----------------------------------------------
		}

}
