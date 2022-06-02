package serie_aritmetica;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SerieAritmeticaTest {

	@Test
	public void test() {//Compruebo si suma correctamente los elementos de la sucesion
		SerieAritmetica s1 = new SerieAritmetica(2,5);
		int suma = s1.suma(4);
		assertEquals("el resultado del metodo no es el esperado",38, suma);
		
	}
	
	@Test
	public void test2() {//Compruebo si ocurre un decremento a medida que avanza la sucecion
		SerieAritmetica s1 = new SerieAritmetica(2,-5);
		int suma = s1.suma(4);
		assertEquals("no se resta correctamente",-22, suma);
		
	}
	@Test
	public void test3() {//compruebo si suma correctamente numero decimales
		SerieAritmetica s1 = new SerieAritmetica(2,(5/2));
		int suma = s1.suma(4);
		assertEquals("no suma correctamentenumeros decimales)",23, suma);
		
	}
	@Test
	public void test4() {
		SerieAritmetica s1 = new SerieAritmetica(-2,-5);
		int suma = s1.suma(4);
		assertEquals("los numeros negativos no se suman bien",-38, suma);
		
	}

}
