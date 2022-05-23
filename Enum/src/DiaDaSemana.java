
public enum DiaDaSemana {  //classe enum define um conjunto de valores CONSTANTES
	
	DOMINGO(1),  //cada dia possui um atributo num associado
	SEGUNDA(2),
	TERCA(3), 
	QUARTA(4),
	QUINTA(5),
	SEXTA(6),
	SABADO(7);
	
	private int num;  //não consegue acessar de fora
	// já vai dizer o que cada dia vai receber

	private DiaDaSemana(int num) { //obriga a declarar os parâmetros das constantes
		this.num = num;
	}
	
	//Método get para ter acesso à variável privada
	public int getNum() {
		return num;
	}
	
	
	
	
}
