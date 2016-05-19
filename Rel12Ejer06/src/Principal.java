import java.util.Scanner;

public class Principal {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		Club clubSocios = new Club();
		int o = 0;
		do {
			try {
				mostrarMenu();
				System.out.println("Introduce una opcion");

				o = Integer.parseInt(teclado.nextLine());

				tratarMenu(o, clubSocios);
			} catch (Exception e) {
				System.out.println("Error");
			}
		} while (o != 6);

	}

	private static void tratarMenu(int o, Club clubSocios) {
		switch (o) {
		case 1:
			Socio s = new Socio(introducirDni(), introducirNombre(), introducirTelefono());
			clubSocios.altaSocio(s);
			break;

		case 2:
			if (clubSocios.bajaSocio(introducirDni())) {
				System.out.println("Socio borrado.");
			} else {
				System.out.println("Socio no encontrado.");
			}
			;

			break;

		case 3:
			if (clubSocios.modificarSocio(introducirDni(), introducirNombre(), introducirTelefono())) {
				System.out.println("Socio modificado correctamente");
			} else {
				System.out.println("socio no encontrado");
			}
			break;

		case 4:
			System.out.println(clubSocios.consultarSocio(introducirDni()));
			break;

		case 5:
			int op = 0;
			do {
				try {
					mostrarSubMenu();
					System.out.println("Introduce una opcion");

					op = Integer.parseInt(teclado.nextLine());

					tratarSubMenu(op, clubSocios);
				} catch (Exception e) {
					System.out.println("Error");
				}
			} while (op != 4);
			break;

		case 6:
			System.out.println("Hasta luego");
			break;

		}
	}

	private static void tratarSubMenu(int op, Club clubSocios) {
		switch (op) {
		case 1:
			Socio s = new Socio(introducirDni(), introducirNombre(), introducirTelefono());
			clubSocios.altaSocio(s);
			break;

		case 2:
			if (clubSocios.bajaSocio(introducirDni())) {
				System.out.println("Socio borrado.");
			} else {
				System.out.println("Socio no encontrado.");
			}
			;

			break;

		case 3:
			if (clubSocios.modificarSocio(introducirDni(), introducirNombre(), introducirTelefono())) {
				System.out.println("Socio modificado correctamente");
			} else {
				System.out.println("socio no encontrado");
			}
			break;

		case 4:
			System.out.println(clubSocios.consultarSocio(introducirDni()));
			break;
		}

	}

	private static void mostrarSubMenu() {
		System.out.println("MENU");
		System.out.println("1. Nueva Actividad");
		System.out.println("2. Consulta de todas las actividades organizadas por un socio ordenadas por fecha");
		System.out.println("3. Consulta de todas las actividades organizadas por un socio ordenadas por nombre");
		System.out.println("4. Volver");
	}

	private static String introducirDni() {
		String dni;
		System.out.println("Introduce Dni:");
		dni = teclado.nextLine();
		return dni;
	}

	private static String introducirNombre() {
		String dni;
		System.out.println("Introduce nombre:");
		dni = teclado.nextLine();
		return dni;
	}

	private static int introducirTelefono() {
		int telefono;
		System.out.println("Introduce telefono:");
		telefono = Integer.parseInt(teclado.nextLine());
		return telefono;
	}

	private static void mostrarMenu() {
		System.out.println("MENU");
		System.out.println("1. Alta de Socio");
		System.out.println("2. Baja de Socio");
		System.out.println("3. Modificar Datos Socio");
		System.out.println("4. Consulta los datos de un socio");
		System.out.println("5. Actividades");
		System.out.println("6. Salir");
	}

}
