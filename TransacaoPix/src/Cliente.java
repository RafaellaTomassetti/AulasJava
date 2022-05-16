
public class Cliente {
	String nome;
	int conta;
	Pix pix; 
	Double valor;
	
	
	void receber(Double valor) {  //método com parâmetro de valor
		this.valor += valor;
	}

	boolean dar(Double valor, Cliente cliente) {

		if (valor > this.valor) {
			System.out.println("Você não tem valor suficientes para transferir para " + cliente.nome);
			System.out.println("Seu saldo é " + this.valor);
			return false; // retorno booleano

		} else {
			System.out.println("Você tem valor suficientes para transferir para " + cliente.nome);
			this.valor -= valor;
			cliente.receber(valor);
			return true; // retorno booleano
		}

	}
}
