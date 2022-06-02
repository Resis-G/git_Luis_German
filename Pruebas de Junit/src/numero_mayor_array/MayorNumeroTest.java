package numero_mayor_array;

import static org.junit.Assert.*;

import org.junit.Test;

public class MayorNumeroTest {

	@Test
	public void test() {// el metodo mira en una lugar mas y solo paso tres numero (out of bound execpcion)
		
		try {
			int res = MayorNumero.obt_mayorNumero(new int[] { 77, 110, 9 });
			fail("no se ha capturado la execpcion");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("se ha capturado la execcion");
		}
		
		
	}
	@Test
	public void test2() {//cuando el primer numero del array es cero se produce una (execpcion aritmetrica)
		
		try {
			int res = MayorNumero.obt_mayorNumero2(new int[] { 0, 110, 9 });
			fail("no se ha capturado la execpcion");
		}catch(ArithmeticException e2) {
			System.out.println("se ha capturado la execcion");
		}
		
	}

}
