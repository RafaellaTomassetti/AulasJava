
public class ContaBancaria {

	private int numConta;
	private boolean ativo;
	private double saldo;

	public void receber(double valor) { // esse m�todo n�o retorna nenhuma informa��o
		saldo += valor;
	}

	public double saldo() {
		return saldo;

	}

	public void dar(double valor) {
		
		if (saldo >= valor)
			saldo -= valor;
	
	}
	
}
