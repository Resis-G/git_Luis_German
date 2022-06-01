package tema4;
/*
 * Clase Deuda:
 Atributos:
 DeudaActual
Los métodos de la clase son:
•	public  boolean pagar( double dinero)
descuenta de la deuda el dinero recibido en el argumento de entrada. 
Si la deuda fuera menor que el dinero recibido, la deuda quedará a cero. 
Muestra un mensaje avisando de que la deuda quedó a cero. 
Controla que el dinero recibido sea un número mayor que cero.

•	public  boolean pedir( double dinero)
Suma a la deuda el dinero que se pide. 
Controla que el dinero recibido sea un número mayor que cero.
•	public void cobrarIntereses(double interés)
Incrementa la deuda según el interés recibido (por ejemplo, 4%) en el método.

•	Public void mostrarDeudaActual()
Muestra la deuda actual pendiente de pago.

Haz un programa de prueba que utilice la clase Deuda y 
 pidiendo pagos y préstamos 10 veces.

 * 
 * 
 */
import java.util.Scanner;

public class Extra42 {

	public static void main(String[] args) {
		/*
		Deuda d1 = new Deuda(1000);
		boolean pagoCorrecto = d1.pagar(500);
		if(pagoCorrecto == true)
		{
			System.out.println("se ha recibido correctamente el pago");
		}
		else
		{
			System.out.println("no se realizó correctamente el pago");
		}
		boolean peticion1 = d1.pedir(1000);
		if(peticion1 == true)
		{
			System.out.println("se ha dejado el dinero correctamente");
		}
		else {
			System.out.println("no se pudo dejar el dinero");
		}
		//---------------------------------------
		d1.cobrarIntereses(5.0);
		*/
		
		//---------------------------------------------------------------------------
		Scanner sc = new Scanner(System.in);
		Deuda d1 = new Deuda();
		boolean salir = false;
		do
		{
			mostrarMenu();
			int opcion = sc.nextInt();
			// limpio el salto de línea
			sc.nextLine();
			switch(opcion)
			{
				case 1: 
						System.out.println("dame la cantidad de dinero que quieres sacar ");
						double cantidad = sc.nextDouble();
						sc.nextLine();
						boolean pedidoOK = d1.pedir(cantidad);
						if(pedidoOK)
						{
							System.out.println("se ha sacado el dinero correctamente ");
							d1.mostrarDeuda();
						}
						else {
							System.out.println("no se pudo sacar el dinero");
							d1.mostrarDeuda();
						}
						break;
				case 2:
						System.out.println("dame la cantidad de dinero que quieres devolver ");
						double cantidad2 = sc.nextDouble();
						sc.nextLine();
						boolean devueltoOK = d1.pagar(cantidad2);
						if(devueltoOK)
						{
							System.out.println("se ha devuelto el dinero correctamente ");
							d1.mostrarDeuda();
						}
						else {
							System.out.println("no se pudo devolver el dinero");
							d1.mostrarDeuda();
						}
						break;
				case 3:
						d1.mostrarDeuda();
						break;
				case 4:
						salir = true;
						break;
				default:
						System.out.println("opcion incorrecta");
						break;
			}
		}while(salir==false);
		
		d1.mostrarDeuda();		
	}

	private static void mostrarMenu() {
		System.out.println("1-> sacar dinero");
		System.out.println("2-> devolver dinero");
		System.out.println("3-> mostrar deuda");
		System.out.println("4-> salir");
		System.out.println("---------------------------------------");
		System.out.println("elige opcion: ");
	}

}
