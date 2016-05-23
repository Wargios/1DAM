package com.iesmonroy.clases;

public abstract class Pizza {
	private Tamanno tamanno;

	public enum Tamanno {
		PEQUENNA, MEDIANA, GRANDE
	};

	public Pizza(Tamanno tamanno) {
		this.tamanno= tamanno;
	}
	
	public Tamanno getTamanno() {
		return tamanno;
	}

	
}
