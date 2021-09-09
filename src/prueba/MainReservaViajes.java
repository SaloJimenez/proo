package prueba;

import java.util.Scanner;

public class MainReservaViajes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tecladoInt = new Scanner (System.in); 
		System.out.println(" Ingrese información de la reserva ");
		Scanner tecladoString = new Scanner (System.in); 
		System.out.println(" Ingrse el primer nombre del pasajero ");
		String nombre = tecladoString.nextLine();
		System.out.println("Ingrese el primer apellido del pasajero ");
		String apellido = tecladoString.nextLine();
		System.out.println("Ingrese edad");
		int edad = tecladoInt.nextInt();
		System.out.println("El pasajero es: 1:Adulto 2:Tercera edad");
		int opcion = tecladoInt.nextInt();

		String seguroSocial = "";
		String jubilacion = "";
		if (opcion == 1) {
			System.out.println("Ingrese el código de seguro social");
			seguroSocial = tecladoString.nextLine();
		} else {
			System.out.println("Ingrese el código de jubilación");
			jubilacion = tecladoString.nextLine();
		}

		PasAdulto adulto1 = new PasAdulto();
		adulto1.setApellido("Sofía");
		adulto1.setNombre("Arias");
		adulto1.setSeguroSocial("al2");
		adulto1.setEdad(27);

		PasAdulto adulto2 = new PasAdulto();
		adulto2.setApellido("Silvia");
		adulto2.setNombre("Monteros");
		adulto2.setSeguroSocial("fi8");
		adulto2.setEdad(53);

		PasTerceraEdad terceraEdad1 = new PasajeroEconomico();
		terceraEdad1 .setNombre(" Lady ");
		terceraEdad1 .setApellido(" Campos ");
		terceraEdad1 .setJubilacion(" df6 ");
		terceraEdad1 .setEdad(33);

		PasTerceraEdad terceraEdad2 = new PasajeroEconomico();
		terceraEdad2 .setNombre(" Lady2 ");
		terceraEdad2 .setApellido(" Campos2 ");
		terceraEdad2 .setJubilacion(" df6 ");
		terceraEdad2 .setEdad(34);

		Pasajero[][] asientos = new Pasajero[8][4];
		asientos[0][0] = adulto1;
		asientos[0][1] = adulto2;
		asientos[1][2] = terceraEdad1;
		asientos[3][2] = terceraEdad2;

		int opcionSalir = 0;
		do {
			System.out.println("Ingrese los datos del asiento, 0 continuar , -1 SALIR");
			opcionSalir = tecladoInt.nextInt();
			if (opcionSalir == 0) {
				System.out.println("Ingrese la fila del asiento");
				int fila = tecladoInt.nextInt();
				System.out.println("Ingrese la columna del asiento");
				int columna = tecladoInt.nextInt();
				System.out.println("Los datos del pasajero son:");
				System.out.println(asientos[fila][columna]);
			} else if (opcionSalir == -1) {
				System.out.println("Va ha salir del sistema");
			}
		} while (opcionSalir != -1);
		
		private String codigoDescuento;

		public PasAdulto(String primer nombre, String primer apellido, String codigoSeguroSocial, int edad) {
		}

		public PasAdulto() {

		}

		public String getCodigoJubilacion() {
			return codigoJubilacion;
		}

		public void setCodigoJubilacion(String codigoJubilacion) {
			this.codigoJubilacion = codigoJubilacion;
		}

		@Override
		public String toString() {
			return "PasAdulto= " +this.nombre+ " codigoSeguroSocial= " + codigoSeguroSocial + "";
					
}
	}
}
