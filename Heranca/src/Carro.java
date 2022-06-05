
public class Carro extends Veiculo{ //classe-filha que estende da classe-mãe Veículo
	private boolean quatroPortas;  //nova variável para personalizar o carro

	public boolean isQuatroPortas() {  //verificando se o carro tem quatrio portas
		return quatroPortas;  //retorna a variável
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}

	
	//agora tem um atributo a mais para a subclasse CARRO,
	//deve sobrescrever(OVERRIDE) o método imprimir
	@Override
	public void imprimir() {
		super.imprimir();  //além de imprimir o que já tem na classe-mãe, vai adiconar a quantidade de portas
		System.out.println("Tem quatro portas? " + quatroPortas);
	}
	
}
