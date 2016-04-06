package org.iesmonroy.principal;

import org.iesmonroy.personaje.*;

public class Principal {

	public static void main(String[] args) {

		Personaje pj[] = new Personaje[3];

		try {

			pj[0] = new Mago("A", Raza.ELFO, 10, 20, 50);

			pj[1] = new Mago("B", Raza.ORCO, 5, 19, 40);

			pj[2] = new Clerigo("C", Raza.ENANO, 20, 16, 100, "Mono Pelusa");

		} catch (PersonajeException e) {
			e.getMessage();
		}

		for (int i = 0; i < pj.length; i++) {
			System.out.println(pj[i]);

		}
		System.out.println();

		if (pj[0] instanceof Mago) {
			Mago magoA = (Mago) pj[0];

			magoA.aprenderHechizo("Lanza de alma");
			magoA.aprenderHechizo("Inmolación");

		}

		if (pj[1] instanceof Mago) {
			Mago magoB = (Mago) pj[1];

			magoB.aprenderHechizo("Flecha alma");

		}

		System.out.println(pj[0]);
		System.out.println(pj[1]);
		System.out.println();

		if (pj[0] instanceof Mago) {
			Mago magoA = (Mago) pj[0];

			try {
				magoA.lanzaHechizo(pj[1], "Inmolación");
			} catch (PersonajeException e) {
				e.getMessage();
			}
		}

		if (pj[1] instanceof Mago) {
			Mago magoB = (Mago) pj[1];
			try {
				magoB.lanzaHechizo(pj[0], "Flecha alma");
			} catch (PersonajeException e) {
				e.getMessage();
			}
		}

		if (pj[2] instanceof Clerigo) {
			Clerigo clerigoC = (Clerigo) pj[2];
			clerigoC.curar(pj[1]);

		}

		if (pj[0] instanceof Mago) {
			Mago magoA = (Mago) pj[0];
			try {
				magoA.lanzaHechizo(pj[1], "Lanza de alma");
			} catch (PersonajeException e) {
				e.getMessage();
			}
		}

		for (int i = 0; i < pj.length; i++) {
			System.out.println(pj[i]);
		}
		System.out.println();

	}

}
