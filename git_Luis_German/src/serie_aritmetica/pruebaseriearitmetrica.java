package serie_aritmetica;



public class pruebaseriearitmetrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SerieAritmetica s1 = new SerieAritmetica(2,(5/2));
		s1.muestra(4);
		int sumaDeTodo = s1.suma(4);
		System.out.println(sumaDeTodo);
	}

}
