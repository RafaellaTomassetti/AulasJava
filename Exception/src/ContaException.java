
public class ContaException extends Exception {

	//GERANDO CONSTRUTORES DA SUPER-CLASSE
	//Throwable SÃO OS PROBLEMAS QUE PODEM ACONTECER
	//string é a mensagem que vai aparecer
	public ContaException() { //construtor vazio
		super();
	}

	public ContaException(String message) {
		super(message);
	}


}
