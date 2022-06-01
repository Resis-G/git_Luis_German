package tema4;

import java.text.DecimalFormat;

public class Nota {
// atributos
	private String nombre;
	private double nota1;
	private double nota2;
	private double nota3;
//----------------------------------------------------------
// constructores
	public Nota(String nombre, double nota1, double nota2, double nota3) {
		this.nombre = nombre;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
public Nota() {
	this.nombre = "sin especificar";
	this.nota1 = 0.0;
	this.nota2 = 0.0;
	this.nota3 = 0.0;
}
//-----------------------------------------------------------
// getters y setters
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public double getNota1() {
	return nota1;
}
public void setNota1(double nota1) {
	this.nota1 = nota1;
}
public double getNota2() {
	return nota2;
}
public void setNota2(double nota2) {
	this.nota2 = nota2;
}
public double getNota3() {
	return nota3;
}
public void setNota3(double nota3) {
	this.nota3 = nota3;
}
//-----------------------------------------------------------
public double calcularMedia()
{
	double media = (this.nota1 + this.nota2 + this.nota3) / 3.0;
	return media;
}
//------------------------------------------------------------
public void mostrarNota()
{
	//----------------------------------------------------
	double media1 = this.calcularMedia();
	//-----------------------------------------------------
	DecimalFormat df = new DecimalFormat("#.00");
	System.out.println("----------------------------------------------------------");
	System.out.println("nombre: " + this.nombre);
	System.out.println("nota1: " + this.nota1);
	System.out.println("nota2: " + this.nota2);
	System.out.println("nota3 " + this.nota3);
	System.out.println("la nota media del alumno " + this.nombre + " es de "  + df.format(media1));
	System.out.println("----------------------------------------------------------");
}
}
