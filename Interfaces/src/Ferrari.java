
public class Ferrari implements Automovel, ItemCaro{

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

	@Override
	public double getPreco() {
		return 1000000;
	}
	
	

}
