package com.iesmonroy.clases;

import java.util.LinkedList;

public class ColaPedidos {
	private LinkedList<Pedido> pedidos;

	public ColaPedidos() {
		pedidos = new LinkedList<Pedido>();
	}

	public void insertarNuevoPedido(Pedido nuevo) {
		pedidos.add(nuevo);
	}

	public Pedido atenderPedido() throws PizzaException {
		Pedido pedido = pedidos.removeFirst();
		if (pedido == null)
			throw new PizzaException("No hay más pedidos");
		return pedido;
	}

	public int numeroDePedidos() {
		return pedidos.size();
	}

}
