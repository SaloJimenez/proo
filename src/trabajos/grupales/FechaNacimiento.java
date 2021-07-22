package trabajos.grupales;

import java.util.Scanner;

public class FechaNacimiento {
	
	//TRABAJO GRUPO 4
		//INTEGRANTES:
		// SALOMÉ JIMENEZ
		// DARLY CASTILLO
		// KEVIN PAZMIÑO
		// ROYNAR SANDO
		
		
		// Ejercicio:
		// Se ingresa por teclado 3 números correspondientes a la fecha de nacimiento de
		// la persona,
		// el primer número es el día, el segundo número es el mes y el tercero número
		// es el año de nacimiento,
		// de la misma manera se debe ingresar la fecha actual.
		// Se asume que las fechas ingresadas están correctas, es decir que son fechas
		// reales.
		// El programa debe calcular la edad de la persona. Ejemplo de la impresión
		// final del programa:
		// "Su edad es: 21 años, 3 meses, 15 días"
		// Nota: el programa debe tomar en cuenta los días que tiene cada mes que no
		// siempre van a ser iguales,
		// y más aún cuando es un año bisiesto.
		// Un año es bisiesto cuando es divisible por 4, es decir se cumple esta
		// condición: A%4==0
		// “A” es la variable del año.

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner teclado = new Scanner(System.in);// TECLADO
			
			System.out.println("---------------FECHA DE NACIMIENTO---------------");

			System.out.println("Ingrese el Día de Nacimiento");
			int Día = teclado.nextInt();

			System.out.println("Ingrese el Mes de Nacimiento");
			int Mes = teclado.nextInt();

			System.out.println("Ingrese el Año de Nacimiento");
			int Año = teclado.nextInt();
			System.out.println("");
			
			System.out.println("------------------FECHA ACTUAL-------------------");
			
			System.out.println("Ingrese Día Actual");
			int DíaA = teclado.nextInt();
			
			System.out.println("Ingrese Mes Actual");
			int MesA = teclado.nextInt();
			
			System.out.println("Ingrese Año Actual");
			int AñoA = teclado.nextInt();
			
			System.out.println("");
			
			System.out.println("---------------------Edad-----------------------");
			System.out.println("");
			int Edad = AñoA - Año;
			System.out.println("Su Edad es: " + Edad + " Años ");
			
			if ((Día >= 1) && (Día <= 31)){
				if (((Mes == 1) || (Mes == 3) || (Mes == 5) || (Mes == 7) || (Mes == 8) || (Mes == 10) || (Mes == 12)) && (Mes <= 12)) {
					if (Año != 0) {
						System.out.println("Fecha de Nacimiento: "+ Día + "/" + Mes + "/" + Año);
						System.out.println("Fecha Actual: " + DíaA + "/" + MesA + "/" + AñoA);
					}else {
						System.out.println("Año Incorrecto");
					}
					
				}else {
				
				}
			}else {
				System.out.println("Día Incorrecto");
			}
			
			if ((Día >= 1) && (Día <= 30)) {
				if (((Mes == 4) || (Mes == 6) || (Mes == 9) || (Mes == 11)) && (Mes < 12)){
					if (Año != 0) {
						System.out.println("Fecha de Nacimiento: "+ Día + "/" + Mes + "/" + Año);
						System.out.println("Fecha Actual: " + DíaA + "/" + MesA + "/" + AñoA);
					}else {
						System.out.println("Año Incorrecto");
					}
				}else {
				}
			}else {
		
			}
			
			if ((Día >= 1 ) && ((Día <= 28))) {
				if (Mes == 2) {
					if (Año != 0) {
						System.out.println("Fecha de Nacimiento: "+ Día + "/" + Mes + "/" + Año);
						System.out.println("Fecha Actual: " + DíaA + "/" + MesA + "/" + AñoA);
					}else {
						System.out.println("Año Incorrecto");
					}
				}else {

				}
			}else {

			}
			
			if (Día == 29) {
				if (Mes == 2) {
					if ((Año != 0) && (Año % 4 == 0) && ((Año % 100 != 0) || (Año % 400 == 0))) {
					  System.out.println("El Mes tiene 29 días porque es año bisiesto");
					}else {
						
					}
				}else {
					
				}
			}else {
				}
			
			if ((Año != 0) && (Año % 4 == 0) && ((Año % 100 != 0) || (Año % 400 == 0))) {
				  System.out.println("El Año de nacimiento es bisiesto");
				}else {
					System.out.println("El Año de nacimiento no es bisiesto");
				}
			
			if ((DíaA >= 1) && (DíaA <= 31)){
				if (((MesA == 1) || (MesA == 3) || (MesA == 5) || (MesA == 7) || (MesA == 8) || (MesA == 10) || (MesA == 12)) && (MesA <= 12)) {
					if (AñoA != 0) {
						
					}else {
						System.out.println("Año actual Incorrecto");
					}
					
				}else {
					
				}
			}else {
				System.out.println("Día actual Incorrecto");
			}
			
			if ((DíaA >= 1) && (DíaA <= 30)) {
				if (((MesA == 4) || (MesA == 6) || (MesA == 9) || (MesA == 11)) && (MesA < 12)){
					if (AñoA != 0) {
					}else {
						System.out.println("Año actual Incorrecto");
					}
					
				}else {
					
				}
			}else {
				
			}
			
			if ((DíaA >= 1 ) && ((DíaA <= 28))) {
				if (MesA == 2) {
					if (AñoA != 0) {
					}else {
						System.out.println("Año actual Incorrecto");
					}
				}else {

				}
			}else {
				
			}
			
			if (DíaA == 29) {
				if (MesA == 2) {
					if ((AñoA != 0) && (AñoA % 4 == 0) && ((AñoA % 100 != 0) || (AñoA % 400 == 0))) {
					  System.out.println("El Mes actual tiene 29 días y es bisiesto");
					}else {
						
					}
				}else {
					
				}
			}else {
				}
			
			if ((AñoA != 0) && (AñoA % 4 == 0) && ((AñoA % 100 != 0) || (AñoA % 400 == 0))) {
				  System.out.println("El Año actual es bisiesto");
				}else {
					System.out.println("El Año actual no es bisiesto");
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