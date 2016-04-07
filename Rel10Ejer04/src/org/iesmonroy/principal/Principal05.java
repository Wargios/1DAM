package org.iesmonroy.principal;

import java.util.Scanner;

import org.iesmonroy.personaje.ArrayPersonajes;
import org.iesmonroy.personaje.Clerigo;
import org.iesmonroy.personaje.Mago;
import org.iesmonroy.personaje.Personaje;
import org.iesmonroy.personaje.PersonajeException;
import org.iesmonroy.personaje.Raza;

public class Principal05 {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int o;
		ArrayPersonajes vPersonaje = new ArrayPersonajes();

		do {

			mostrarMenu();

			o = Integer.parseInt(teclado.nextLine());

			try {
				tratarMenu(o, vPersonaje);

			} catch (PersonajeException e) {
				System.out.println(e.getMessage());

			} catch (Exception e) {
				System.out.println("Error interno");
			}

		} while (o != 7);

	}

	private static void tratarMenu(int opcion, ArrayPersonajes vPersonaje) throws PersonajeException {
		switch (opcion) {
		case 1:
			vPersonaje.altaPersonaje(crearPersonaje());
			break;
		case 2:
			System.out.println("Inserta su nombre para buscarlo");
			String nombre = teclado.nextLine();
			System.out.println("Inserta el nombre de la magia");
			String magia = teclado.nextLine();
			vPersonaje.aprenderMagia(nombre, magia);
			
			break;
		case 3:

			break;
		case 4:

			break;
		case 5:
			System.out.println(vPersonaje.toString());
			break;
		case 6:

			break;
		case 7:

			break;
			

		}
	}

	private static Personaje crearPersonaje() throws PersonajeException {
		Personaje p = null;

		char c;

		System.out.println("¿Clerigo o mago? M/C");
		c = teclado.nextLine().toUpperCase().charAt(0);

		switch (c) {
		case 'C':
			p = crearClerigo();
			break;

		case 'M':
			p = crearMago();
			break;

		default:
			throw new PersonajeException("Debe ser mago o clerigo");
		}

		return p;
	}

	private static Personaje crearMago() throws PersonajeException {

		Mago mago = new Mago(solicitarNombre(), solicitarRaza(), solicitarFuerza(), solicitarInteligencia(),
				solicitarVidaMaxima());

		return mago;
	}

	private static Personaje crearClerigo() throws PersonajeException {

		Clerigo clerigo = new Clerigo(solicitarNombre(), solicitarRaza(), solicitarFuerza(), solicitarInteligencia(),
				solicitarVidaMaxima(), solicitarDios());

		return clerigo;
	}

	private static void mostrarMenu() {
		System.out.println("\n--MENÚ--");
		System.out.println("1. Alta de personaje");
		System.out.println("2. Mago aprende hechizo");
		System.out.println("3. Mago lanza hechizo");
		System.out.println("4. Clérigo cura al mago");
		System.out.println("5. Mostrar el listado de personajes");
		System.out.println("6. Mostrar el listado de personajes ordenados por puntos actuales de mayor a menor");
		System.out.println("7. Salir");

	}

	private static int solicitarInteligencia() {
		System.out.println("Introduce la inteligencia [1-20]");
		return solicitarInt();

	}

	private static int solicitarFuerza() {
		System.out.println("Introduce la fuerza [1-20]");
		return solicitarInt();
	}

	private static int solicitarInt() {
		return Integer.parseInt(teclado.nextLine());
	}

	private static Raza solicitarRaza() throws PersonajeException {
		System.out.println("Introduce una raza [HUMANO, ENANO, ELFO, ORCO");
		String cadenaRaza = teclado.nextLine().toUpperCase();
		Raza raza;
		switch (cadenaRaza) {
		case "HUMANO":
			raza = Raza.HUMANO;
			break;

		case "ORCO":
			raza = Raza.ORCO;
			break;

		case "ELFO":
			raza = Raza.ELFO;
			break;

		case "ENANO":
			raza = Raza.ENANO;
			break;

		default:
			throw new PersonajeException("Raza incorrecta");
		}
		return raza;

	}

	private static String solicitarNombre() {
		System.out.println("Introduce nombre");
		return teclado.nextLine();
	}

	private static int solicitarVidaMaxima() {
		System.out.println("Introduce la vida total");
		return solicitarInt();
	}

	private static String solicitarDios() {
		System.out.println("Introduce su dios");
		return teclado.nextLine();
	}

}
