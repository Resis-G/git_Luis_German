package interfacesgraficas;

public class Menu {
	private String nombre;
	private String plato1;
	private String plato2;
	private String plato3;
	private double preciop1;
	private double preciop2;
	private double preciop3;
	
	public final double IVA = 0.21;
	//-----------------------------------
	public Menu(String nombre, String plato1, String plato2, String plato3, double preciop1, double preciop2,
			double preciop3) {
		this.nombre = nombre;
		this.plato1 = plato1;
		this.plato2 = plato2;
		this.plato3 = plato3;
		this.preciop1 = preciop1;
		this.preciop2 = preciop2;
		this.preciop3 = preciop3;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPlato1() {
		return plato1;
	}
	public void setPlato1(String plato1) {
		this.plato1 = plato1;
	}
	public String getPlato2() {
		return plato2;
	}
	public void setPlato2(String plato2) {
		this.plato2 = plato2;
	}
	public String getPlato3() {
		return plato3;
	}
	public void setPlato3(String plato3) {
		this.plato3 = plato3;
	}
	public double getPreciop1() {
		return preciop1;
	}
	public void setPreciop1(double preciop1) {
		this.preciop1 = preciop1;
	}
	public double getPreciop2() {
		return preciop2;
	}
	public void setPreciop2(double preciop2) {
		this.preciop2 = preciop2;
	}
	public double getPreciop3() {
		return preciop3;
	}
	public void setPreciop3(double preciop3) {
		this.preciop3 = preciop3;
	}
	@Override
	public String toString() {
		return "Menu [nombre=" + nombre + ", plato1=" + plato1 + ", plato2=" + plato2 + ", plato3=" + plato3
				+ ", preciop1=" + preciop1 + ", preciop2=" + preciop2 + ", preciop3=" + preciop3 + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Menu other = (Menu) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	public double calcularTotalSinIva()
	{
		double suma = this.preciop1 + this.preciop2 + this.preciop3;
		return suma;
	}
	
	public double calcularTotalConIva()
	{
		double suma = this.calcularTotalSinIva() * (1+IVA);
		return suma;
	}
}
