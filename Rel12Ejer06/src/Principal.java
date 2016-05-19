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
		} while (o != 5);

	}

	private static void tratarMenu(int o, Club club) {
		switch (o) {
		case 1:
			Socio s = new Socio(introducirDni(), introducirNombre(), introducirTelefono());
			club.altaSocio(s);
			break;

		case 2:
			if (club.bajaSocio(introducirDni())) {
				System.out.println("Socio borrado.");
			} else {
				System.out.println("Socio no encontrado.");
			}
			;

			break;

		case 3:
			if (club.modificarSocio(introducirDni(), introducirNombre(), introducirTelefono())) {
				System.out.println("Socio modificado correctamente");
			}else {
				System.out.println("socio no encontrado");
			}
			break;

		case 4:
			System.out.println(club.consultarSocio(introducirDni()));
			break;

		case 5:
			System.out.println("Hasta luego");
			break;

		}
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
