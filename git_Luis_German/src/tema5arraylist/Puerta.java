package tema5arraylist;

public class Puerta {

	// atributos
	private String numerop;
	private Colores color;
	private boolean ventanillaAbierta;
	
	//-------------constructores---------------------------
	public Puerta(String numerop, Colores color, boolean ventanillaAbierta) {
		this.numerop = numerop;
		this.color = color;
		this.ventanillaAbierta = ventanillaAbierta;
	}
	
	public Puerta(String numerop, Colores color) {
		this.numerop = numerop;
		this.color = color;
		this.ventanillaAbierta = false;
	}
	public Puerta() {
		this.numerop = "se";
		this.color = Colores.NEGRO;
		this.ventanillaAbierta = false;
	}
	//-------------------------------------------------------

	public String getNumerop() {
		return numerop;
	}

	public void setNumerop(String numerop) {
		this.numerop = numerop;
	}

	public Colores getColor() {
		return color;
	}

	public void setColor(Colores color) {
		this.color = color;
	}

	public boolean isVentanillaAbierta() {
		return ventanillaAbierta;
	}

	public void setVentanillaAbierta(boolean ventanillaAbierta) {
		this.ventanillaAbierta = ventanillaAbierta;
	}
	//--------------------------------------------------------

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numerop == null) ? 0 : numerop.hashCode());
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
		Puerta other = (Puerta) obj;
		if (numerop == null) {
			if (other.numerop != null)
				return false;
		} else if (!numerop.equals(other.numerop))
			return false;
		return true;
	}
	//----------------------------------------------------------------

	@Override
	public String toString() {
		return "Puerta [numerop=" + numerop + ", color=" + color + ", ventanillaAbierta=" + ventanillaAbierta + "]";
	}
	
	//-----------------------------------------------------------------
	
	public void mostrarPuerta()
	{
		System.out.println("--------------------------------------");
		System.out.println("numero de puerta -> " + this.numerop);
		System.out.println("color de la puerta -> " + this.color);
		if(this.ventanillaAbierta == true)
		{
			System.out.println("VENTANILLA ABIERTA");
		}
		else {
			System.out.println("VENTANILLA CERRADA");
		}
	}
	
}
