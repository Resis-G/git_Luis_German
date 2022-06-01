package tema4;
/*
 * 2.	Vamos a dar un enfoque orientado a objetos al ejercicio 5 de la tarea la tarea 2.1. Define dentro de un paquete llamado ejercicio2, la siguiente clase llamada Notas:

Notas
//atributos
String nombre =””;
float examen1=0.0f;
float examen2=0.0f;
float examen3=0.0f;

//métodos getters y setters
String cogerNombre( )    
void asignarNombre(String nombre)  
float cogerExamen1( )    
void asignarExamen1(float nota1)  
float cogerExamen2( )    
void asignarExamen2(float nota2)  
float cogerExamen3( )    
void asignarExamen3(float nota3)  

//otros métodos
float media()    //devuelve la media de los tres examenes
void mostrarNotas() //devuelve la nota media de los exámenes, por ejemplo:
 


Ahora, en el mismo paquete, crea una clase llamada PruebaNotas que contenga un programa principal (método main):
•	Añade un objeto del tipo Notas
•	Lee por teclado el nombre del alumno y sus tres notas y asígnalos a las variables miembro del objeto creado.
•	Ejecuta el método mostrarNotas() y muestra los datos del alumno.

 * 
 * 
 */

import java.text.DecimalFormat;

public class Tarea412 {

	public static void main(String[] args) {
		// crear un objeto de tipo nota
		Nota n1 = new Nota("pepe", 5.3, 6.2, 7.3);
		// crear otro objeto utilizando el constructor vacio (constructor por defecto)
		Nota n2 = new Nota();
		n2.setNombre("juan");
		n2.setNota1(6.2);
		n2.setNota2(5.3);
		n2.setNota3(7.7);
		double lamedia = n1.calcularMedia();
		System.out.println("la media vale: " + lamedia);
		//------------------------------------------------------
	//	DecimalFormat df = new DecimalFormat("#.00");
		//----------------------------------------------------
	//	double media1 = n1.calcularMedia();
	//	String nombre1 = n1.getNombre();
	//	System.out.println("la nota media del alumno " + nombre1 + " es de "  + df.format(media1));
		//---------------------------------------------------
	//	double media2 = n2.calcularMedia();
		//String nombre2 = n2.getNombre();
		//System.out.println("la nota media del alumno " + nombre2 + " es de "  + df.format(media2));
		//----------------------------------------------------
		n1.mostrarNota();
		n2.mostrarNota();
		
	}

}
