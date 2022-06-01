package tema4;

public class Cuenta {
// atributos
	private String nombre;
	private double saldoCuenta;
	private double saldoTarjeta;
// constructores
	public Cuenta(String nombre, double saldoCuenta, double saldoTarjeta) {
		this.nombre = nombre;
		this.saldoCuenta = saldoCuenta;
		this.saldoTarjeta = saldoTarjeta;
	}
	public Cuenta(String nombre) {
		this.nombre = nombre;
		this.saldoCuenta = 0.0;
		this.saldoTarjeta = 0.0;
	}
// metodos getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSaldoCuenta() {
		return saldoCuenta;
	}
	public void setSaldoCuenta(double saldoCuenta) {
		this.saldoCuenta = saldoCuenta;
	}
	public double getSaldoTarjeta() {
		return saldoTarjeta;
	}
	public void setSaldoTarjeta(double saldoTarjeta) {
		this.saldoTarjeta = saldoTarjeta;
	}
	//------------------------------------------------------------
	public void ingresarSaldoCuenta(double cantidad)
	{
		this.saldoCuenta = this.saldoCuenta + cantidad;
	}
	//-------------------------------------------------------------
	public void sacarSaldoCuenta(double cantidad)
	{
		if(this.saldoCuenta >= cantidad)
		{
			this.saldoCuenta = this.saldoCuenta - cantidad;
		}
		else {
			System.out.println("operacion cancelada, no tienes suficiente saldo");
		}
	}
	//-----------------------------------------------------
	public void ingresarSaldoTarjeta(double cantidad)
	{
		this.saldoTarjeta = this.saldoTarjeta + cantidad;
	}
	//-----------------------------------------------------
	public void sacarSaldoTarjeta(int cantidad)
	{
		if(this.saldoTarjeta >= cantidad)
		{
			this.saldoTarjeta = this.saldoTarjeta - cantidad;
		}
		else
		{
			System.out.println("operacion cancelada, no tienes suficiente saldo en la tarjeta");
		}
	}
	//------------------------------------------------------------------------
	public void cargarTarjeta(double cantidad)
	{
		if(this.saldoCuenta >= cantidad)
		{
			this.saldoCuenta = this.saldoCuenta - cantidad;
			this.saldoTarjeta = this.saldoTarjeta + cantidad;
		}
		else {
			System.out.println("operacion cancelada, no tienes suficiente saldo en la cuenta");
		}
	}
	//------------------------------------------------------------------------
	public void mostrarDatosBancarios ( )
	{
		System.out.println("--------------------------------------------------------");
		System.out.println("titular: " + this.nombre);
		System.out.println("tu saldo en la cuenta es de " + this.saldoCuenta+ "€");
		System.out.println("tu saldo en la tarjeta es de " + this.saldoTarjeta+"€");
		System.out.println("--------------------------------------------------------");
	}
}
