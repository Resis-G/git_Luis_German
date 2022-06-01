package tema3condicionales;

import java.util.Scanner;

// import javax.swing.JOptionPane;

public class Ejercicio31 {
/*
 *  haz un programna que pida un número y diga si es par o impar.
 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("dame el numero entero para saber si es par o impar: ");
		int numero = sc.nextInt();
		
		// String texto = JOptionPane.showInputDialog("dame el numero entero para saber si es par o impar:");
		// int numero2 = Integer.valueOf(texto);
		int resto = numero % 2;
        if( resto == 0)
        {
        	System.out.println("el numero es par ");
        }
        else {
        	System.out.println(" es impar");
        }
        
        sc.close();
	}

}
