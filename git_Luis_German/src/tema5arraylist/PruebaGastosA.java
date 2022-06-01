package tema5arraylist;

public class PruebaGastosA {

	public static void main(String[] args) {

		GastosA misgastos = new GastosA(2020);
		misgastos.addFactura("1", "agua", 20);
		misgastos.addFacturaTeclado();
		misgastos.addFactura("3","basura", 50);
		misgastos.borrarFactura("1");
        misgastos.mostrarGastos();
        misgastos.borrarTodasLasFacturas();
	}

}
