
public class Fecha implements Comparable<Fecha> {

	private int dia;
	private int mes;
	private int anno;

	public Fecha(int dia, int mes, int anno) throws HistorialException {

		setDia(dia);
		setMes(mes);
		setAnno(anno);
	}

	public void setAnno(int anno) throws HistorialException {
		if (anno < 0)
			throw new HistorialException("Error");

		this.anno = anno;
	}

	public void setDia(int dia) throws HistorialException {
		if (dia < 0 || dia > 30)
			throw new HistorialException("Error");

		this.dia = dia;
	}

	public void setMes(int mes) throws HistorialException {
		if (mes < 1 || mes > 12)
			throw new HistorialException("Error");

		this.mes = mes;
	}

	public int getAnno() {
		return anno;
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public boolean esMayorOIgual(Fecha otro) {
		boolean resul = false;
		if (anno >= otro.anno)
			if (mes >= otro.mes) {
				if (dia >= otro.dia) {
					resul = true;
				}
			}

		return resul;
	}

	/**
	 * -1 = es menor
	 *  0 = es igual
	 *  1 = es mayor
	 */
	@Override
	public int compareTo(Fecha otro) {
		int resul = -1;

		if (anno <= otro.anno) {
			if (mes <= otro.mes) {
				if (dia <= otro.dia) {
					if (anno == otro.anno && mes == otro.mes && dia == otro.dia) {
						resul = 0;
					} else {
						resul = -1;
					}
				}

			}
		}else {
			resul = 1;
		}

		return resul;
	}

}
