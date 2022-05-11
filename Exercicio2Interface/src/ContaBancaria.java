
public abstract class ContaBancaria {  //classe abstrata não pode ser instanciada
	
	private double saldo = 10; //atributo visível apenas para as subclasses
	
	public double depositar(double valor) {
		saldo = saldo+valor;
		System.out.println("Depósito de R$ " + valor + " realizado.");
		return saldo;
		
	}
	public double sacar(double valor) {
		
		if (valor>saldo) {
			System.out.println("Você não tem valor sufuciente para fazer esse saque. Seu saldo atual é " + saldo);
		} else {
			saldo = saldo-valor;
			System.out.println("Saque de R$ " + valor + " realizado.");

		}
		
		return saldo;
		
		
	}
	public double transferir(double valor) {
	  
	    if (valor>saldo) {
			System.out.println("Você não tem valor sufuciente para fazer essa transferência. Seu saldo atual é " + saldo);
		} else {
			  saldo = saldo-valor;
				System.out.println("Transferência de R$ " + valor + " realizado.");

		}
		
	    return saldo;
	 }
	public double calcularSaldo() { //regra do cálculo do saldo final
		return 0;
	} 
	
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
