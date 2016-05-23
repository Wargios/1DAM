package com.iesmonroy.clases;

public class PizzaElaborada extends Pizza {
	private static final int MIN_PIZZA = 1;
	private static final int MAX_PIZZA = 20;
	int numPizza;

	public PizzaElaborada(Tamanno tamanno, int num) throws PizzaException {
		super(tamanno);
		setNumPizza(num);

	}

	public int getNumPizza() {
		return numPizza;
	}

	@Override
	public String toString() {
		return "Pizza Elaborada [Tamanno=" + getTamanno() + " NumPizza=" + numPizza + "]";
	}

	public void setNumPizza(int numPizza) throws PizzaException {
		if (numPizza >= MIN_PIZZA && numPizza <= MAX_PIZZA)
			this.numPizza = numPizza;
		else
			throw new PizzaException("Tiene que estar comprendido entre " + MIN_PIZZA + " y " + MAX_PIZZA);

	}
}