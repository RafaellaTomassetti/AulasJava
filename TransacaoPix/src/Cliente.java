
public class Cliente {
	String nome;
	int conta;
	Pix pix; 
	Double valor;
	
	
	void receber(Double valor) {
		this.valor += valor;
	}

	boolean dar(Double valor, Cliente cliente) {

		if (valor > this.valor) {
			System.out.println("Voc� n�o tem valor suficientes para transferir para " + cliente.nome);
			System.out.println("Seu saldo � " + this.valor);
			return false; // retorno booleano

		} else {
			System.out.println("Voc� tem valor suficientes para transferir para " + cliente.nome);
			this.valor -= valor;
			cliente.receber(valor);
			return true; // retorno booleano
		}

	}
}
