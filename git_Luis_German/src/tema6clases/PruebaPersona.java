package tema6clases;

import java.util.ArrayList;

public class PruebaPersona {

	public static void main(String[] args) {
		
		Alumno a1 = new Alumno("dni1","nombre1", "apellidos1", "email1@gmail.com","1dam");
		System.out.println(a1.toString());
		ArrayList<String> modulos = new ArrayList<String>();
		modulos.add("programacion");
		modulos.add("lenguaje de marcas");
		Profesor p1 = new Profesor("dni2", "pepe", "jimenez", "pepeluis@gmail.com", modulos);
		System.out.println(p1.toString());
		Conserje c1 = new Conserje("dni3","juan","martinez","email2@gmail.com","L-V 4:00,10:00");
		System.out.println(c1.toString());
	}

}
