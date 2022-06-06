
public class Pessoa { //classe pública Pessoa

	//atributos da classe 
	String nome;
	int numFigurinhas;

	//método 'receber' que tem o número de figurinhas como parâmetro
	void receber(int numFigurinhas) {
		this.numFigurinhas += numFigurinhas;  //somando o número de figurinhas ao saldo inicial
	}
	
	//método 'dar' que tem o número de figurinhas e e a pessoa como parâmetro
	boolean dar(int numFigurinhas, Pessoa pessoa) {

		if (numFigurinhas > this.numFigurinhas) { //teste lógico para ver se tem figurinhas sufucientes para dar
			System.out.println("Você não tem figurinhas suficientes para dar para " + pessoa.nome);
			return false; // retorno booleano

		} else {
			System.out.println("Você tem figurinhas suficientes para dar para " + pessoa.nome);
			this.numFigurinhas -= numFigurinhas; //subtraindo a quantidade de figurinhas dadas do saldo inicial
			pessoa.receber(numFigurinhas);  // outra pessoa recebe a quantidade de figurinhas dadas
			return true; // retorno booleano
		}

	}
	
	
}
