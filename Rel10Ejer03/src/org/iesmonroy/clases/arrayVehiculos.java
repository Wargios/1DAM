package org.iesmonroy.clases;

public class arrayVehiculos {
	private static int contador = 0;
	
	private static final int TOTALVEHICULOS = 200;
	private Vehiculo[] listaVehiculos;
	
	public arrayVehiculos() {
		listaVehiculos = new Vehiculo[TOTALVEHICULOS];
	}
	
	private void altaVehiculo(Vehiculo v){
		listaVehiculos[contador] = v;
		contador++;
		
	}
	
	
	
}
