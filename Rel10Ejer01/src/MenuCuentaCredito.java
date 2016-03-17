
public class MenuCuentaCredito {
	private CuentaCredito cuenta;

	public MenuCuentaCredito(int saldo, int credito) throws CuentaException {
		cuenta = new CuentaCredito(saldo, credito);
	}

	public MenuCuentaCredito() {
		cuenta = new CuentaCredito();
	}

	

	

	public void mostrarMenu() {
		System.out
				.println("1. Ingresar dinero " + "\n2. Sacar dinero " + "\n3. Mostrar saldo y credito " + "\n4. Salir");

	}

	public String toString() {
		StringBuilder sbtexto = new StringBuilder();
		sbtexto.append("La cuenta tiene:\n" + "\tSaldo: " + cuenta.getSaldo() + "\n\tCredito: " + cuenta.getCredito());
		return sbtexto.toString();
	}
	

}
