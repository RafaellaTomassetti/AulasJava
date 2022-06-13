
public class Aplicacao { // classe main para aplicação dos métodos

	public static void main(String[] args) {

		ContaBancaria conta1 = new ContaBancaria(1000, 10);
		ContaBancaria conta2 = new ContaBancaria(100, 1);

		Cliente cliente1 = new Cliente("Rafa", 1111, conta1);
		Cliente cliente2 = new Cliente("Moça", 2222, conta2);

		
	   //-------------TESTE COM MAGIC NUMBERS-----------------
		
		
		switch (cliente1.getContabancaria().sacar(100)) {

		case 100:
			System.out.println("Saque realizado.");
			break;

		case 101:
			System.out.println("Saque realizado, mas você está no limite da sua conta");
			break;

		case 102:
			System.out.println("Você não tem valor sufuciente para fazer esse saque e esse ele ultrapassa"
					+ " seu limite. "
					+ "Seu saldo atual é " + cliente1.getContabancaria().getSaldo());
			
		}
		
		switch (cliente1.getContabancaria().transferir(10, cliente2)) {

		case 100:
			System.out.println("Transferência realizada.");
			break;

		case 101:
			System.out.println("Transferência realizado, mas você está no limite da sua conta");
			break;

		case 102:
			System.out.println("Você não tem valor sufuciente para fazer essa transferência e ela ultrapassa"
					+ " seu limite. "
					+ "Seu saldo atual é " + cliente1.getContabancaria().getSaldo());
			
		}
		
		  //-------------TESTE COM EXCEPTION-----------------
		
		try { //usamos o try para não deixar a JVM responsável, pois senão o programa pararia
			//se usasse o throws lá em cima, o programa pararia com o erro
			cliente1.getContabancaria().sacarEX(1000);
		} catch (ContaException e) { //catch captura o erro
			//com o e temos acesso aos recursos da ContaException
			
			e.printStackTrace();  //printStackTrace mostra as mensagens de erro padrão(as vermelhas)
			
			//tratar e mostrar para o usuário:
			System.out.println("Não foi possível realizar a operação: " + e.getMessage());
			//getMessage vai mostrar exatamente qual o erro que já definimos na classe ContaBancaria
			
			//com o tratamento do erro, o programa continua funcionando. Se usasse o throws, não continuaria
		}
		

	}

}