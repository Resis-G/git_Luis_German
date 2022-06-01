package tema3condicionales;

public class Ejemplo1 {

	public static void main(String[] args) {
		// si el dinero que quiere cambiar es menor que 30 euros le dejamos hacer el cambio
		// si el dinero es mayor o igual a 30 no hacemos el cambio de dinero
		double dinero = 20.2;
		if(dinero >= 30)
		{
			System.out.println("demasiado dinero, solamente admitimos cambio de importe menor de 30 euros");
		}
		else {
			System.out.println("cambiando el dinero en monedas");

		}
		// ----------------------------------------------
		
		int edad = 17;
		if(edad >= 18)
		{
			System.out.println("puede sacar tabaco");
		}
		else {
			System.out.println("no puede sacar tabaco");
		}
		
		//------------------------------------------------
		System.out.println("fin");
	}

}
