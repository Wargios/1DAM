package modelo;

public class CuentaCredito extends Cuenta {
	
	
	private static final double CREDITO_MAXIMO = 300;
	private static final double CREDITO_POR_DEFECTO = 100;
	
	private double credito; 
	
	public CuentaCredito(){
		super();
		this.credito=CREDITO_POR_DEFECTO;
	
	}
	CuentaCredito ( double saldo, double credito) throws CuentaException
	{
		super ( saldo);
		this.setCredito( credito);	
	}
	

	public double getCredito() {
		return credito;
	}

	public void setCredito(double paramCredito)throws CuentaException {
		if(paramCredito>CREDITO_MAXIMO || paramCredito < 0 ){
			throw new CuentaException("El cr�dito no puede exceder los " + CREDITO_MAXIMO + " euros ni ser negativo");
		}
			
		if ( saldo < 0 && Math.abs(saldo) > paramCredito )
				throw new CuentaException ("No puede modificarse el cr�dito al valor " + paramCredito + " porque el saldo de la cuenta es " + saldo);
		
		this.credito = paramCredito;
		
	}
	
	public void sacarDinero(double dineroASacar) throws CuentaException{
		
		if(dineroASacar<0){
			throw new CuentaException("No se puede sacar cantidades negativas");
		}
		
		if ( dineroASacar > getSaldo() + credito)
					throw new CuentaException("Te pasas del credito, no puedes sacar la cantidad " + dineroASacar);
			
		saldo= saldo - dineroASacar;
			
		
		
		
	}
	

	
	public String toString() {
		return   super.toString() + " y credito " + credito   ;
	}
}
