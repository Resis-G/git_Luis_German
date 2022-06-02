package cuentacadenas;

import static org.junit.Assert.*;


import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


	@RunWith(Parameterized.class)
	public class CuentaCadenasTestParam {
		private String cadena;
		private String a_leer;
		private int result;
		
		
		public CuentaCadenasTestParam(String cadena,String a_leer,int result) {
			this.cadena= cadena;
			this.a_leer= a_leer;
			this.result= result;
			
		}
		/*
		 * aqui tengo preparado 5 casos de prueba para el metodo *contarCadenas* 
		 * caso1: conpruebo que se puede contar aun siendo mayúsculas
		 * caso2: compruebo que puede contar un conjunto de caractéres
		 * caso3: compruebo que puedo contar un único caracter
		 * coso4: compruebo que pueda diferenciar una (a) de (á)
		 * caso5: compruebo que pueda contar caractéres especiales
		 */
		@Parameters
		public static Collection<Object[]> Cadenass(){
			return Arrays.asList(new Object[][] {{"D","asdasdasdasdasd",5},{"asd","asdasdasdasdasd",5},{"a","asdasdasdasdasd",5},{"ásd","asdasdasdasdasd",5},{"ç","çsdasdasdasdasd",1}});
		}
		
		@Test
		public void contarCadenas() {
			CuentaCadenas c1 = new CuentaCadenas();
			int resultado = c1.contarCadenas(this.cadena, this.a_leer);
			assertEquals(result, resultado);
		}
	}
	


