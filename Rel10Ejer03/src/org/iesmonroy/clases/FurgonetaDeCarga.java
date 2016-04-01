package org.iesmonroy.clases;

public class FurgonetaDeCarga extends Vehiculo{
	private int pMA;

	public FurgonetaDeCarga(String matricula, TipoGama gama, int pesoMaximoAutorizado) {
		super(matricula, gama);
		this.pMA = pesoMaximoAutorizado;
	}
	private double precio(){
		double precio = precioGama()+20*pMA;
		
		return precio;
	}

}
