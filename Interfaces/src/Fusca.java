
public class Fusca implements Carro{

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

	@Override
	public void abrirPorta() {
		System.out.println("A porta abriu");
	}
	

}
