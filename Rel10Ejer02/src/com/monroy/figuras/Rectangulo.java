package com.monroy.figuras;
public class Rectangulo extends Figura {
	private double ancho, alto;

	public Rectangulo(int x, int y, double ancho, double alto) throws FiguraException {
		super(x, y);
		setAncho(ancho);
		setAlto(alto);
	}
	
	public double area() {
		return ancho * alto;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) throws FiguraException {
		if (ancho < 0)
			throw new FiguraException("Error, ancho negativo");
		this.ancho = ancho;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) throws FiguraException {
		if (alto < 0)
			throw new FiguraException("Error, alto negativo");
		this.alto = alto;
	}

	@Override
	public String toString() {
		return super.toString() +  " Rectangulo [ancho=" + ancho + ", alto=" + alto + "]" ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}