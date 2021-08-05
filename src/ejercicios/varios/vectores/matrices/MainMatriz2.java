package ejercicios.varios.vectores.matrices;

public class MainMatriz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.Desarrollar un programa que imprima la siguiente imagen
		    //0   1  0  0  0  0
		    //1   0  1  0  0  0
		    //2   0  0  1  0  0
		    //3   0  0  0  1  0
		    //4   0  0  0  0  1
		        //0  1  2  3  4

		int B[][] = new int[5][5];
		for (int fila = 0; fila < 5; fila++)
		for (int columna = 0; columna < 5; columna++) {
			if(fila == columna) {
			B[fila][columna] = 1;
			
			} else {
				
			B[fila][columna] = 0;
			
			}
			
			System.out.print(B[fila][columna] + " ");
		}
		
		System.out.println();
				
	}

}
