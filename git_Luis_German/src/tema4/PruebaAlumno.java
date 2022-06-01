package tema4;

public class PruebaAlumno {

	public static void main(String[] args) {
	
		// voy a crear un alumno, es decir un objeto de la clase Alumno
		Alumno a1 = new Alumno("1234", "jose", 45, "1DAM");
		a1.setDni("4321");
		a1.setCurso("2DAM");
		a1.setNombre("pablo");
		String sunomber = a1.getNombre();
		int x = a1.getEdad();
		System.out.println("la edad del alumno a1 es " + x);
		String elcurso = a1.getCurso();
		System.out.println("el curso actual del alumno es " + elcurso);
	}

}
