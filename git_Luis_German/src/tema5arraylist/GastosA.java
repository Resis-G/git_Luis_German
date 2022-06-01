package tema5arraylist;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class GastosA {
	private int anyo;
	private ArrayList<Factura> facturas = null;
	//----------CONSTRUCTORES----------------
	public GastosA(int anyo, ArrayList<Factura> facturas) {
		this.anyo = anyo;
		this.facturas = facturas;
	}
	public GastosA(int anyo) {
		this.anyo = anyo;
		this.facturas = new ArrayList<Factura>();
	}
	//---------------------------------------
	public int getAnyo() {
		return anyo;
	}
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	public ArrayList<Factura> getFacturas() {
		return facturas;
	}
	public void setFacturas(ArrayList<Factura> facturas) {
		this.facturas = facturas;
	}
	//----------------------------------------
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anyo;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GastosA other = (GastosA) obj;
		if (anyo != other.anyo)
			return false;
		return true;
	}
	//--------------------------------------------------------
	public void addFactura(String idfactura, String concepto, double importe)
	{
		this.facturas.add(new Factura(idfactura,concepto,importe));
	}
	//--------------------------------------------------------
	public void addFacturaTeclado()
	{
		String idFactura = JOptionPane.showInputDialog("dame el id de la factura ->" );
		String concepto = JOptionPane.showInputDialog("dame el concepto ->" );
		String textoprecio = JOptionPane.showInputDialog("dame el importe ->" );
		double precio = Double.valueOf(textoprecio);
		this.facturas.add(new Factura(idFactura,concepto,precio));
	}
	//---------------------------------------------------------
	public void mostrarGastos()
	{
		System.out.println("contabilidad de gastos del año " + this.anyo);
		System.out.println("-------------------------------------------");
		for (Factura factura : facturas) {
			factura.mostrarFactura();
		}
		System.out.println("-------------------------------------------");
		System.out.println("TOTAL GASTOS: " + this.calcularGastoTotal());
	}
	//------------------------------------------------------------
	private double calcularGastoTotal() {
		double suma = 0.0;
		for (Factura factura : facturas) {
			suma = suma + factura.getImporte();
		}
		return suma;
	}
	//-------------------------------------------------------------
	public void borrarFactura(String idfactura) {
		//Factura f = new Factura(idfactura);
		//this.facturas.remove(f);
		
		/*
		for (Factura factura : facturas) {
			if(factura.getIdFactura().equalsIgnoreCase(idfactura))
			{
				facturas.remove(factura);
				break;
			}
		}*/
		//-----------------------------------------------------
		for(int i=0; i<this.facturas.size(); i++)
		{
			Factura factura = this.facturas.get(i);
			if(factura.getIdFactura().equalsIgnoreCase(idfactura))
			{
				facturas.remove(factura);
				break;
			}
		}
		
	}
	public void borrarTodasLasFacturas() {
		this.facturas.clear();
	}
}
