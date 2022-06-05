
public class Fusca implements Carro{ //classe Fucsca que implementa de Carro
	
	//sobreescrita dos métodos da interface Automóvel, a qual carro estende
	@Override
	public void virarDireita() {
		System.out.println("Fusca virou à direita");

	}

	@Override
	public void virarEsquerda() {
		System.out.println("Fusca virou à esquerda");

	}

	@Override
	public void acelerar() {
		System.out.println("Fusca acelerou");

	}

	//sobrescrita do método da classe Carro
	@Override
	public void abrirPorta() {
		System.out.println("A porta abriu");
	}
	

}
