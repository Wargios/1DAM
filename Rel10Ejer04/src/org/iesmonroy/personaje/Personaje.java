package org.iesmonroy.personaje;

public abstract class Personaje {
	/*
	 * o fuerza: un entero entre 0 y 20 o inteligencia: un entero entre 0 y 20 o
	 * puntos de vida máximos: un entero entre 0 y 100 o puntos de vida
	 * actuales: un entero entre 0 y puntos de vida máximos
	 */
	private static final int FUEMIN = 0;
	private static final int FUEMAX = 20;
	private static final int INTMIN = 0;
	private static final int INTMAX = 20;
	private static final int PVMIN = 0;
	private static final int PVMAX = 100;

	private String nombre;
	private Raza raza;
	private int fuerza;
	private int inteligencia;
	private int puntosVidaMax;
	private int puntosVidaAct;

	public Personaje(String nombre, Raza raza, int fuerza, int inteligencia, int vidaMax) throws PersonajeException {
		setNombre(nombre);
		setRaza(raza);
		setFuerza(fuerza);
		setInteligencia(inteligencia);
		setPuntosVidaMax(vidaMax);
		puntosVidaAct = vidaMax;

	}

	// gets

	public int getFuerza() {
		return fuerza;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public String getNombre() {
		return nombre;
	}

	public int getPuntosVidaAct() {
		return puntosVidaAct;
	}

	public int getPuntosVidaMax() {
		return puntosVidaMax;
	}

	public Raza getRaza() {
		return raza;
	}

	// sets

	public void setFuerza(int fuerza) throws PersonajeException {
		if (fuerza < FUEMIN || fuerza > FUEMAX) {
			throw new PersonajeException("Tiene que valer entre 0 y 20");
		}
		this.fuerza = fuerza;
	}

	public void setInteligencia(int inteligencia) throws PersonajeException {
		if (inteligencia < INTMIN || inteligencia > INTMAX) {
			throw new PersonajeException("Tiene que valer entre 0 y 20");
		}
		this.inteligencia = inteligencia;
	}

	public void setPuntosVidaMax(int puntosVidaMax) throws PersonajeException {
		if (puntosVidaMax < PVMIN || puntosVidaMax > PVMAX) {
			throw new PersonajeException("Tiene que valer entre " + PVMIN + " y " + PVMAX);
		}
		this.puntosVidaMax = puntosVidaMax;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPuntosVidaAct(int puntosVidaAct) {
		this.puntosVidaAct = puntosVidaAct;
	}

	public void setRaza(Raza raza) {
		this.raza = raza;
	}

	public boolean equals(Personaje p) {
		boolean resul = false;
		if (this.nombre == p.nombre) {
			resul = true;
		}
		return resul;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("NOMBRE=" + nombre + " RAZA=" + raza + " FUE=" + fuerza + " INT=" + inteligencia + " PV="
				+ puntosVidaAct + "/" + puntosVidaMax);

		return sb.toString();
	}

}
