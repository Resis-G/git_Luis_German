package tema5arrays;

public class PruebaFactura {

	public static void main(String[] args) {
		Factura f1 = new Factura("1_2021", "agua", 120.3);
		f1.mostrarFactura();
		System.out.println("-----------------------------");
		Factura f2 = new Factura();
		f2.mostrarFactura();
	}

}
