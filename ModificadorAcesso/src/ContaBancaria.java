
public class ContaBancaria {

	private int numConta;
	private boolean ativo;
	private double saldo;

	

	public ContaBancaria() {
		ativo=true;
		saldo = 1.0;
	}

	public ContaBancaria(boolean ativo, double saldo) {
		this.ativo = ativo;
		this.saldo = saldo;
	}

	public double saldo() {
		return saldo;

	}
	
	public void receber(double valor) { // esse m�todo n�o retorna nenhuma informa��o
		saldo += valor;
	}
	
	public void dar(double valor) {
		
		if (saldo >= valor)
			saldo -= valor;
	
	}
	
}
