package com.iesmonroy.principal;

import java.util.Scanner;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

import com.iesmonroy.clases.ColaPedidos;
import com.iesmonroy.clases.Pedido;
import com.iesmonroy.clases.Pizza;
import com.iesmonroy.clases.Pizza.Tamanno;
import com.iesmonroy.clases.PizzaException;

public class Principal {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		ColaPedidos pedidos = new ColaPedidos();
		int o = 0;

		do {

			try {

				mostrarMenu();
				o = instertarInt();
				tratarMenu(o, pedidos);

			} catch (PizzaException e) {
				e.getMessage();
			}

		} while (o != 4);

	}

	private static int instertarInt() {
		int num = Integer.parseInt(teclado.nextLine());
		return num;
	}

	private static String instertarString() {
		String texto = teclado.nextLine();
		return texto;
	}

	public static void mostrarMenu() {
		System.out.println("MENU");
		System.out.println("1. Nuevo pedido");
		System.out.println("2. Atender pedido");
		System.out.println("3. Mostrar el número de pedidos pendientes");
		System.out.println("4. Salir");
	}

	public static void tratarMenu(int o, ColaPedidos pedidos) throws PizzaException {
		switch (o) {
		case 1:
			
			System.out.println("Introduzca la dirección");
			Pedido pedido = new Pedido(instertarString());
			
			pedido.addPizza(crearPizza());
			
			pedidos.insertarNuevoPedido(pedido);
			
			break;

		case 2:
			System.out.println(pedidos.atenderPedido());
			break;

		case 3:
			System.out.println("El numero de pedidos restantes es: " + pedidos.numeroDePedidos());
			break;

		case 4:
			System.out.println("Fin del programa.");
			break;

		}
	}

	private static Pizza crearPizza() {
		Tamanno tamanno = selecionarTamanno();
		int tipo = selecionarTipoPizza();
		

		return null;
	}

	private static Tamanno selecionarTamanno() {

		System.out.println("Seleccione el tamañano");
		System.out.println("1-Pequeña \n2-Mediana \n3-Grande");

		int o = instertarInt();

		switch (o) {
		case 1:
			return Tamanno.PEQUENNA;
		case 2:
			return Tamanno.MEDIANA;
		case 3:
			return Tamanno.GRANDE;
		default:
			System.out.println("Tiene que seleccionar el tamaño");
			return selecionarTamanno();

		}
	}

	private static int selecionarTipoPizza() {
		int o;
		
		System.out.println("Seleccione el tipo de pizza");
		System.out.println("1-Pizzas Elaboradas \n2-Pizas por Ingredientes");

		do {
			o = instertarInt();
			System.out.println("Tiene que seleccionar el tamaño");
		} while (o < 1 && o > 2);

		return (o);

	}

}
