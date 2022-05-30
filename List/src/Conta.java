
public class Conta { //classe pública
	String nome; //atributos da classe
	double valor;

	//toString para retornar os atributos
	@Override
	public String toString() {
		return "Conta [nome=" + nome + ", valor= R$ " + valor + "]";
	}
	
	//construtor que cria objetos com os atributos pré-definidos
	public Conta(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;

	}

}

