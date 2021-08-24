package ejercicios.ordenamiento;

public class Estudiante implements Comparable<I> {

	private String nombre;
	private int numeroLista;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;

	}

	public int getnumeroLista() {
		return numeroLista;

	}

	public void setNumeroLista(int numeroLista) {
		this.numeroLista = numeroLista();

	}

	@Override
	public int compareTo(Integer o) {
		// TODO Auto-generated method sthub }
		// Tres posibles retornos: 0 -1 1
		
		if (this.numeroLista > o) {
			return 1;
		} else if (this.numeroLista == o) {
			return 0;
		} else {
			return -1;
		}
	}
}
