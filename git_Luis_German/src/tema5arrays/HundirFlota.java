package tema5arrays;

public class HundirFlota {
	private final int NUM_FILAS;
	private final int NUM_COLUMNAS;
	private int[][] tablero;
	private final int NUM_BARCOS;
	private int barcos_hundidos;
	private int[][] tablero_destapado;
	
	public HundirFlota(int NUM_FILAS, int NUM_COLUMNAS, int NUM_BARCOS) {
		this.barcos_hundidos = 0;
		this.NUM_FILAS = NUM_FILAS;
		this.NUM_COLUMNAS = NUM_COLUMNAS;
		this.tablero = new int[this.NUM_FILAS][this.NUM_COLUMNAS]; 
		this.tablero_destapado = new int[this.NUM_FILAS][this.NUM_COLUMNAS]; 
		this.NUM_BARCOS = NUM_BARCOS;
		colocarBarcosAleatorios();
	}

	private void colocarBarcosAleatorios() 
	{
		int colocados = 0;
		while(colocados < this.NUM_BARCOS)
		{
			int filaA = (int) (Math.random() * NUM_FILAS);
			int colA =  (int) (Math.random() * NUM_COLUMNAS);
			if(this.tablero[filaA][colA] == 0)
			{
				this.tablero[filaA][colA] = 1;
				colocados++;
			}
		}
	}

	public int[][] getTablero() {
		return tablero;
	}

	public void setTablero(int[][] tablero) {
		this.tablero = tablero;
	}

	public int getNUM_FILAS() {
		return NUM_FILAS;
	}

	public int getNUM_COLUMNAS() {
		return NUM_COLUMNAS;
	}

	public int getNUM_BARCOS() {
		return NUM_BARCOS;
	}

	public void mostrarTablero() {
		System.out.println("*******************");
		for(int i=0; i< this.NUM_FILAS; i++)
		{
			for(int j=0; j<this.NUM_COLUMNAS; j++)
			{
				int c = this.tablero[i][j];
				if(c == 0)
				{
					System.out.print(" =");
				}
				else if(c == 1)
				{
					System.out.print(" I");
				}
				else if(c == 2)
				{
					System.out.print(" X");
				}
			}
			System.out.println();
		}
		System.out.println("*******************");
		
	}

	public void realizarJugada(int fila, int columna) {
		int casilla = this.tablero[fila][columna];
		this.tablero_destapado[fila][columna] = 1;
		if(casilla == 0)
		{
			System.out.println("AGUA");
		}
		else if(casilla == 1)
		{
			System.out.println("BARCO! TOCADO Y HUNDIDO");
			this.barcos_hundidos++;
			this.tablero[fila][columna] = 2;
		}
		else if(casilla == 2)
		
		{
			System.out.println("ES BARCO YA ESTÁ HUNDIDO");
		}
	}

	public boolean flotaHundida() {
		if(this.barcos_hundidos == this.NUM_BARCOS)
		{
			return true;
		}
		return false;
	}

	public void mostrarTableroDestapado() {
		System.out.println("*******************");
		for(int i=0; i< this.NUM_FILAS; i++)
		{
			for(int j=0; j<this.NUM_COLUMNAS; j++)
			{
				int c = this.tablero_destapado[i][j];
				if(c == 0)
				{
					System.out.print(" *");
				}
				else if(c == 1)
				{
					System.out.print(" "+this.tablero[i][j]);
				}
			}
			System.out.println();
		}
		System.out.println("*******************");
		
	}
	
	
	

}
