package org.iesmonroy.personaje;

public class Mago extends Personaje {
	private static final int INTMIN = 17;
	private static final int FUEMAX = 15;
	private static final int RANURASHECHIZO = 4;
	private static final int DAÑOHECHIZO = 10;

	private String[] hechizo;

	public Mago(String nombre, Raza raza, int fuerza, int inteligencia, int vidaMax) throws PersonajeException {
		super(nombre, raza, fuerza, inteligencia, vidaMax);
		hechizo = new String[RANURASHECHIZO];
		setFuerza(fuerza);
		setInteligencia(inteligencia);

	}

	public void setInteligencia(int inteligencia) throws PersonajeException {
		if (inteligencia < INTMIN) {
			throw new PersonajeException("Con esa INTELLIGENCIA no puedes ser mago.");
		}

		super.setInteligencia(inteligencia);
	}

	public void setFuerza(int fuerza) throws PersonajeException {
		if (fuerza > FUEMAX) {
			throw new PersonajeException("Con esa FUERZA no puedes ser mago.");
		}
		super.setFuerza(fuerza);
	}

	public void aprenderHechizo(String nombreHechizo) {
		int i = 0;
		boolean hechizoAprendido = false;

		do {
			if (hechizo[i] == null) {
				hechizo[i] = nombreHechizo;
				hechizoAprendido = true;
			}
			i++;

		} while (i <= this.hechizo.length && !hechizoAprendido);

	}

	public void lanzaHechizo(Personaje personajeObjetivo, String nombreHechizo) throws PersonajeException {

		compruebaHechizo(nombreHechizo);

		personajeObjetivo.setPuntosVidaAct(personajeObjetivo.getPuntosVidaAct() - DAÑOHECHIZO);
	}

	public boolean compruebaHechizo(String nombreHechizo) throws PersonajeException {
		boolean resul = false;
		int i = 0;
		
		do {
			if (hechizo[i].equals(nombreHechizo)) {
				hechizo[i] = null;
				resul = true;
			}

		} while (!resul && i <= hechizo.length);
			if (!resul) {
				throw new PersonajeException("Hechizo no aprendido");
			}
		return resul;
	}
}
