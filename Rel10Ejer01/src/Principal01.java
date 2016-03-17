import java.util.Scanner;

/**
 * @author Wargios
 * @since 16/03/2016
 */

public class Principal01 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			@SuppressWarnings("unused") // El ejercicio no me da más detalles de
										// esta clase
			ProbandoCuenta prueba = new ProbandoCuenta();
		} catch (CuentaException e) {
			e.getMessage();
		}
		System.out.println();

		// Segunda Parte "MenuCuentaCredito"

		boolean hayError = false;
		int opcion = 0;
		CuentaCredito cuenta = null;
		do {
			System.out.println("Crea una cuenta con saldo y credito");
			System.out.println("Introduce el saldo");
			int saldo = solicitarInt();
			System.out.println("Introduzca el credito que desee no superior a 300€");
			int credito = solicitarInt();

			try {
				cuenta = new CuentaCredito(saldo, credito);
				hayError = false;
			} catch (CuentaException e) {
				System.out.println(e.getMessage());
				hayError = true;
				System.out.println("ERROR, vuelta a empezar\n");
			}
		} while (hayError);

		do {
			try {
				mostrarMenu();

				opcion = solicitarInt();
				tratarMenu(opcion, cuenta);

			} catch (CuentaException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		} while (opcion != 4);
	}

	public static void tratarMenu(int opcion, CuentaCredito cuenta) throws CuentaException {
		int cantidad;
		if (opcion < 1 || opcion > 4)
			throw new CuentaException("Opción no válida");

		switch (opcion) {
		case 1:
			System.out.println("Introduce una cantidad a ingresar");
			cantidad = solicitarInt();
			cuenta.ingresarCantidad(cantidad);
			break;

		case 2:
			System.out.println("Introduce una cantidad a retirar");
			cantidad = solicitarInt();
			cuenta.retirarCantidad(cantidad);
			break;

		case 3:
			System.out.println(cuenta.toString());
			break;

		case 4:
			System.out.println("Gracias por su visita.");
			break;

		}
	}

	private static int solicitarInt() {
		int num = Integer.parseInt(teclado.nextLine());
		return num;
	}

	public static void mostrarMenu() {
		System.out.println("\nSeleccione una opción");
		System.out.println("1. Ingresar dinero");
		System.out.println("2. Sacar dinero ");
		System.out.println("3. Mostrar saldo y credito");
		System.out.println("4. Salir");

	}

}
