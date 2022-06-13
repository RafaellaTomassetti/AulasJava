
public class Aplicacao { // classe main para aplica��o dos m�todos

	public static void main(String[] args) {

		ContaBancaria conta1 = new ContaBancaria(1000, 10);
		ContaBancaria conta2 = new ContaBancaria(100, 1);

		Cliente cliente1 = new Cliente("Rafa", 1111, conta1);
		Cliente cliente2 = new Cliente("Mo�a", 2222, conta2);

		
	   //-------------TESTE COM MAGIC NUMBERS-----------------
		
		
		switch (cliente1.getContabancaria().sacar(100)) {

		case 100:
			System.out.println("Saque realizado.");
			break;

		case 101:
			System.out.println("Saque realizado, mas voc� est� no limite da sua conta");
			break;

		case 102:
			System.out.println("Voc� n�o tem valor sufuciente para fazer esse saque e esse ele ultrapassa"
					+ " seu limite. "
					+ "Seu saldo atual � " + cliente1.getContabancaria().getSaldo());
			
		}
		
		switch (cliente1.getContabancaria().transferir(10, cliente2)) {

		case 100:
			System.out.println("Transfer�ncia realizada.");
			break;

		case 101:
			System.out.println("Transfer�ncia realizado, mas voc� est� no limite da sua conta");
			break;

		case 102:
			System.out.println("Voc� n�o tem valor sufuciente para fazer essa transfer�ncia e ela ultrapassa"
					+ " seu limite. "
					+ "Seu saldo atual � " + cliente1.getContabancaria().getSaldo());
			
		}
		
		  //-------------TESTE COM EXCEPTION-----------------
		
		try { //usamos o try para n�o deixar a JVM respons�vel, pois sen�o o programa pararia
			//se usasse o throws l� em cima, o programa pararia com o erro
			cliente1.getContabancaria().sacarEX(1000);
		} catch (ContaException e) { //catch captura o erro
			//com o e temos acesso aos recursos da ContaException
			
			e.printStackTrace();  //printStackTrace mostra as mensagens de erro padr�o(as vermelhas)
			
			//tratar e mostrar para o usu�rio:
			System.out.println("N�o foi poss�vel realizar a opera��o: " + e.getMessage());
			//getMessage vai mostrar exatamente qual o erro que j� definimos na classe ContaBancaria
			
			//com o tratamento do erro, o programa continua funcionando. Se usasse o throws, n�o continuaria
		}
		

	}

}