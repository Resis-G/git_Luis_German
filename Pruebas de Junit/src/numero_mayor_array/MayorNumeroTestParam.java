package numero_mayor_array;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


	
	@RunWith(Parameterized.class)
	public class MayorNumeroTestParam {
		private int[] Numeros;
		private int result;
		
		
		
		public MayorNumeroTestParam(int[] Numeros,int result) {
			this.Numeros=Numeros;
			this.result=result;
		}
		/*
		 * aqui tengo preparado 5 casos de prueba para el metodo *contarCadenas* 
		 * caso1: conpruebo que devuelve el numero mayor
		 * caso2: compruebo que devuelve numero mayor aun siendo una fraccion,(la fraccion no da numero con decimales)
		 * caso3: compruebo que pasa si no paro ningun numero y me devuelve el minimo valor de un INTEGER
		 * coso4: compruebo que devuleve numero mayor pero esta ves si es un numero decimal, devuelve numero pero este trunca el decimal 
		 * 			ejemplo si es 2.5 te devuelve un 2(es una propiedad de los INTEGER)
		 */
		@Parameters
		public static Collection<Object[]> Cadenass(){
			int[] a1 = {1,2,3};
			int[] a2 = {1,6/2,10/5};
			int[] a3 = {};
			int[] a4 = {1/2,3/2,5/2};
			int[] a5 = {};
			return Arrays.asList(new Object[][] {{a1,3},{a2,3},{a3,0},{a4,5/2},{a5,4}});
		}

	@Test
	public void test() {
		int res = MayorNumero.obt_mayorNumero_Codigooriginal(Numeros);
		assertEquals(result,res);
		
	}

}
