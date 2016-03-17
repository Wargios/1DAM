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

		// Segunda Parte

		CuentaCredito cuenta = new CuentaCredito();

	}

	public static void tratarMenu(int opcion, CuentaCredito cuenta) throws CuentaException {
		int cantidad;
		if (opcion < 1 || opcion < 4)
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

}
