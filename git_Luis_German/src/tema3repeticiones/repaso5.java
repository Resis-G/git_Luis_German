package tema3repeticiones;

public class repaso5 {

	public static void main(String[] args) {
		 /*
		   
		   *
		   ***
		   *****
		   *******
		   *********
		   ***********
		   
		  */
			
		   int lineas = 10;
		   for(int i=1; i<=lineas; i=i+2)
		   {
			   int estrellas = 1;
			   while(estrellas <= i)
			   {
				   System.out.print("*");
				   estrellas++;
			   }
			   System.out.println();
		   }
		   
	}

}
