package tema5arrays;

import javax.swing.JOptionPane;

public class Gastos {
	private int anyo;
	private Factura[] facturas;
	private final int CANT_FACTURAS = 5; // constante
	//----------------------------------------------------------
	public Gastos(int anyo, Factura[] facturas) {
		this.anyo = anyo;
		this.facturas = facturas;
	}
	public Gastos(int anyo) {
		this.anyo = anyo;
		this.facturas = new Factura[CANT_FACTURAS];
		// doy a cada casilla memoria para que no tenga un valor null
		for(int i=0; i<CANT_FACTURAS;i++)
		{
			this.facturas[i] = new Factura();
		}
	}
	//-------------------------------------------------
	public int getAnyo() {
		return anyo;
	}
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	public Factura[] getFacturas() {
		return facturas;
	}
	public void setFacturas(Factura[] facturas) {
		this.facturas = facturas;
	}
	public int getCANT_FACTURAS() {
		return CANT_FACTURAS;
	}
	//-----------------------------------------
	public void addDatosAFactura(int casilla, String id, String concepto, double precio) 
	{
		this.facturas[casilla].setIdFactura(id);
		this.facturas[casilla].setConcepto(concepto);
		this.facturas[casilla].setImporte(precio);
	}
	public void addDatosAFacturas() {
		for(int i=0; i<this.CANT_FACTURAS; i++)
		{
			String idFactura = JOptionPane.showInputDialog("dame el id de la factura ->" + i);
			String concepto = JOptionPane.showInputDialog("dame el concepto ->" );
			String textoprecio = JOptionPane.showInputDialog("dame el importe ->" );
			double precio = Double.valueOf(textoprecio);
			this.facturas[i].setIdFactura(idFactura);
			this.facturas[i].setConcepto(concepto);
			this.facturas[i].setImporte(precio);
			// this.facturas[i] = new Factura(idFactura,concepto,precio);
		}
	}
	//--------------------------------------------------
	public void mostrarGastos()
	{
		System.out.println("contabilidad de gastos del año " + this.anyo);
		System.out.println("-------------------------------------------");
		for(int i=0; i<CANT_FACTURAS; i++)
		{
			this.facturas[i].mostrarFactura();
		}
		System.out.println("-------------------------------------------");
		System.out.println("TOTAL GASTOS: " + this.calcularGastoTotal());
	}
	//------------------------------------------------------------
	private double calcularGastoTotal() {
		double suma = 0.0;
		for(int i=0; i< CANT_FACTURAS; i++)
		{
			suma = suma + this.facturas[i].getImporte();
		}
		return suma;
	}
}
