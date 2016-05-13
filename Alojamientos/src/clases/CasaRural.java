package clases;

public class CasaRural extends Alojamiento {
	private static final double PRECIO_METRO = 0.75;
	private boolean hayPiscina;
	private int metrosCuadrados;

	public CasaRural(String nombre, String direccion, boolean piscina, int metros) throws AlojamientoException {
		super(nombre, direccion);
		hayPiscina = piscina;
		setMetrosCuadrados(metros);
	}

	public int getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public boolean isHayPiscina() {
		return hayPiscina;
	}

	public void setMetrosCuadrados(int metrosCuadrados) throws AlojamientoException {
		if (metrosCuadrados < 0) {
			throw new AlojamientoException("Error");
		}
		this.metrosCuadrados = metrosCuadrados;
	}

	@Override
	public
	double calcularPrecio(int noches, Temporada temporada) {
		double pFinal;
		double pTemporada = 0;
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
		pFinal = noches * pTemporada * PRECIO_METRO * metrosCuadrados;
		return pFinal;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Casa Rural " + super.toString());
		sb.append("\nMetros cuadrados: " + metrosCuadrados);
		if (isHayPiscina())
			sb.append("\nTiene piscina");
		return sb.toString();
	}
}
