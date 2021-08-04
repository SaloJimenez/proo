package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainVector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declarar un vector X[3] de tipo char y cosntruya un programa que pida al usuario que ingrese valores para cada posición y finalmente que se imprima todos los valores ingresados.
		     char X[]  = new char[3];
		     for (int i = 0; i < 3; i++) {
		    	 System.out.println("Ingrese el valor de la posición: " + i);
		    	
		    	 Scanner lector = new Scanner (System.in);
		    	 char n = lector.next().charAt(0);
		    	 X[i]=n;
		    	 
		     }
		     
		//Recorriendo el vector lleno
		     for(int i = 0; i < 3; i++) {
		    	 System.out.println("El valor de posición: " + i);
		    	 System.out.println(X[i]);
		    	 
		     }
	}

}