package tema3repeticiones;

import java.util.Scanner;

public class repaso2 {

	public static void main(String[] args) {
		// logueo utilizando las tres repeticiones
		String emailSecreto ="correo@gmail.com" ;
		String clave = "1234";
		//--------------------------------------------
		String miEmail ="";
		String miclave ="";
		//--------------------------------------------
		int intentos = 1;
		boolean acabar = false;	
		Scanner sc = new Scanner(System.in);
		while(acabar == false && intentos <= 3)
		{
			System.out.println("dame el email: ");
			miEmail = sc.nextLine();
			System.out.println("dame la clave: ");
			miclave = sc.nextLine();
			//------------------------------------------
			if(miEmail.equalsIgnoreCase(emailSecreto) 
					&&	miclave.equals(clave))
			{
				System.out.println("BIENVENIDO");
				// break;
				acabar = true;
			}
			intentos++;
		}
		System.out.println("FIN");
		sc.close();

	}

}
