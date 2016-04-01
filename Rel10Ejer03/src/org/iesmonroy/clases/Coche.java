package org.iesmonroy.clases;

public class Coche extends Vehiculo {
	private static final double PGASOLINA = 3.5;
	private static final double PDIESEL = 2;
	private TipoCombustible combustible;

	private enum TipoCombustible {
		GASOLINA, DIESEL
	};

	public Coche(String matricula, TipoGama gama, TipoCombustible combustible) {
		super(matricula, gama);
		this.combustible = combustible;

	}

	private double precio() {
		double precio = 0;
		double precioGas = 0;
		
		switch (combustible) {
		case GASOLINA:
			precioGas = PGASOLINA;
			break;
		case DIESEL:
			precioGas = PDIESEL;
			break;

		default:
			break;
		}
		precio = precioGas + precioGama();

		return precio;

	}
}
