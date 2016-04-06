package org.iesmonroy.personaje;

public class Clerigo extends Personaje {
	private static final int FUEMIN = 18;
	private static final int INTMIN = 12;
	private static final int INTMAX = 16;
	private static final int PVCURA = 10;

	private String dios;

	public Clerigo(String nombre, Raza raza, int fuerza, int inteligencia, int vidaMax, String dios)
			throws PersonajeException {
		super(nombre, raza, fuerza, inteligencia, vidaMax);

		this.dios = dios;

	}

	public void setFuerza(int fuerza) throws PersonajeException {
		if (fuerza < FUEMIN) {
			throw new PersonajeException("Con esa fuerza no puedes ser clerigo.");
		}

		super.setFuerza(fuerza);
	}

	public void setInteligencia(int inteligencia) throws PersonajeException {
		if (inteligencia < INTMIN || inteligencia > INTMAX) {
			throw new PersonajeException("Con esa INTELLIGENCIA no puedes ser clerigo.");
		}

		super.setInteligencia(inteligencia);
	}

	public void curar(Personaje pj) {
		int vida = pj.getPuntosVidaAct() + PVCURA;
		if (vida > pj.getPuntosVidaMax()) {
			pj.setPuntosVidaAct(pj.getPuntosVidaMax());
		} else {
			pj.setPuntosVidaAct(vida);
		}

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\n DIOS: " + dios;
	}

}
