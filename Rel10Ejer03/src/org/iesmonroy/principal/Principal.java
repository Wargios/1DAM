package org.iesmonroy.principal;

import org.iesmonroy.clases.*;

import java.util.Scanner;

public class Principal {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayVehiculos listaVheiculos;
		
		
		

	}

	public static void tratarMenu() {
		int o;

		o = Integer.parseInt(teclado.nextLine());

		switch (o) {
		case 1:
			altaVehiculo();
			break;

		case 2:
			calculaPrecio();
			break;

		case 3:
			break;

		}

	}

	private static void altaVehiculo() {

		System.out.println("¿Qué clase de vehículo quieres dar de alta? COCHE/MICROBUS/FURGONETA");
		String o = teclado.nextLine().toUpperCase();

		switch (o) {
		
		case "COCHE":
			
			break;

		case "MICROBUS":

			break;
			
		case "FURGONETA":

			break;

		default:
			break;
		}

	}

	private static void calculaPrecio() {
		// TODO Auto-generated method stub

	}

	public static void mostrarMenu() {
		// 1. Se solicitar� el tipo de veh�culo y sus datos y lo dar� de alta.
		// 2. Cálculo de precio de alquiler: Se solicitar� la matr�cula del
		// vehículo, el n�mero de d�as que ha sido alquilado y se mostrar� el
		// precio del alquiler
		// 3. Salir
		System.out.println("1. Alta de vehículo");
		System.out.println("2. Cálculo de precio de alquiler");
		System.out.println("3. Salir");
	}

}
