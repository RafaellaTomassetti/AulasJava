
public class ContaBancaria { //classe pública

	private int numConta;  //atributos privados da classe
	private boolean ativo;
	private double saldo;

	public ContaBancaria() {
		ativo=true;
		saldo = 1.0;
	}
	//construtor que define os parâmetros
	public ContaBancaria(boolean ativo, double saldo) {
		this.ativo = ativo;
		this.saldo = saldo;
	}

	public double saldo() {
		return saldo;

	}
	
	public void receber(double valor) { // esse método não retorna nenhuma informação
		saldo += valor; //um valor será somado ao saldo
	}
	
	public void dar(double valor) {
		
		if (saldo >= valor) //condição lógica para apenas funcionar se tiver saldo sufuciente
			saldo -= valor;  //um valor será subtraído do saldo
	
	}
	
}
