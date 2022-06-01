package tema5arraylist;

import java.util.LinkedList;

public class PruebaLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Alumno> alumnosPreinscritos = new LinkedList<Alumno>();
		alumnosPreinscritos.addLast(new Alumno("123A", "jose"));
		alumnosPreinscritos.addLast(new Alumno("123A", "ana"));
		alumnosPreinscritos.addLast(new Alumno("123A", "carlos"));
		alumnosPreinscritos.addLast(new Alumno("123A", "sonia"));
		
		Alumno a1 = alumnosPreinscritos.getFirst();
		alumnosPreinscritos.removeFirst();
		LinkedList<Alumno> alumnosmatriculados = new LinkedList<Alumno>();
		alumnosmatriculados.addLast(a1);
		
		String texto = "    Esto es un TEXTO    ";
		texto = texto.toLowerCase();
		//texto = texto.toUpperCase();
	    texto = texto.trim();
		if(texto.equalsIgnoreCase("esto es un texto"))
		{
			System.out.println("son iguales");
		}
		else {
			System.out.println("son distintos");
		}
		String parteTexto = texto.substring(0, 5);
		System.out.println(parteTexto);
		System.out.println(texto.charAt(5));
		System.out.println("numero de letras: " + texto.length());

	}

}
