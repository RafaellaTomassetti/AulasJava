
public class Cliente {  //classe pública
	String nome;    //atributos do Cliente
	int conta;
	Pix pix; 
	Double valor;
	
	
	void receber(Double valor) {  //método receber com parâmetro de valor
		this.valor += valor;   //pega o valor inicial e recebe um outro
	}

	boolean dar(Double valor, Cliente cliente) {//método dar com parâmetro de valor e o cliente que vai receber

		if (valor > this.valor) {  //condição lógica para saber se tem valor suficiente na conta para transferir
			System.out.println("Você não tem valor suficientes para transferir para " + cliente.nome);  //
			System.out.println("Seu saldo é " + this.valor);
			return false; // retorno booleano

		} else {
			System.out.println("Você tem valor suficientes para transferir para " + cliente.nome);
			this.valor -= valor;  //subtrai um valor do saldo inicial
			cliente.receber(valor);  // o dinheiro que saiu da conta foi para um outro cliente 
			return true; // retorno booleano
		}

	}
}
