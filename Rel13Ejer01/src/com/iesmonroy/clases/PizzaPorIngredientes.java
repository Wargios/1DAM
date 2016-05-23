package com.iesmonroy.clases;
import java.util.HashSet;

public class PizzaPorIngredientes extends Pizza {
	private HashSet<Ingrediente> ingredientes;

	public PizzaPorIngredientes(Tamanno tamanno) {
		super(tamanno);
		ingredientes = new HashSet<Ingrediente>();

	}

	/**
	 * Añade ingredientes al hashset de ingredientes
	 * 
	 * @param ingrediente
	 * @return Devuelve true si lo consigue introducir y false si ya se
	 *         encuentra
	 */
	public boolean addIngrediente(Ingrediente ingrediente) {
		boolean resul = false;
		if (!ingredientes.contains(ingrediente)) {
			ingredientes.add(ingrediente);
			resul = true;
		}

		return resul;
	}

	@Override
	public String toString() {
		StringBuilder cadena = new StringBuilder();
		cadena.append("Pizza Elaborada [Tamanno=" + getTamanno());
		cadena.append("Ingredientes= ");
		
		for (Ingrediente i : ingredientes)
			cadena.append(i + " ");

		cadena.append("]");
		return cadena.toString();
	}

}
