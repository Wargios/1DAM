package org.iesmonroy.clases;

public class FurgonetaDeCarga extends Vehiculo{
	private int pesoMaximoAutorizado;

	public FurgonetaDeCarga(String matricula, String Gama, String combustible, int pesoMaximoAutorizado) {
		super(matricula, Gama, combustible);
		this.pesoMaximoAutorizado = pesoMaximoAutorizado;
	}

}
