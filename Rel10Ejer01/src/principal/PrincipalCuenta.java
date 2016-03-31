package principal;
import java.util.*;

import modelo.Cuenta;
import modelo.CuentaException;


public class PrincipalCuenta {

	/**
	 * @param args
	 */
	private static Scanner teclado=new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta cuenta=new Cuenta();
		int cantidad;
		try
		{
		System.out.println("Su cuenta: " + cuenta);
		System.out.println("Introduzca cantidad para ingresar");
		cantidad=Integer.parseInt(teclado.nextLine());
		cuenta.ingresarDinero(cantidad);
		System.out.println("Su cuenta ahora: "+cuenta);
		System.out.println("Introduzca cantidad para sacar");
		cantidad=Integer.parseInt(teclado.nextLine());
		cuenta.sacarDinero(cantidad);
		System.out.println("Su cuenta despues de sacar "+cantidad+ " euros:" + cuenta);
		}catch (CuentaException x){
			System.out.println(x.getMessage());
		}
	}

}
