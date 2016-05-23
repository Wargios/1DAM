package com.iesmonroy.clases;
import java.util.ArrayList;

public class Pedido {
	private String direccionCliente;
	private ArrayList<Pizza> pizzas;
	
	public Pedido(String direccion) {
		direccionCliente = direccion;
		pizzas = new ArrayList<Pizza>();
	}
	
	public String getDireccionCliente() {
		return direccionCliente;
	}
	
	public void addPizza(Pizza pizza){
		pizzas.add(pizza);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Pizza p : pizzas) {
			sb.append(p.toString()+" ");
		}
		return "Pedido [direccionCliente=" + direccionCliente + ", pizzas= " + sb + "]";
	}
	
	
}
