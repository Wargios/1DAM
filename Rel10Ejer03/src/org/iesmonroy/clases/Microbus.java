package org.iesmonroy.clases;

public class Microbus extends Vehiculo {
	private int plazas;

	public Microbus(String matricula, TipoGama gama, String combustible, int plazas) {
		super(matricula, gama);
		this.plazas = plazas;
	}
	
	private double precio(){
		double precio = precioGama()+plazas*5;
		
		return precio;
	}
}
