package tema4;

/*
 * 
 * 1.	
 * Vamos a dar un enfoque orientado a objetos al ejercicio 4 de la tarea la tarea 2.1. 
 * Define dentro de un paquete llamado ejercicio1, 
 * la siguiente clase llamada Operaciones:

Operaciones

//atributos
int x=0;
Int y=0;

//métodos getters y setters
int cogerValorX()    //este método devuelve el valor de la variable x
void asignarValorX(int x1 )  // este método asigna al atributo x, el valor x1 introducido

int cogerValorY()    //este método devuelve el valor de la variable y
void asignarValorY(int y1 )  // este método asigna al atributo y, el valor y1 introducido

//otros métodos
int sumar()    //devuelve la suma de los dos números
int restar()  // devuelve la resta de los dos números
double multiplicar()    // devuelve la multiplicación de los dos números
int dividir()  // devuelve la división de los dos números
int resto() //devuelve el resto de la división de los dos números

Ahora, en el mismo paquete, crea una clase llamada PruebaOperaciones que contenga un programa principal (método main):
•	Añade un objeto del tipo Operaciones
•	Lee por teclado los dos números enteros (x e y) y asígnalos a las variables miembro del objeto creado.
•	Ejecuta los métodos sumar(), restar(), multiplicar(), dividir(), resto() y muestra el resultado de cada método por pantalla.

 */

import java.util.Scanner;

public class Tarea411 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("dame el primer numero: ");
		double numero1 = sc.nextDouble();
		sc.nextLine(); // limpiar el salto de línea del scanner
		System.out.println("dame el segundo numero: ");
		double numero2 = sc.nextDouble();
		sc.nextLine(); // limpiar el salto de línea del scanner

		// Calculadora c1 = new Calculadora(numero1, numero2);
		Calculadora c1 = new Calculadora();
		c1.setNumero1(numero1);
		c1.setNumero2(numero2);
		System.out.println("el primer numero es " + c1.getNumero1());
		System.out.println("el segundo numero es " + c1.getNumero2());
		//-------------------------------------------------------------
		double suma = c1.sumar();
		System.out.println("la suma vale " + suma);
		//---------------------------------------------------------------
		double resta = c1.restar();
		System.out.println("la resta vale " + resta);
		//---------------------------------------------------------------
		double multiplicacion = c1.multiplicar();
		System.out.println("la multiplicacion vale " + multiplicacion);
		//---------------------------------------------------------------
         double division = c1.dividir();
         System.out.println("la division vale " + division);
        //--------------------------------------------------------------
         double resto = c1.calcularResto();
         System.out.println("el resto vale "+ resto);
		sc.close();
	}

}
