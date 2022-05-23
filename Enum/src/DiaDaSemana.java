
public enum DiaDaSemana {  //classe enum define um conjunto de valores CONSTANTES
	
	DOMINGO(1),  //cada dia possui um atributo num associado
	SEGUNDA(2),
	TERCA(3), 
	QUARTA(4),
	QUINTA(5),
	SEXTA(6),
	SABADO(7);
	
	private int num;  //n�o consegue acessar de fora
	// j� vai dizer o que cada dia vai receber

	private DiaDaSemana(int num) { //obriga a declarar os par�metros das constantes
		this.num = num;
	}
	
	//M�todo get para ter acesso � vari�vel privada
	public int getNum() {
		return num;
	}
	
	
	
	
}
