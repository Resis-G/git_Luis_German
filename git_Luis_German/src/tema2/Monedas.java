package tema2;

public class Monedas {

	public static void main(String[] args) {
		// Haz un programa que te devuelva el importe introducido por teclado
		// en monedas de 2 euros, 1 euro, 50 cms, 20cms, 10cms, 5cms, 2cm, 1cms
		// por ejemplo:
		// 13.55 -> 6 de 2€, 1 de 1€, 1 de 50cms, 1 de 5cm 
		// 1355 / 200 me daría las monedas de 2 euros
		// 1355 % 200 me daria el dinero que me queda por devolver
		double dinero = 7.38; // euros
		int centimos = (int)(dinero * 100.0); // centimos
		// monedas de 2 euros
		int euros2 = centimos / 200;  
		int resto = centimos % 200;   
		// monedas de 1 euro
		int euros1 = resto / 100;    
		int restocentimos = resto % 100; 
		// monedas de 50 centimos
		int centimos50 = restocentimos / 50;
		int restocentimos2 = restocentimos % 50;
		// monedas de 20 centimos
		int centimos20 = restocentimos2 / 20;
		int restocentimos3 = restocentimos2 % 20;
		// monedas de 10 centimos
		int centimos10 = restocentimos3 / 10;
		int restocentimos4 = restocentimos3 % 10;
		// monedas de 5 centimos
		int centimos5 = restocentimos4 / 5;
		int restocentimos5 = restocentimos4 % 5;
		// monedas de 2 centimos
		int centimos2 = restocentimos5 / 2;
		int centimos1 = restocentimos5 % 2;
		System.out.println("2 euros ->" + euros2);
		System.out.println("1 euro ->" + euros1);
		System.out.println("50 centimos -> " + centimos50);
		System.out.println("20 centimos -> " + centimos20);
		System.out.println("10 centimos -> " + centimos10);
		System.out.println("5 centimos -> " + centimos5);
		System.out.println("2 centimos -> " + centimos2);
		System.out.println("1 centimo -> " + centimos1);
	}

}
