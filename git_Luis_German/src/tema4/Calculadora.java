package tema4;

public class Calculadora {
// atributos
	private double numero1;
	private double numero2;
// constructores
	public Calculadora(double numero1, double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	public Calculadora() {
		this.numero1 = 0.0;
		this.numero2 = 0.0;
	}
//----------------------------------------------
// metodos getters y setters
	public double getNumero1() {
		return numero1;
	}
	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}
	public double getNumero2() {
		return numero2;
	}
	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}
	
	// metodos de la calculadora
//-----------------------------------------------------
	public double sumar()
	{
		double suma = this.numero1 + this.numero2;
		return suma;
		
	}
//-----------------------------------------------------
	public double restar()
	{
		double resta = this.numero1 - this.numero2;
		return resta;
	}
//--------------------------------------------------
	public double multiplicar() {
		double multiplicacion = this.numero1 * this.numero2;
		return multiplicacion;
	}
//----------------------------------------------
	public double dividir() {
		double division = this.numero1 / this.numero2;
		return division;
	}
	public double calcularResto() {
		double resto = this.numero1 % this.numero2;
		return resto;
	}
}
