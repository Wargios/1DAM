
public class Socio implements Comparable<Socio> {
	private String dni;
	private String nombre;
	private int telefono;


	public Socio(String dni, String nombre, int telefono) {
		this.dni = dni;
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	@Override
	public int compareTo(Socio o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Socio [dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono + "]";
	}
}
