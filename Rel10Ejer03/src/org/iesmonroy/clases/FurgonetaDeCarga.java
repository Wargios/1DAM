package org.iesmonroy.clases;

public class FurgonetaDeCarga extends Vehiculo {
	private static final int BASE = 20;
	private int pMA;

	public FurgonetaDeCarga(String matricula, TipoGama gama, int pesoMaximoAutorizado) {
		super(matricula, gama);
		this.pMA = pesoMaximoAutorizado;
	}

	private double precio() {
		double precio = precioGama() + BASE * pMA;

		return precio;
	}

}
