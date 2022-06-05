
public class Ferrari implements Automovel, ItemCaro{  //classe Ferrari que implementa de Automóvel e ItemCaro

	
	//sobreescrita dos métodos da interface Automóvel
	@Override
	public void virarDireita() {
		System.out.println("Ferrari virou à direita");
	}

	@Override
	public void virarEsquerda() {
		System.out.println("Ferrari virou à esquerda");

	}

	@Override
	public void acelerar() {
		System.out.println("Ferrari acelerou");

		
	}
	
	//sobreescrita dos métodos da interface ItemCaro
	@Override
	public double getPreco() {
		return 1000000;
	}
	
	

}
