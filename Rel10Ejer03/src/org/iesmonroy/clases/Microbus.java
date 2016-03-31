package org.iesmonroy.clases;

public class Microbus extends Vehiculo {
	private int plazas;

	public Microbus(String matricula, String Gama, String combustible, int plazas) {
		super(matricula, Gama, combustible);
		this.plazas = plazas;
	}
}
