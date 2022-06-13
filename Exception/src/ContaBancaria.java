
public class ContaBancaria {  
	
	private double saldo; 
	private double limite;

	//-------------TESTE COM MAGIC NUMBERS-----------------
	
	public  int depositar(double valor) { 
		this.saldo += valor; 
		return 100;
		
	}
	public int sacar(double valor) {
		
		if (valor>this.saldo && this.saldo-valor<limite*-1) { 
			return 102;
			
		} else if (valor>this.saldo && this.saldo-valor>=limite*-1) {
			this.saldo-=valor;
			return 101;
		
		} else {
			this.saldo-=valor;
			return 100;
		}
		
	}
	public int transferir(double valor, Cliente cliente) { 
	  
		if (valor>this.saldo && this.saldo-valor<limite*-1 ) {  
			return 102;
			
		} else if (valor>this.saldo && this.saldo-valor>=limite*-1) {
			return 101;
			
		} else {
			this.saldo -= valor;
			cliente.getContabancaria().depositar(valor);
			return 100;
		}
	}
	
	  //-------------TESTE COM EXCEPTION-----------------
	
		public void sacarEX(double valor) throws ContaException{
			
			if (valor>this.saldo) { 
				
				throw new ContaException("Saldo insuficiente");  //lançando uma nova excessão
				//determinando a mensagem da excessão
			} 
			else if ((this.saldo - valor) < limite*-1) {
				
				throw new ContaException("Limite insuficiente");
			}
		
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso.");
		}
	
	
	

	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
	@Override
	public String toString() {
		return "ContaBancaria [saldo=" + saldo + ", limite=" + limite + "]";
	}
	
	public ContaBancaria(double saldo, double limite) {
		super();
		this.saldo = saldo;
		this.limite = limite;
	}  
	

	

}