
public class main {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();   //criando a variável e instanciando o objeto pessoa1
		
		pessoa1.nome = "Rafaella";  //atribuindo o nome do objeto
		pessoa1.numFigurinhas = 1;  //atribuindo o número de figurinhas inicial
		
		pessoa1.receber(3);  //objeto recebe 3 figurinhas que são somadas no saldo inicial
		
		//mostrar nome e número de figurinhas atualizadas
		System.out.println(pessoa1.nome);  
		System.out.println(pessoa1.numFigurinhas);

		Pessoa pessoa2 = new Pessoa();  //criando a variável e instanciando o objeto pessoa2
		pessoa2.nome = "João"; //atribuindo o nome do objeto
		pessoa2.numFigurinhas = 5;  /atribuindo o número de figurinhas inicial
				
		//mostrar nome e número de figurinhas
		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.numFigurinhas);

		boolean msg = pessoa1.dar(5, pessoa2); //variável booleana que recebe o método dar e os parâmetros
		
		if(msg == true) { //teste lógico
		//se tiver figurinha suficientes, vai mostrar nome e número de figurinhas atualizadas de ambos objetos
		System.out.println("depois");
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.numFigurinhas);
		
		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.numFigurinhas);}

		
	}

}
