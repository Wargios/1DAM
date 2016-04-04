package org.iesmonroy.clases;

public class ArrayVehiculos {
	private static int contador = 0;
	
	private static final int TOTALVEHICULOS = 200;
	private Vehiculo[] listaVehiculos;
	
	public ArrayVehiculos() {
		listaVehiculos = new Vehiculo[TOTALVEHICULOS];
	}
	
	private void altaVehiculo(Vehiculo v){
		try {
			listaVehiculos[contador] = v;
		contador++;
		} catch (Exception e) {
			System.out.println("Error. Lista de coches llena.");
		}
		
		
	}
	
	
	
}
