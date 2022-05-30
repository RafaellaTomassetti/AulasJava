
public class Cliente {  //classe pública
	String nome;    //atributos priavdos do Cliente
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
			this.valor -= valor;
			cliente.receber(valor);
			return true; // retorno booleano
		}

	}
}
