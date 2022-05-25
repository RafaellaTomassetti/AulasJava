
public class Sabonete {
	
	private String cheiro; //atributos privados da classe Sabonete
	private String cor;


	// toString para retornar todos os sabonetes
	@Override
	public String toString() {
		return "Sabonete [cheiro=" + cheiro + ", cor=" + cor + "]\n";
	}
	
	//construtor que define os parâmetros para instanciar objetos
	public Sabonete(String cheiro, String cor) {
		super();
		this.cheiro = cheiro;
		this.cor = cor;
	}
	
	
}
