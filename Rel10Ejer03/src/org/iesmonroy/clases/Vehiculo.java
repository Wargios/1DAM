package org.iesmonroy.clases;

public abstract class Vehiculo {
	private static final int GAMAALTA = 50;
	private static final int GAMAMEDIA = 40;
	private static final int GAMABAJA = 30;
	private String matricula;
	private TipoGama gama;

	public Vehiculo(String matricula, TipoGama gama) {
		this.matricula = matricula;
		this.gama = gama;
	}

	protected double precioGama() {
		double precio = 0;
		switch (this.gama) {
		
		case ALTA:
			precio = GAMAALTA;
			break;
			
		case MEDIA:
			precio = GAMAMEDIA;
			break;
			
		case BAJA:
			precio = GAMABAJA;
			break;
		}

		return precio;

	}

}
