package tema3repeticiones;

import java.util.Scanner;

public class Tarea344 {
	
	//------------------------------------------------------------------------
		private static void comprobarGanador(String jugada1, String jugada2) {
			if(jugada1.equalsIgnoreCase(jugada2))
			{
				System.out.println("habéis elegido lo mismo, seguir jugando");
			}
			else if(jugada1.equalsIgnoreCase("piedra") && 
					jugada2.equalsIgnoreCase("papel"))
			{
				System.out.println("el papel gana a la piedra ");
				System.out.println("el jugador2 ha ganado");
			}
			else if(jugada1.equalsIgnoreCase("piedra") && 
					jugada2.equalsIgnoreCase("tijeras"))
			{
				System.out.println("la piedra gana a la tijera ");
				System.out.println("el jugador1 ha ganado");
			}
			else if(jugada1.equalsIgnoreCase("papel") && 
					jugada2.equalsIgnoreCase("tijeras"))
			{
				System.out.println("la tijera gana al papel ");
				System.out.println("el jugador2 ha ganado");
			}
			else if(jugada1.equalsIgnoreCase("papel") && 
					jugada2.equalsIgnoreCase("piedra"))
			{
				System.out.println("el papel gana a la piedra ");
				System.out.println("el jugador1 ha ganado");
			}
			else if(jugada1.equalsIgnoreCase("tijeras") && 
					jugada2.equalsIgnoreCase("piedra"))
			{
				System.out.println("la piedra gana a la tijera ");
				System.out.println("el jugador2 ha ganado");
			}
			else if(jugada1.equalsIgnoreCase("tijeras") && 
					jugada2.equalsIgnoreCase("papel"))
			{
				System.out.println("la tijera gana al papel ");
				System.out.println("el jugador1 ha ganado");
			}
			
		}

		//------------------------------------------------------------------
		private static void mostrarMenu() {
			System.out.println("opciones disponibles: ");
			System.out.println("1-> piedra ");
			System.out.println("2-> papel ");
			System.out.println("3-> tijera ");
			System.out.println("elige opcion: ");
		}
	//--------------------------------------------------------------------
		
		private static boolean esincorrecta(String jugada1) {
			if(jugada1.equalsIgnoreCase("piedra") == false &&
			   jugada1.equalsIgnoreCase("papel") == false &&
			   jugada1.equalsIgnoreCase("tijeras") == false
			   )
			{
				return true;
			}
			return false;
		}

	/*
	 * “PIEDRA, PAPEL O TIJERA”:  
El objetivo del juego es vencer al oponente seleccionando el arma que gana, según las 
siguientes reglas: 
• La piedra aplasta la tijera. ...  
• La tijera corta el papel. ...  
• El papel envuelve la piedra. ...  
En caso de empate (que dos jugadores elijan el mismo elemento), se juega otra vez. 

Realiza un programa que simule el juego “piedra papel o tijera” para dos jugadores: 
✓ Lee por teclado el arma elegida por el jugador1 (por ejemplo, piedra) 
✓ Lee por teclado el arma elegida por el jugador2 (por ejemplo, tijera)  
✓ Muestra quién fue el ganador (en el ejemplo mostraría por pantalla “el 
ganador fue el jugador1, la piedra aplasta la tijera”) 
✓ Si los dos jugadores eligen la misma arma, muestra el mensaje “empate, 
volvemos a intentarlo” y repite el proceso (vuelve a pedir nuevas armas para 
el jugador1 y el jugador2)
	 */
	//------------------------------------------------------------------
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String jugada1 ="";
		String jugada2 ="";	
		do {
			do {
				mostrarMenu();
				System.out.println("dame la jugada del jugador 1");
				jugada1 = sc.nextLine();	
			}while(esincorrecta(jugada1));		
			do {
				mostrarMenu();
				System.out.println("dame la jugada del jugador 2");
				jugada2 = sc.nextLine();
			}while(esincorrecta(jugada2));
			
			comprobarGanador(jugada1,jugada2);		
		}while(jugada1.equalsIgnoreCase(jugada2));
		System.out.println("FIN DEL JUEGO");
		sc.close();
	}


}
