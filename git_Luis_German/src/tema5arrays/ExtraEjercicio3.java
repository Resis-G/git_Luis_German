package tema5arrays;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExtraEjercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Animal a1 = new Animal("juan", "gato");
		// a1.mostrarAnimal();
		
		final int NUM_ANIMALES = 5;
		Animal[] zoo = new Animal[NUM_ANIMALES];
		//-------------------------------------------
		// RELLENAMOS EL ARRAY CON 5 ANIMALES
		for(int i=0; i< NUM_ANIMALES; i++)
		{
			System.out.println("dame el nombre del animal " + i);
			String nombre = sc.nextLine();
			System.out.println("dame la especie del animal " + i);
			String especie = sc.nextLine();
			System.out.println("-------------------------------------");
			Animal a = new Animal(nombre,especie);
			//-------------------------------------
			zoo[i] = a;
		}
		//---------------------------------------
		// MOSTRAMOS LOS ANIMALES DEL ZOO
		for(int i=0; i<NUM_ANIMALES; i++)
		{
			Animal a = zoo[i];
			a.mostrarAnimal();
		}
		//---------------------------------------
		System.out.println("dame la especie que quieres mostrar: ");
		String especie_buscada = sc.nextLine();
		//--------------------------------------
		for(int i=0; i<NUM_ANIMALES; i++)
		{
			Animal a = zoo[i];
			String especie_casilla = a.getEspecie();
			if(especie_buscada.equalsIgnoreCase(especie_casilla))
			{
				a.mostrarAnimal();
			}
		}
		//--------------------------------------
	}

}
