import java.util.HashMap;
import java.util.Scanner;

public class Principal {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		Club clubSocios = new Club();

		mostrarMenu();
		System.out.println("Introduce una opcion");
		int o = Integer.parseInt(teclado.nextLine());
		
		
		tratarMenu(o, clubSocios);
		
	}

	private static void tratarMenu(int o, Club club) {
		Socio s = new Socio(introducirDni(), introducirNombre(), introducirTelefono()); // Falta telefono
		
		
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
	
	private static int introducirTelefono() {
		int telefono;
		System.out.println("Introduce telefono");
		telefono = Integer.parseInt(teclado.nextLine());
		return telefono;
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
