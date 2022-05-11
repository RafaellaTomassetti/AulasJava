
public abstract class ContaBancaria {  //classe abstrata n�o pode ser instanciada
	
	private double saldo = 10; //atributo vis�vel apenas para as subclasses
	
	public double depositar(double valor) {
		saldo = saldo+valor;
		System.out.println("Dep�sito de R$ " + valor + " realizado.");
		return saldo;
		
	}
	public double sacar(double valor) {
		
		if (valor>saldo) {
			System.out.println("Voc� n�o tem valor sufuciente para fazer esse saque. Seu saldo atual � " + saldo);
		} else {
			saldo = saldo-valor;
			System.out.println("Saque de R$ " + valor + " realizado.");

		}
		
		return saldo;
		
		
	}
	public double transferir(double valor) {
	  
	    if (valor>saldo) {
			System.out.println("Voc� n�o tem valor sufuciente para fazer essa transfer�ncia. Seu saldo atual � " + saldo);
		} else {
			  saldo = saldo-valor;
				System.out.println("Transfer�ncia de R$ " + valor + " realizado.");

		}
		
	    return saldo;
	 }
	public double calcularSaldo() { //regra do c�lculo do saldo final
		return 0;
	} 
	
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
