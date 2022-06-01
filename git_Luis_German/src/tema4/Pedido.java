package tema4;

public class Pedido {
	
	private final double IVA = 0.21;
	// atributos
	private String hamburguesa;
	private double precioHamburguesa;
	private String complemento;
	private double precioComplemento;
	// constructores
	public Pedido(String hamburguesa, double precioHamburguesa, String complemento, double precioComplemento) {
		this.hamburguesa = hamburguesa;
		this.precioHamburguesa = precioHamburguesa;
		this.complemento = complemento;
		this.precioComplemento = precioComplemento;
	}
	// getters y setters
	public String getHamburguesa() {
		return hamburguesa;
	}
	public void setHamburguesa(String hamburguesa) {
		this.hamburguesa = hamburguesa;
	}
	public double getPrecioHamburguesa() {
		return precioHamburguesa;
	}
	public void setPrecioHamburguesa(double nuevoprecioHamburguesa) {
		this.precioHamburguesa = nuevoprecioHamburguesa;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String nuevocomplemento) {
		this.complemento = nuevocomplemento;
	}
	public double getPrecioComplemento() {
		return precioComplemento;
	}
	public void setPrecioComplemento(double precioComplemento) {
		this.precioComplemento = precioComplemento;
	}
	//---------------------------------------------------------------------------------
	public void mostrarPedido()
	{
		System.out.println("----------------------------------------");
		System.out.println("HAMBURGUESA: " + this.hamburguesa + "\t\t" + this.precioHamburguesa + "€");
		System.out.println("COMPLEMENTO: " + this.complemento + "\t\t" + this.precioComplemento + "€");
		System.out.println("----------------------------------------");
	}
	//---------------------------------------------------------------------------------
	public double calcularIva( )
	{
		double iva = (this.precioHamburguesa+this.precioComplemento)* this.IVA;
		return iva;
	}
	//---------------------------------------------------------------------------------
}
