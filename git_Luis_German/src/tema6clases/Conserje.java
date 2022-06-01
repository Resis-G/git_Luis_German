package tema6clases;

public class Conserje extends Persona{
      private String horario;

	public Conserje(String dni, String nombre, String apellidos, String email, String horario) {
		super(dni, nombre, apellidos, email);
		this.horario = horario;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	@Override
	public String toString() {
		return super.toString() + "horario=" + horario ;
	}
      
	
}
