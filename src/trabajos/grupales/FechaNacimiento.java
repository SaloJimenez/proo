package trabajos.grupales;

import java.util.Scanner;

public class FechaNacimiento {
	
	//TRABAJO GRUPO 4
		//INTEGRANTES:
		// SALOM� JIMENEZ
		// DARLY CASTILLO
		// KEVIN PAZMI�O
		// ROYNAR SANDO
		
		
		// Ejercicio:
		// Se ingresa por teclado 3 n�meros correspondientes a la fecha de nacimiento de
		// la persona,
		// el primer n�mero es el d�a, el segundo n�mero es el mes y el tercero n�mero
		// es el a�o de nacimiento,
		// de la misma manera se debe ingresar la fecha actual.
		// Se asume que las fechas ingresadas est�n correctas, es decir que son fechas
		// reales.
		// El programa debe calcular la edad de la persona. Ejemplo de la impresi�n
		// final del programa:
		// "Su edad es: 21 a�os, 3 meses, 15 d�as"
		// Nota: el programa debe tomar en cuenta los d�as que tiene cada mes que no
		// siempre van a ser iguales,
		// y m�s a�n cuando es un a�o bisiesto.
		// Un a�o es bisiesto cuando es divisible por 4, es decir se cumple esta
		// condici�n: A%4==0
		// �A� es la variable del a�o.

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner teclado = new Scanner(System.in);// TECLADO
			
			System.out.println("---------------FECHA DE NACIMIENTO---------------");

			System.out.println("Ingrese el D�a de Nacimiento");
			int D�a = teclado.nextInt();

			System.out.println("Ingrese el Mes de Nacimiento");
			int Mes = teclado.nextInt();

			System.out.println("Ingrese el A�o de Nacimiento");
			int A�o = teclado.nextInt();
			System.out.println("");
			
			System.out.println("------------------FECHA ACTUAL-------------------");
			
			System.out.println("Ingrese D�a Actual");
			int D�aA = teclado.nextInt();
			
			System.out.println("Ingrese Mes Actual");
			int MesA = teclado.nextInt();
			
			System.out.println("Ingrese A�o Actual");
			int A�oA = teclado.nextInt();
			
			System.out.println("");
			
			System.out.println("---------------------Edad-----------------------");
			System.out.println("");
			int Edad = A�oA - A�o;
			System.out.println("Su Edad es: " + Edad + " A�os ");
			
			if ((D�a >= 1) && (D�a <= 31)){
				if (((Mes == 1) || (Mes == 3) || (Mes == 5) || (Mes == 7) || (Mes == 8) || (Mes == 10) || (Mes == 12)) && (Mes <= 12)) {
					if (A�o != 0) {
						System.out.println("Fecha de Nacimiento: "+ D�a + "/" + Mes + "/" + A�o);
						System.out.println("Fecha Actual: " + D�aA + "/" + MesA + "/" + A�oA);
					}else {
						System.out.println("A�o Incorrecto");
					}
					
				}else {
				
				}
			}else {
				System.out.println("D�a Incorrecto");
			}
			
			if ((D�a >= 1) && (D�a <= 30)) {
				if (((Mes == 4) || (Mes == 6) || (Mes == 9) || (Mes == 11)) && (Mes < 12)){
					if (A�o != 0) {
						System.out.println("Fecha de Nacimiento: "+ D�a + "/" + Mes + "/" + A�o);
						System.out.println("Fecha Actual: " + D�aA + "/" + MesA + "/" + A�oA);
					}else {
						System.out.println("A�o Incorrecto");
					}
				}else {
				}
			}else {
		
			}
			
			if ((D�a >= 1 ) && ((D�a <= 28))) {
				if (Mes == 2) {
					if (A�o != 0) {
						System.out.println("Fecha de Nacimiento: "+ D�a + "/" + Mes + "/" + A�o);
						System.out.println("Fecha Actual: " + D�aA + "/" + MesA + "/" + A�oA);
					}else {
						System.out.println("A�o Incorrecto");
					}
				}else {

				}
			}else {

			}
			
			if (D�a == 29) {
				if (Mes == 2) {
					if ((A�o != 0) && (A�o % 4 == 0) && ((A�o % 100 != 0) || (A�o % 400 == 0))) {
					  System.out.println("El Mes tiene 29 d�as porque es a�o bisiesto");
					}else {
						
					}
				}else {
					
				}
			}else {
				}
			
			if ((A�o != 0) && (A�o % 4 == 0) && ((A�o % 100 != 0) || (A�o % 400 == 0))) {
				  System.out.println("El A�o de nacimiento es bisiesto");
				}else {
					System.out.println("El A�o de nacimiento no es bisiesto");
				}
			
			if ((D�aA >= 1) && (D�aA <= 31)){
				if (((MesA == 1) || (MesA == 3) || (MesA == 5) || (MesA == 7) || (MesA == 8) || (MesA == 10) || (MesA == 12)) && (MesA <= 12)) {
					if (A�oA != 0) {
						
					}else {
						System.out.println("A�o actual Incorrecto");
					}
					
				}else {
					
				}
			}else {
				System.out.println("D�a actual Incorrecto");
			}
			
			if ((D�aA >= 1) && (D�aA <= 30)) {
				if (((MesA == 4) || (MesA == 6) || (MesA == 9) || (MesA == 11)) && (MesA < 12)){
					if (A�oA != 0) {
					}else {
						System.out.println("A�o actual Incorrecto");
					}
					
				}else {
					
				}
			}else {
				
			}
			
			if ((D�aA >= 1 ) && ((D�aA <= 28))) {
				if (MesA == 2) {
					if (A�oA != 0) {
					}else {
						System.out.println("A�o actual Incorrecto");
					}
				}else {

				}
			}else {
				
			}
			
			if (D�aA == 29) {
				if (MesA == 2) {
					if ((A�oA != 0) && (A�oA % 4 == 0) && ((A�oA % 100 != 0) || (A�oA % 400 == 0))) {
					  System.out.println("El Mes actual tiene 29 d�as y es bisiesto");
					}else {
						
					}
				}else {
					
				}
			}else {
				}
			
			if ((A�oA != 0) && (A�oA % 4 == 0) && ((A�oA % 100 != 0) || (A�oA % 400 == 0))) {
				  System.out.println("El A�o actual es bisiesto");
				}else {
					System.out.println("El A�o actual no es bisiesto");
				}
			
			if (Mes >= 13) {
				System.out.println("Mes Incorrecto");
			}else {
				
			}
			
			if ( MesA >= 13) {
				System.out.println("El mes actual es incorrecto");
			}else {
				
			}
		}
	}