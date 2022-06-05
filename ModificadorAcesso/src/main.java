
public class main {

	public static void main(String[] args) {

		ContaBancaria conta1 = new ContaBancaria(true, 3.0); // instanciando objeto com parâmetros da classe
								     // ContaBancaria
		// () = construtor

//		conta1.ativo = true;
//		conta1.numConta = 1234;
//		conta1.saldo = 100.50;
//		
//		
//		System.out.println(conta1.ativo);
//		System.out.println(conta1.numConta);
//		System.out.println(conta1.saldo);

		// conta1.receber(100.8);

		conta1.dar(2); // utilizando o método dar para retirar dinheiro do objeto conta1
		System.out.println(conta1.saldo()); // mostrando o saldo da conta 1

		ContaBancaria conta2 = new ContaBancaria(); // instanciando objeto da classe ContaBancaria sem parâmetros, então
													// ele vai pegar as informações do construtor vazio
													// () = construtor
		// conta2.receber(200.8);

		System.out.println(conta2.saldo()); // mostrando o saldo da conta 2

		Cliente cliente1 = new Cliente(); // instanciando objeto da classe Cliente
		cliente1.setNome("Rafael");    //utilizando o set para definir os atributos do objeto
		cliente1.setCpf(123456);
		cliente1.setNumConta(77777);

		System.out.println(cliente1.getNome());   //utilizando o get para ter acesso aos atributos privados e mostrar na tela
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getNumConta());

		System.out.println(cliente1);

		Cliente cliente2 = new Cliente();  // instanciando objeto da classe Cliente
		cliente2.setNome("Rafael");  //utilizando o set para definir os atributos do objeto
		cliente2.setCpf(123456);
		cliente2.setNumConta(77777);

		System.out.println(cliente2);

		if (cliente1.getNome() == cliente2.getNome()) { // compara o conteúdo de uma variável
			System.out.println("Os nomes são iguais"); // se os nomes forem iguais, aparece essa mensagem
		} else {
			System.out.println("Os nomes são diferentes"); // se não forem iguais, aparece essa mensagem

		}

		if (cliente1 == cliente2) { // como não tem nenhum get, compara os ENDEREÇOS dos objetos
			System.out.println("Os endereços dos objetos são iguais");
		} else {
			System.out.println("Os endereços dos objetos são diferentes");

		}

		if (cliente1.equals(cliente2)) { // compara os conteúdos dos objetos
			System.out.println("Os atributos dos objetos são iguais");
		} else {
			System.out.println("Os atributos dos objetos são diferentes");
		}

	}

}

