package interfacesgraficas;

public class Plato {
	private String nombrep;
	private double preciop;
	
	public Plato(String nombrep, double preciop) {
		this.nombrep = nombrep;
		this.preciop = preciop;
	}

	public String getNombrep() {
		return nombrep;
	}

	public void setNombrep(String nombrep) {
		this.nombrep = nombrep;
	}

	public double getPreciop() {
		return preciop;
	}

	public void setPreciop(double preciop) {
		this.preciop = preciop;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombrep == null) ? 0 : nombrep.hashCode());
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
		Plato other = (Plato) obj;
		if (nombrep == null) {
			if (other.nombrep != null)
				return false;
		} else if (!nombrep.equals(other.nombrep))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return  nombrep;
	}
	
	
	
}
