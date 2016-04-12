package com.monroy.figuras;

//Clase Circulo
public class Circulo extends Figura {
	private double radio;

	public Circulo(int x, int y, double radio) throws FiguraException {
		super(x, y);
		setRadio(radio);
	}

	public double area() {
		return Math.PI * radio * radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) throws FiguraException {
		if ( radio < 0)
			throw new FiguraException("No se puede crear figura con radio negativo");
		this.radio = radio;
	}

	@Override
	public String toString() {
		return super.toString() +  " Circulo [radio=" + radio + "]" ;
	}
	
	public void girar(){
		System.out.println("Se ha girado");
	}
	
	
}