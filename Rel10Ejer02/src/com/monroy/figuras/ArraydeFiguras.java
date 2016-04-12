package com.monroy.figuras;

import java.awt.geom.Area;
import java.text.DecimalFormat;
import java.util.Random;

// Clase  que implementa un array aleatorio de la clase Figura: Cuadrado, Circulo y Triangulo

public class ArraydeFiguras implements CreableEstadisticas {
	private static final int MAXIMO = 100;
	private static final int MAXIMO_LADO = 9;
	private Figura vfig[];

	public ArraydeFiguras(int tam) throws FiguraException {

		if (tam <= 0)
			throw new FiguraException("El tamanno del array no puede ser negativo");

		vfig = new Figura[tam];

		for (int i = 0; i < tam; i++)
			vfig[i] = figuraAleatoria();
	}

	private Figura figuraAleatoria() {
		Figura f = null;
		Random serie = new Random();
		try {
			switch (serie.nextInt(3)) {
			case 0: {
				f = new Circulo(serie.nextInt(MAXIMO), serie.nextInt(MAXIMO), serie.nextInt(MAXIMO_LADO) + 1);
				break;
			}
			case 1: {
				f = new Rectangulo(serie.nextInt(MAXIMO), serie.nextInt(MAXIMO), serie.nextInt(MAXIMO_LADO) + 1,
						serie.nextInt(9) + 1);
				break;
			}
			case 2: {
				f = new Triangulo(serie.nextInt(MAXIMO), serie.nextInt(MAXIMO), serie.nextInt(MAXIMO_LADO) + 1,
						serie.nextInt(9) + 1);
				break;
			}

			}
		} catch (FiguraException e) {
			System.out.println("Este error no va a darse nunca");
		}
		return f;
	}

	public Figura figuraConAreaMayor() {
		Figura fmayor = vfig[0];
		double areamayor = 0;

		for (int i = 0; i < vfig.length; i++) {
			if (vfig[i].area() > areamayor) {
				fmayor = vfig[i];
				areamayor = vfig[i].area();
			}
		}
		return fmayor;

	}

	public String toString() {
		StringBuilder sb = new StringBuilder(200);

		// para imprimir con dos decimales
		DecimalFormat df = new DecimalFormat("0.00");
		double resultadoArea;

		for (int i = 0; i < vfig.length; i++) {
			resultadoArea = vfig[i].area();
			sb.append(vfig[i].toString() + " y su area es " + df.format(resultadoArea) + "\n");
		}
		return sb.toString();
	}

	public void girarCirculos() {
		Circulo c;
		for (int i = 0; i < vfig.length; i++) {
			if (vfig[i] instanceof Circulo) {
				c = (Circulo) vfig[i];
				c.girar();

			}
		}

	}

	@Override
	public double minimo() {
		Figura fmenor = vfig[0];
		double areamenor = 0;

		for (int i = 0; i < vfig.length; i++) {
			if (vfig[i].area() < areamenor) {
				fmenor = vfig[i];
				areamenor = vfig[i].area();
			}
		}
		return fmenor.area();
	}

	@Override
	public double maximo() {
		Figura fmayor = vfig[0];
		double areamayor = 0;

		for (int i = 0; i < vfig.length; i++) {
			if (vfig[i].area() > areamayor) {
				fmayor = vfig[i];
				areamayor = vfig[i].area();
			}
		}
		return fmayor.area();
	}

	@Override
	public double media() {
		double sumatotal = 0;
		for (int i = 0; i < vfig.length; i++) {
			sumatotal += vfig[i].area();
		}
		double resul = sumatotal / vfig.length;

		return resul;
	}

}
