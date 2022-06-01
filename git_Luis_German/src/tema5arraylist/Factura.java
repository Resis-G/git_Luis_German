package tema5arraylist;

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
	
	public Factura(String idFactura) {
		this.idFactura = idFactura;
		this.concepto = "";
		this.importe = 0;
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
	//-------------------------------------

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idFactura == null) ? 0 : idFactura.hashCode());
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
		Factura other = (Factura) obj;
		if (idFactura == null) {
			if (other.idFactura != null)
				return false;
		} else if (!idFactura.equals(other.idFactura))
			return false;
		return true;
	}


	//---------------------------------------------------------
}
