package principal;

import java.util.Scanner;

import clases.*;
import clases.Alojamiento.Temporada;

public class Principal {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// P1
		Alojamiento[] vAlojamientos = new Alojamiento[3];

		try {
			crearAlojamientos(vAlojamientos);

		} catch (AlojamientoException e) {
			System.out.println(e.getMessage());
		}
		// P2
		mostrarAlojamientos(vAlojamientos);
		// P3
		int pos = buscarAlojamiento(vAlojamientos);

		if (pos >= 0)
			try {
				vAlojamientos[pos].darNota(8);
				vAlojamientos[pos].darNota(9);
				vAlojamientos[pos].darNota(9);
			} catch (AlojamientoException e) {
				System.out.println(e.getMessage());
			}

		// P4

		pos = buscarAlojamiento(vAlojamientos);

		double precio;
		if (pos >= 0) {
			precio = vAlojamientos[pos].calcularPrecio(5, Temporada.ALTA);
			System.out.println("El precio por 5 noches en temporada alta es "+ precio);
		}
		// P5
		pos = buscarAlojamiento(vAlojamientos);

		if (pos >= 0)
			vAlojamientos[pos] = null;

		// P6
		mostrarAlojamientos(vAlojamientos);

	}

	private static int buscarAlojamiento(Alojamiento[] vAlojamientos) {
		System.out.println("\nIntroduzca el nombre del alojamiento");
		String nombre = teclado.nextLine().toUpperCase();
		int pos = -1;
		for (int i = 0; i < vAlojamientos.length; i++) {
			if (vAlojamientos[i].getNombre().toUpperCase().equals(nombre)) {
				pos = i;
			}
		}

		if (pos == -1)
			System.out.println("No se encontró el alojamiento " + nombre);

		return pos;
	}

	private static void mostrarAlojamientos(Alojamiento[] vAlojamientos) {
		System.out.println("Alojamientos:");
		for (int i = 0; i < vAlojamientos.length; i++) {
			System.out.println("\n" + vAlojamientos[i]);
		}
	}

	private static void crearAlojamientos(Alojamiento[] vAlojamientos) throws AlojamientoException {
		vAlojamientos[0] = new Hotel("Hotel1", "direccion1", 4, 20);
		vAlojamientos[1] = new CasaRural("CRural1", "direccion2", true, 240);
		vAlojamientos[2] = new CasaRural("CRural2", "direccion3", false, 150);
	}

}
