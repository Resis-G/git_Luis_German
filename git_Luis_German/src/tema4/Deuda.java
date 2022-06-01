package tema4;

public class Deuda {
	
	private final double MAX_DEUDA = 2000.0;
    // atributos
	private double deuda;
	
	// constructores
	public Deuda(double deuda) {
		this.deuda = deuda;
	}
	public Deuda() {
		this.deuda = 0;
	}
	// getters y setters
	public double getDeuda() {
		return deuda;
	}
	public void setDeuda(double deuda) {
		this.deuda = deuda;
	}
	//------------------------
	public boolean pagar(double dinero)
	{
		if(dinero < 0)
		{
			return false;
		}
		//-----------------------------------
		// aqui ha llegado si el dinero es mayor que cero
		this.deuda = this.deuda - dinero;
		if(this.deuda <= 0)
		{
			System.out.println("se ha saldado la deuda");
		}
		//----------------------------------
		if(this.deuda < 0)
		{
			System.out.println("te devuelvo " + Math.abs(this.deuda));
			this.deuda = 0;
		}
		return true;
	}
	//-------------------------------------------------------
	public boolean pedir(double dinero)
	{
		if((this.deuda + dinero) > MAX_DEUDA )
		{
			System.out.println("no puedo dejarte tanto dinero ");
			System.out.println("tu deuda actual es " + this.deuda);
			System.out.println("el límite de la deuda es " + MAX_DEUDA);
			return false;
		}
		//--------------------------------------------------------
		// si llega aqui es que hay suficiente dinero
		this.deuda = this.deuda + dinero;
		System.out.println("tu deuda actual queda a " + this.deuda);
		return true;
	}
	//-------------------------------------------------------
	public void cobrarIntereses(double interes)
	{
		double cobrado = this.deuda * interes / 100.0;
		this.deuda = this.deuda + cobrado;
	}
	//-------------------------------------------------------
	public void mostrarDeuda()
	{
		System.out.println("tu deuda actual es de " + this.deuda);
	}
	//--------------------------------------------------------	
}
