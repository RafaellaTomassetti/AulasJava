
public class main {

	public static void main(String[] args) {

		ContaBancaria conta1 = new ContaBancaria(true, 3.0); // () = construtor

//		conta1.ativo = true;
//		conta1.numConta = 1234;
//		conta1.saldo = 100.50;
//		
//		
//		System.out.println(conta1.ativo);
//		System.out.println(conta1.numConta);
//		System.out.println(conta1.saldo);

		// conta1.receber(100.8);
		conta1.dar(200);
		System.out.println(conta1.saldo());

		ContaBancaria conta2 = new ContaBancaria();
		// conta2.receber(200.8);

		System.out.println(conta2.saldo());

		Cliente cliente1 = new Cliente();
		cliente1.setNome("Rafael");
		cliente1.setCpf(123456);
		cliente1.setNumConta(77777);

		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getNumConta());

		System.out.println(cliente1);

		Cliente cliente2 = new Cliente();
		cliente2.setNome("Rafael");
		cliente2.setCpf(123456);
		cliente2.setNumConta(77777);

		
		System.out.println(cliente2);

		if (cliente1.getNome() == cliente2.getNome()) { //compara o conteúdo de uma variável
			System.out.println("Os nomes são iguais");
		} else {
			System.out.println("Os nomes são diferentes");

		}
		
		if(cliente1 == cliente2) { //compara os endereços de um objeto
			System.out.println("Os endereços dos objetos são iguais");
		} else {
			System.out.println("Os endereços dos objetos são diferentes");

		}

		if(cliente1.equals(cliente2)) {    //compara os conteúdos dos objetos
			System.out.println("Os atributos dos objetos são iguais");
		} else {
			System.out.println("Os atributos do objetos são diferentes");
		}
			
		
	}

}
