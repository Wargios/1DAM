package modelo;

public class Cuenta {
	
	protected double saldo; 
	
	public Cuenta(){
		saldo=0;
	}
	
	
	
	Cuenta(double paramsaldo)throws CuentaException{
		this.setSaldo(paramsaldo);
	}
	
	
	
	public double getSaldo() {
		return saldo;
	}
	
	
	private void setSaldo(double saldo)throws CuentaException {
		if (saldo<0){
			throw new CuentaException("No puede darle a la cuenta un saldo negativo");
		}
		
		this.saldo = saldo;
	}
	
	public void sacarDinero(double dineroASacar)throws CuentaException{
		if ( dineroASacar < 0)
			throw new CuentaException("Imposible sacar cantidades negativas");
		
		if(dineroASacar>this.saldo){
			throw new CuentaException("Imposible sacar esa cantidad,su saldo no se lo permite");
		}
		
		this.saldo=this.saldo-dineroASacar;
		
	}
	
	public void ingresarDinero (double dineroAIngresar) throws CuentaException{
		if ( dineroAIngresar < 0 )
			throw new CuentaException("No puede ingresar cantidades negativas");
		this.saldo=this.saldo+dineroAIngresar;
	}
	
	public String toString() {
		return  "Cuenta con saldo: "+ saldo + " euros" ;
	}
}
