
public class ProbandoCuenta {
	private Cuenta cuenta1 = new Cuenta(100);
	private Cuenta cuenta2 = new Cuenta(200);
	
	public ProbandoCuenta() throws CuentaException {
		System.out.println("Saldo de cuenta1 -> "+ cuenta1.getSaldo());
		cuenta1.ingresarCantidad(200);
		System.out.println("Cuenta1 ingresa 200 -> " + cuenta1.getSaldo());
		System.out.println("Saldo de cuenta2 -> "+ cuenta2.getSaldo());
		cuenta2.retirarCantidad(300);
		System.out.println("Cuenta2 retira 200 -> " + cuenta2.getSaldo());
	}

}
