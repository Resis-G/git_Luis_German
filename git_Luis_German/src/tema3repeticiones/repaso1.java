package tema3repeticiones;
import java.util.Scanner;

// CUANDO SE LAS VUELTAS QUE HAY QUE DAR: for
// CUANDO NO SE LAS VUELTAS QUE HAY QUE DAR:
// -> SI HAY QUE DAR COMO MINIMO UNA VUELTA do-while
// -> SI PUEDES DAR CERO VUELTAS while


public class repaso1 {

	public static void main(String[] args) {
		// logueo utilizando las tres repeticiones
		String emailSecreto ="correo@gmail.com" ;
		String clave = "1234";
		//--------------------------------------------
		String miEmail ="";
		String miclave ="";
		//--------------------------------------------
		boolean acabar = false;
		int intentos = 1;
		
		Scanner sc = new Scanner(System.in);
		do {
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
		}while(acabar == false && intentos <=3);
		System.out.println("FIN");
		sc.close();
	}

}
