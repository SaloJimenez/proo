package ejercicio.vectores;

public class MainVectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Declarar un vector miVector[10] de tipo int
				int miVector[] = new int[10];
				
		//2. Declarar un vector miVector[5] de tipo char
				char miVector1[] = new char [5];
				
		//3. Declarar un vector miVec[4] de tipo char y asignamos la letra 'A' la posici�n 0 y 2
				char miVec[] = new char[4];
				miVec[0] = 'A';
				miVec[2] = 'A';
				
		//4. Declarar un vector miVec1[3] de tipo byte y asignamos el n�mero 0 a las posiciones 0,1,2 y 3
				byte miVec1[] = new byte[3];
				miVec1[0] = 0;
				miVec1[1] = 0;
				miVec1[2] = 0;
				//miVec1[3] = 0; Est� en una mala asignaci�n porque est� fuera de rango de la posici�n 3
				
		//5. Declarar un vector miVec2[3] de tipo char y asignamos la letra A a las posici�nes 0 y 1; y a la posici�n 2 la letra B, finalmente imprimir las posiciones 0 y 2.
				char miVec2[] = new char[3];
				miVec2[0] = 'A';
				miVec2[1] = 'A';
				miVec2[2] = 'B';
				
				System.out.println("Impresi�n 1:" + miVec2[0]);
				
				miVec2[0] = 'Z';
				
				System.out.println("Impresi�n 1:" + miVec2[0]);
				System.out.println("Impresi�n 2:" + miVec2[2]);		
		
				
	}

}