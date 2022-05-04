
public class Carro extends Veiculo{
	private boolean quatroPortas;

	public boolean isQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}

	
	//agora tem um atributo a mais para a subclasse CARRO
	//deve sobrescrever(OVERRIDE) o m�todo imprimir
	
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Tem quatro portas? " + quatroPortas);
	}
	
}
