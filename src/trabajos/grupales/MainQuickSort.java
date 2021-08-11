package trabajos.grupales;

import java.util.Arrays;
import java.util.Scanner;

public class MainQuickSort {
	
		public static void main(String[] args) {

			// TODO Auto-generated method stub
//GRUPO 1
//		Integrantes
//			-Salomé Jiménez
//			-Darly Castillo
//			-Cristian Chulca

//			Desarrollar un programa, que solicite al usuario ingresar el número de la longitud de un vector de enteros (int), 
//			a partir de este número, crear un vector con dicha longitud; el programa deberá solicitar al usuario que ingrese 
//			un número entero para cada posición del vector; luego de que se termine de ingresar los valores de todas las posiciones,
//			el programa deberá realizar un ordenamiento (de acuerdo con el método asignado por grupo) del vector en función
//			de sus valores ingresados.

			// Teclado
			Scanner teclado = new Scanner(System.in);
			// El usuario digita la longitud del vector.
			int longitud = teclado.nextInt();
			// Declaramos el Vector en un bucle
			int vectorGrupo1[] = new int[longitud];
			for (int fila = 0; fila < longitud; fila++) {
				System.out.println("El valor de la posición " + fila);// Me imprime el número de posiciones
				int numN = teclado.nextInt();
				vectorGrupo1[fila] = numN;
			}

			for (int fila = 0; fila < longitud; fila++) {
				System.out.print("[" + vectorGrupo1[fila] + "]" + " ");

			}
			System.out.println();
			for (int fila = 0; fila < longitud; fila++) {
			    quicksort(vectorGrupo1, 0, vectorGrupo1.length - 1);
				System.out.print("[" + vectorGrupo1[fila] + "]" + " ");
			}
		}

		private static int colocacion(int vectorGrupo1[], int izquierda, int derecha) {
			int pivote = vectorGrupo1[izquierda];
			while (true) {
				while (vectorGrupo1[izquierda] < pivote) {
					izquierda++;
				}
				while (vectorGrupo1[derecha] > pivote) {
					derecha--;
				}

				if (izquierda >= derecha) {
					return derecha;
				} else {

					int colocamiento = vectorGrupo1[izquierda];
					vectorGrupo1[izquierda] = vectorGrupo1[derecha];
					vectorGrupo1[derecha] = colocamiento;

					izquierda++;
					derecha--;
				}
			}
		}

		private static void quicksort(int vectorGrupo1[], int izquierda, int derecha) {
			if (izquierda < derecha) {
				int orden = colocacion(vectorGrupo1, izquierda, derecha);
				quicksort(vectorGrupo1, izquierda, orden);
				quicksort(vectorGrupo1, orden + 1, derecha);
			}
			
			System.out.println(" Ordenamiento de JAVA ");
		    Arrays.sort(vectorGrupo1);
		    System.out.println(" El vector antes de ordenar: " + Arrays.toString(vectorGrupo1));
		    
		    System.out.println(" El vector despues de ordenar: " + Arrays.toString(vectorGrupo1));
		}

	}
