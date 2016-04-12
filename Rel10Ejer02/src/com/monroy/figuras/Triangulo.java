package com.monroy.figuras;
public class Triangulo extends Figura{
    private double base, altura;
    
    public Triangulo(int x, int y, double base, double altura) throws FiguraException{
        super(x,y);
        setBase(base);
        setAltura(altura);
    }
    public double area(){
        return base*altura/2;
    }
	public double getBase() {
		return base;
	}
	public void setBase(double base) throws FiguraException {
		if (base < 0)
			throw new FiguraException("Error, base negativa");
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) throws FiguraException {
		if (altura < 0)
			throw new FiguraException("Error, altura negativa");
		this.altura = altura;
	}
	@Override
	public String toString() {
		return super.toString() +  " Triangulo [base=" + base + ", altura=" + altura + "]";
	}
    
    
}










