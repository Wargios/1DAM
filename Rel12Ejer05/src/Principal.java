import java.util.HashMap;
import java.util.Scanner;

public class Principal {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		HashMap<String, Socio> mapaSocios = new HashMap<String, Socio>();

		mostrarMenu();
		int o = Integer.parseInt(teclado.nextLine());
		
		Socio s = new Socio(introducirDni(), introducirNombre(), 1); // Falta telefono
		
		mapaSocios.put(s.getDni(), s);

	}

	private static String introducirDni() {
		String dni;
		System.out.println("Introduce dni");
		dni = teclado.nextLine();
		return dni;
	}
	private static String introducirNombre() {
		String dni;
		System.out.println("Introduce nombre");
		dni = teclado.nextLine();
		return dni;
	}
	

	private static void mostrarMenu() {
		System.out.println("MENU");
		System.out.println("1. Alta de Socio");
		System.out.println("2. Baja de Socio");
		System.out.println("3. Modificar Datos Socio");
		System.out.println("4. Consulta los datos de un socio");
		System.out.println("5. Salir");
	}

}
