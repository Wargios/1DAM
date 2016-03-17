
public class Cuenta {
	private int saldo;

	public Cuenta() {
		saldo = 0;
	}

	public Cuenta(int saldoInicial) {
		saldo = saldoInicial;
	}

	public int getSaldo() {
		return saldo;
	}

	public void retirarCantidad(int cantidad) throws CuentaException {
		saldo -= cantidad;
	}

	public void ingresarCantidad(int cantidad) {
		saldo += cantidad;
	}
	
}
