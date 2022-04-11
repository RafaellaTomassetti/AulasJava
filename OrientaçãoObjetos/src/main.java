
public class main {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();   //criando a variável e instanciando o objeto pessoa
		
		pessoa1.nome = "Rafaella";
		pessoa1.numFigurinhas = 1;
		
		pessoa1.receber(3);
		
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.numFigurinhas);

	}

}
