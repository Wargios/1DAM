package clases;

public abstract class Alojamiento {
	protected static final double PT_BAJA = 1; // +0%
	protected static final double PT_MEDIA = 1.10; // +10%
	protected static final double PT_ALTA = 1.20; // +20%
	private String nombre;
	private String direccion;
	private int nota;
	private int opiniones;

	public enum Temporada {
		ALTA, MEDIA, BAJA
	}

	public Alojamiento(String nombre, String direccion) {
		this.direccion = direccion;
		this.nombre = nombre;
		nota = 0;
		opiniones = 0;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public int getNota() {
		return nota;
	}

	public int getTotalOpiniones() {
		return opiniones;
	}

	public void darNota(int nota) throws AlojamientoException {
		if (nota < 0 || nota > 10)
			throw new AlojamientoException("Número incorrecto para nota.");
		opiniones++;
		this.nota += nota;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nombre + "\nDireccion: " + direccion);
		if (opiniones == 0) {
			sb.append("\nSIN OPINIONES");
		} else {
			sb.append("\nNota: " + nota / opiniones);
		}
		return sb.toString();
	}

	public abstract double calcularPrecio(int noches, Temporada temporada);

	public boolean equals(Alojamiento otro) {
		boolean resul = false;
		if (nombre.equals(otro.nombre))
			resul = true;

		return resul;
	}

}
