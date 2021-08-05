package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainMatriz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.Declare una matriz A[3,4] de tipo char y desaroolle un programa que vaya solicitando cada una de sus posiciones
	      int longituColumnas = teclado.nexIn();
		    char A[][] = new char[longitudFila][LongitudColumnas];
		    for (int fila= 0; fila < longitudFila; fila++) {
		    for (int columna= 0; LongitudColumnas < 4; columna++) {
			System.out.println("Ingrese el valor fila: " + fila + " columna: " + columna);
			//El usuario digital el valor por teclado y a continuación lo leo
	    	 char n = teclado.next().charAt(0);
	    	 A [fila][columna] = n;
	   }
	 }
		    System.out.println("Iniciamos a imprimir la matriz");
		    	        
		    for (int fila = 0; fila < longitudFila; fila++) {
	    	for (int columna = 0; columna < LongitudColumnas; columna++) {
	    	System.out.print(A[fila][columna]+ " ");
      }
	    	System.out.prinln();
	}
  }
}
