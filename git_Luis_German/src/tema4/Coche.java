package tema4;

public class Coche {

	// atributos
	private double kms_iniciales;
	private double kms_finales;
	private double gas_inicial;
	private double gas_final;
	//------------------------------------
	public Coche(double kms, double gas) {
		this.kms_iniciales = kms;
		this.kms_finales = kms;
		this.gas_inicial = gas;
		this.gas_final = gas;
	}
	//------------------------------------
	public Coche(double kms_iniciales, double kms_finales, double gas_inicial, double gas_final) {
		this.kms_iniciales = kms_iniciales;
		this.kms_finales = kms_finales;
		this.gas_inicial = gas_inicial;
		this.gas_final = gas_final;
	}
	//----------------------------------------
	public Coche() {
		this.kms_iniciales = 0.0;
		this.kms_finales = 0.0;
		this.gas_inicial = 0.0;
		this.gas_final = 0.0;
	}
	//-----------------------------------------
	public void incrementar_kms(double incremento_kms) {
		this.kms_iniciales = this.kms_finales;
		this.kms_finales = this.kms_iniciales + incremento_kms;
	}
	//----------------------------------------
	public void mostrarCoche() {
		//System.out.println("kilometros iniciales -> " + this.kms_iniciales);
		System.out.println("kilometros  -> " + this.kms_finales);
		//System.out.println("gasolina inicial -> " + this.gas_inicial);
		System.out.println("gasolina -> " + this.gas_final);
		System.out.println("-------------------------------------------");
		System.out.println("consumo actual -> " + this.mostrarConsumoActual());
	}
	//-----------------------------------------
		public void disminuir_gas(double decremento_gas) {
			this.gas_inicial = this.gas_final;
			this.gas_final = this.gas_inicial - decremento_gas;
		}
		//----------------------------------------
		public double mostrarConsumoActual() {
			double incremento_km = this.kms_finales - this.kms_iniciales;
			double consumo_gas = this.gas_inicial - this.gas_final;
			double media100 = 100.0 * consumo_gas / incremento_km;
			return media100;
		}

}
