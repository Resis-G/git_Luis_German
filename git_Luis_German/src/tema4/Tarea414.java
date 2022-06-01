package tema4;

/*
 * 
Cuenta
//atributos
String titular =��;
double saldoCuenta=0.0;
double saldoTarjeta = 0.0;

//m�todos getters y setters
<define los m�todos para coger/asignar los datos de cada atributo>

//otros m�todos
void ingresarSaldoCuenta( double cantidad)    //suma al saldo de la cuenta, la cantidad dada
void sacarSaldoCuenta( double cantidad)    //resta del saldo de la cuenta, la cantidad dada
void transferirSaldoATarjeta(double cantidad) // transfiere dinero desde la cuenta a la tarjeta
void sacarSaldoTarjeta( double cantidad)    //resta del saldo de la tarjeta, la cantidad dada


void mostrardatosCuenta() //Muestra todos los datos de la cuenta



Ahora, en el mismo paquete, crea una clase llamada PruebaCuenta que contenga un programa principal (m�todo main):
�	A�ade un objeto del tipo Cuenta 
�	Lee por teclado los datos de la cuenta y 
as�gnalos a las variables miembro del objeto creado.
�	Ingresa alg�n saldo en la cuenta, saca saldo de la cuenta y 
realiza transferencias a la tarjeta. Finalmente, muestra los datos de la cuenta.
 
 * 
 */
import java.util.Scanner;

public class Tarea414 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//---------------------------------------------------------------------
		System.out.println("dame el titular de la cuenta que voy a crear: ");
		String titular = sc.nextLine();
		//---------------------------------------------------------------------
		System.out.println("�qu� saldo inicial tiene la cuenta? ");
		double saldoCuenta = sc.nextDouble();
		// limpio el salto de l�nea
		sc.nextLine();
		//----------------------------------------------------------------------
		System.out.println("�qu� saldo inicial tiene la tarjeta? ");
		double saldoTarjeta = sc.nextDouble();
		sc.nextLine();
		//----------------------------------------------------------------------
		
		
		//------------------------------------------------
		Cuenta c2 = new Cuenta(titular, saldoCuenta, saldoTarjeta);
		//------------------------------------------------
		c2.sacarSaldoCuenta(2500.0);
		c2.ingresarSaldoTarjeta(300.0);
		c2.cargarTarjeta(200);
		//-------------------------------------------------
		c2.mostrarDatosBancarios();
		//-------------------------------------------------
		sc.close();
	}

}
