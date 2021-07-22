package diagramas.de.flujo;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);// TECLADO
		
		System.out.println("Ingrese un Número");
		int N = teclado.nextInt();

		System.out.println("Asteriscos hacia abajo");

		for (int fila = 1; fila <=N; fila++) {
			for (int ast =N; ast>= fila; ast--) {
				System.out.print("*");
			}
			System.out.println();//SALTO DE LINEA
		}

	}

}