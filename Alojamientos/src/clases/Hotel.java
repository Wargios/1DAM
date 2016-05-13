package clases;

public class Hotel extends Alojamiento {
	private static final int MIN_ESTRELLAS = 3;
	private static final int MAX_ESTRELLAS = 5;
	private static final int P3_ESTRELLAS = 30;
	private static final int P4_ESTRELLAS = 55;
	private static final int P5_ESTRELLAS = 72;

	private int estrellas;
	private int nHabitaciones;

	public Hotel(String nombre, String direccion, int estrellas, int nHabitaciones) throws AlojamientoException {
		super(nombre, direccion);
		setEstrellas(estrellas);
		setnHabitaciones(nHabitaciones);
	}

	public int getEstrellas() {
		return estrellas;
	}

	public int getnHabitaciones() throws AlojamientoException {
		if(nHabitaciones<1)
			throw new AlojamientoException("Numero de habitaciones incorrecto");
		return nHabitaciones;
	}

	public void setnHabitaciones(int nHabitaciones) {
		this.nHabitaciones = nHabitaciones;
	}

	public void setEstrellas(int estrellas) throws AlojamientoException {
		if (estrellas < MIN_ESTRELLAS || estrellas > MAX_ESTRELLAS)
			throw new AlojamientoException("Número de estrellas incorrecto");
		this.estrellas = estrellas;
	}

	public double calcularPrecio(int noches, Temporada temporada) {
		double pEstrellas = 0;
		double pTemporada = 0;
		double pFinal;

		switch (estrellas) {
		case 3:
			pEstrellas = P3_ESTRELLAS;
			break;

		case 4:
			pEstrellas = P4_ESTRELLAS;
			break;

		case 5:
			pEstrellas = P5_ESTRELLAS;
			break;
		}

		switch (temporada) {
		case ALTA:
			pTemporada = PT_ALTA;
			break;

		case MEDIA:
			pTemporada = PT_MEDIA;
			break;

		case BAJA:
			pTemporada = PT_BAJA;
			break;
		}

		pFinal = noches * pEstrellas * pTemporada;

		return pFinal;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("HOTEL " + super.toString());
		sb.append("\nNumero de habitaciones: " + nHabitaciones);
		sb.append("\nEstrellas: " + estrellas);
		return sb.toString();
	}

}
