package tema5arrays;

public class Factura {

	private String idFactura;
	private String concepto;
	private double importe;
	//-------------------------------
	public Factura(String idFactura, String concepto, double importe) {
		this.idFactura = idFactura;
		this.concepto = concepto;
		this.importe = importe;
	}
	
	public Factura() {
		this.idFactura = "0";
		this.concepto = "sin especificar";
		this.importe = 0.0;
	}
	//------------------------------
	public String getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(String idFactura) {
		this.idFactura = idFactura;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	//-----------------------------------
	public void mostrarFactura()
	{
		System.out.println("-----------------------");
		System.out.println("identificador:\t" + this.idFactura);
		System.out.println("concepto:\t"+this.concepto);
		System.out.println("importe:\t"+this.importe+"€");
	}
}
