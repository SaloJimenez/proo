package nicole.salome.jimenez.sangucho;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("Ingrese un n�mero positivo;") ;
		
		Scanner teclado = new Scanner (System.in);//TECLADO
			int N = teclado.nextInt();
			
			for(int C=N+1;C<=N+2;C++) {
			System.out.println("El siguiente n�mero positivo"+C);
			}
			System.out.println("Se ha finalizado la impresi�n de los numeros");
     }
}
