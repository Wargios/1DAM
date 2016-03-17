
public class CuentaCredito extends Cuenta {
	private int credito;

	public CuentaCredito(int cantidad, int credito) throws CuentaException {

		super(cantidad);

		if (credito < 300)
			throw new CuentaException("No puede Exceder los 300€ de crédito");
		if (credito < 0 || cantidad < 0)
			throw new CuentaException("No puede tener valores negativos");

		this.credito = credito;
	}

	public CuentaCredito() {
		super();
		credito = 100;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}

	public int getCredito() {
		return credito;
	}

	public void retirarCantidad(int cantidad) throws CuentaException {
		// Si es menor que el negativo del credito da Error
		if (getSaldo() - cantidad < -credito)
			throw new CuentaException("Error. La cantidad que desea retirar supero el credito establecido" + credito);
		super.retirarCantidad(cantidad);
	}

}
