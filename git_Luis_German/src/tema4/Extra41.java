package tema4;

/*
 * Clase LoginUsuario:
 * Atributos:
 clave
 email
Los métodos de la clase son:
•	public boolean loguearse()
Pide el email y la clave del usuario por teclado (utiliza JOptionPane). Si coinciden con los valores de los atributos de la clase, devuelve true. Si no coinciden, vuelve a pedir los datos (el máximo número de intentos es tres). Si en tres intentos no logras poner los valores correctos devuelve false.

•	public void mostrarDatosUsuario()
Muestra por pantalla los siguientes datos:
	El email del usuario
	La clave del usuario

Haz un programa de prueba utilizando la clase LoginUsuario.

 * 
 * 
 */
import java.util.Scanner;

public class Extra41 {

	public static void main(String[] args) {
		
		// CUENTAS SECRETAS
		LoginUsuario usuario1 = new LoginUsuario("alumno", "alumno");
		LoginUsuario adminsalinas = new LoginUsuario("adminsalinas", "adminsalinas");
		//------------------------------------------------------------------------------------
		
		Scanner sc = new Scanner(System.in);
		System.out.println("dame el usuario: ");
		String email = sc.nextLine();
		//-----------------------------------------------------
		System.out.println("ahora dame la clave: ");
		String clave = sc.nextLine();
		//------------------------------------------------------
		boolean datosOK = usuario1.comprobarLogin(email, clave);
		if(datosOK == true)
		{
			System.out.println("bienvenido alumno");
			usuario1.mostrarDatos();
		}
		else {
		   boolean datosOK2 = adminsalinas.comprobarLogin(email, clave);
		   if(datosOK2==true)
		   {
			   System.out.println("bienvenido adminsalinas");
			   adminsalinas.mostrarDatos();
		   }
		   else {
			   System.out.println("los datos de tu cuenta no coinciden con ninguno de los dos usuarios");
			   System.out.println("no puedes entrar");
		   }
		}
		
		
		
		

	}

}
