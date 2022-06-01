package tema5arrays;

public class PruebaGastos {

	public static void main(String[] args) {
		Gastos g1 = new Gastos(2021);
	/*	g1.addDatosAFactura(0,"1b","basuras",20.0);
		g1.addDatosAFactura(1,"1a","agua",15.0);
		g1.addDatosAFactura(2,"1e","electricidad",150.0);
		g1.addDatosAFactura(3,"1ar","arreglos",12.0);
		g1.addDatosAFactura(4,"1i","impuestos",30.0);
	*/
		g1.addDatosAFacturas();
		g1.mostrarGastos();
		
		System.out.println("fin");
	}

}
