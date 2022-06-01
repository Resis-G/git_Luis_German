package tema3repeticiones;

public class Ejercicio36 {
/*
	Tenemos que pagar 90.000 euros por un piso que hemos comprado. Suponiendo que 
	pagamos 300 euros mensuales. Muestra cada mes el dinero que nos queda por pagar. 
	¿Cuántos meses necesitaremos para pagar todo el piso? 
*/			
	public static void main(String[] args) {
		// cuando no sepamos el número de vueltas que hay que dar podríamos emplear mejor un while
		
		double deuda = 90001.0;
		double pagadoMes = 300.0;
		int mes = 0;
		while( deuda > 0)
		{
			System.out.println("la deuda actual es " + deuda + " en el mes " + mes);
			if(pagadoMes > deuda)
			{
				pagadoMes = deuda;
			}
			deuda = deuda - pagadoMes;
			mes = mes + 1;

		}
		System.out.println("deuda saldada en el mes " + mes);
		System.out.println(deuda);

	}

}
