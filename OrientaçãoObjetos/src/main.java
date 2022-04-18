
public class main {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();   //criando a variável e instanciando o objeto pessoa
		
		pessoa1.nome = "Rafaella";
		pessoa1.numFigurinhas = 1;
		
		pessoa1.receber(3);
		
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.numFigurinhas);

		Pessoa pessoa2 = new Pessoa();
		pessoa2.nome = "João";
		pessoa2.numFigurinhas = 5;
		
		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.numFigurinhas);

		boolean msg = pessoa1.dar(5, pessoa2);
		
		if(msg == true) {
		System.out.println("depois");
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.numFigurinhas);
		
		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.numFigurinhas);}

		
	}

}