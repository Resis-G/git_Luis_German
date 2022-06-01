package tema4;

import java.text.DecimalFormat;

public class Menu {

	 private final double IMPUESTO_IVA = 0.21;
	//  atributos
	private String nombre; // el atributo nombre se refiere al nombre del cliente
	private String nombrePrimero; // nombre del primer plato
	private double precioPrimero; // precio del primer plato
	private String nombreSegundo; // nombre del segundo plato
	private double precioSegundo; // precio del segundo plato
	private String nombrePostre;  // nombre del postre
	private double precioPostre;  // precio del postre

	// constructores	
	public Menu(String nombre, String nombrePrimero, double precioPrimero, 
			                   String nombreSegundo, double precioSegundo,
			                   String nombrePostre, double precioPostre) {
		this.nombre = nombre;
		this.nombrePrimero = nombrePrimero;
		this.precioPrimero = precioPrimero;
		this.nombreSegundo = nombreSegundo;
		this.precioSegundo = precioSegundo;
		this.nombrePostre = nombrePostre;
		this.precioPostre = precioPostre;
	}
	public Menu() {
		this.nombre = "sin especificar";
		this.nombrePrimero = "sin especificar";
		this.precioPrimero = 0.0;
		this.nombreSegundo = "sin especificar";
		this.precioSegundo = 0.0;
		this.nombrePostre = "sin especificar";
		this.precioPostre = 0.0;
	}
	//----------------------------------------------------------------
	// getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombrePrimero() {
		return nombrePrimero;
	}
	public void setNombrePrimero(String nombrePrimero) {
		this.nombrePrimero = nombrePrimero;
	}
	public double getPrecioPrimero() {
		return precioPrimero;
	}
	public void setPrecioPrimero(double precioPrimero) {
		this.precioPrimero = precioPrimero;
	}
	public String getNombreSegundo() {
		return nombreSegundo;
	}
	public void setNombreSegundo(String nombreSegundo) {
		this.nombreSegundo = nombreSegundo;
	}
	public double getPrecioSegundo() {
		return precioSegundo;
	}
	public void setPrecioSegundo(double precioSegundo) {
		this.precioSegundo = precioSegundo;
	}
	public String getNombrePostre() {
		return nombrePostre;
	}
	public void setNombrePostre(String nombrePostre) {
		this.nombrePostre = nombrePostre;
	}
	public double getPrecioPostre() {
		return precioPostre;
	}
	public void setPrecioPostre(double precioPostre) {
		this.precioPostre = precioPostre;
	}
	public double getIMPUESTO_IVA() {
		return IMPUESTO_IVA;
	}
	//--------------------------------------------------------
	// método calcular Iva
	public double calcularIva()
	{
		double precioIva = (this.precioPrimero + this.precioSegundo + this.precioPostre)* IMPUESTO_IVA;
		return precioIva;
	}
	// metodo calcular el total
	public double calcularTotal() {
		double total = (this.precioPrimero+this.precioSegundo+this.precioPostre) + this.calcularIva();
		return total;
	}
	
	// metodo mostrar factura
	public void mostrarFactura( )
	{
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("NOMBRE: " + this.nombre+ "\n");
		System.out.println("PRIMER PLATO -> " + this.nombrePrimero + "\t\t" + this.precioPrimero + "€");
		System.out.println("SEGUNDO PLATO-> " + this.nombreSegundo + "\t\t" + this.precioSegundo + "€");
		System.out.println("POSTRE-> " + this.nombrePostre + "\t\t\t" + this.precioPostre + "€");
		System.out.println("\nIVA-> " + "\t\t\t\t" + df.format(this.calcularIva())+"€");
		System.out.println("TOTAL: " + "\t\t\t\t" + df.format(this.calcularTotal())+"€");
		System.out.println("-----------------------------------------------------------------------");

	}
	
}
