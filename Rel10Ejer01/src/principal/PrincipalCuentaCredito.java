package principal;
import java.util.*;

import modelo.*;
public class PrincipalCuentaCredito {

	private static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		int opcion;
		
		// Se crea la cuenta con los valores por defecto aunque podr�a haberse 
		// solicitado el saldo y el cr�dito y crearse con el otro constructor
		CuentaCredito cCredito=new CuentaCredito();
		System.out.println("Cuenta creada:" + cCredito);
		
		do{
			opcion=elegirOpcion();
		
			tratarOpcion(cCredito,opcion);
		}while(opcion != 5);
	}
	private static void tratarOpcion(CuentaCredito cCredito, int opcion) {
		
		double dineroIngresar, dineroSacar, credito ;
		
		switch (opcion){
			case 1:
				try
				{
				System.out.println("Introduzca dinero a ingresar");
				dineroIngresar=Integer.parseInt(teclado.nextLine());
				cCredito.ingresarDinero(dineroIngresar);
				}catch (CuentaException e){
					System.out.println(e.getMessage());
				}
				break;
			
			case 2:
				try{
					System.out.println("Introduzca dinero a sacar");
					dineroSacar=Integer.parseInt(teclado.nextLine());
					cCredito.sacarDinero(dineroSacar);
				}catch (CuentaException e){
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				System.out.println(cCredito);
				break;
			case 4:
				try
				{
					System.out.println("Introduzca nuevo credito:");
					credito=Integer.parseInt(teclado.nextLine());
					cCredito.setCredito(credito);
				}catch (CuentaException e){
					System.out.println(e.getMessage());
				}
				break;
		
		}
		
	}
	private static int elegirOpcion() {
		int elegida;
		do{
			try{
				System.out.println();
				System.out.println("MEN� CUENTA DE CR�DITO");
				System.out.println("1.Ingresar Dinero");
				System.out.println("2.Sacar dinero");
				System.out.println("3.Mostrar saldo y cr�dito");
				System.out.println("4.Modificar credito"); // esta opci�n no la pide el programa, la a�adimos
															// para probar el setCredito
				System.out.println("5.Salir");
				System.out.println();
				System.out.println("Introduzca una opci�n");
				elegida=Integer.parseInt(teclado.nextLine());
			}catch (NumberFormatException x){
				elegida=0;
			}
		}while(elegida<1 || elegida >5);
		return elegida;
	}

}
