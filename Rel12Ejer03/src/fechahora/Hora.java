
public class Hora {
	private int horas;
	private int minutos;

	public Hora(int horas, int minutos) throws HistorialException {
		setHoras(horas);
		setMinutos(minutos);
	}

	public void setHoras(int horas) throws HistorialException {
		if (horas < 0 || horas > 23)
			throw new HistorialException("Error");
		this.horas = horas;
	}

	public void setMinutos(int minutos) throws HistorialException {
		if (minutos < 0 || minutos > 59)
			throw new HistorialException("Error");
		this.minutos = minutos;
	}

	public int getHoras() {
		return horas;
	}

	public int getMinutos() {
		return minutos;
	}

	public boolean esMayor(Hora otro) {
		boolean resul = false;

		if (horas * 60 + minutos > otro.horas * 60 + otro.minutos)
			resul = true;

		return resul;
	}
	
	public boolean equals(Hora otro) {
		boolean resul = false;
		if (minutos == otro.minutos && horas == otro.horas) {
			resul = true;
		}
		return resul;
	}
}