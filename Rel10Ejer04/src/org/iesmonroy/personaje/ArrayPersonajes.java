package org.iesmonroy.personaje;

public class ArrayPersonajes {
	private static final int PERSONAJESMAX = 100;
	private Personaje[] vPersonaje;

	public ArrayPersonajes() {
		vPersonaje = new Personaje[PERSONAJESMAX];
	}

	public void altaPersonaje(Personaje p) throws PersonajeException {
		int i = 0;
		boolean hueco = false;
		estaRepetido(p);

		do {
			if (vPersonaje[i] == null) {
				vPersonaje[i] = p;
				hueco = true;
			}
			i++;
		} while (i < vPersonaje.length && !hueco);
		if (!hueco)
			throw new PersonajeException("No hay hueco en la lista de personajes");

	}

	private void estaRepetido(Personaje p) throws PersonajeException {
		int i = 0;

		do {
			if (vPersonaje[i] != null) {
				if (vPersonaje[i].equals(p)) {
					throw new PersonajeException("Un personaje con este nombre ya ha sido creado anteriormente");
				}
			}

			i++;
		} while (i < vPersonaje.length);

	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < vPersonaje.length; i++) {
			if (vPersonaje[i] != null) {
				sb.append(this.vPersonaje[i] + "\n");
			}
		}
		return sb.toString();
	}
	
	public int encuentraPersonaje(String p) throws PersonajeException {
		int i = 0;
		int pos = -1;
		do {
			if (vPersonaje[i] != null) {
				if (vPersonaje[i].getNombre().toUpperCase().equals(p)) 
					pos = i;	
			}
			i++;
		} while (i < vPersonaje.length && pos < 0);
		if (pos <1)
			throw new PersonajeException("Este personaje no se encuentra en la lista");

		return pos;
	}
	
	public void aprenderMagia(String p, String hechizo) throws PersonajeException {
		int pos = encuentraPersonaje(p);
		if (vPersonaje[pos] instanceof Mago) {
			Mago m = (Mago) vPersonaje[pos];
			m.aprenderHechizo(hechizo);
		}
	}
	
	
	public Personaje getPersonaje(int i) {
		return vPersonaje[i];
	}

}
