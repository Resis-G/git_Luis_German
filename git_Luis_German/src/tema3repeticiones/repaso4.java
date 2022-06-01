package tema3repeticiones;

public class repaso4 {

	 /*
	   
	   *
	   **
	   ***
	   ****
	   *****
	   ******
	   
	   
	  */
	public static void main(String[] args) {
		final int lineas = 200;
		
		for(int i=1; i<=lineas; i++)
		{
			int estrellas = 1;
			while(estrellas <= i)
			{
				System.out.print("*");
				estrellas++;
			}
			System.out.println("");
		}

	}

}
