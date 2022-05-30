

public class Sabonete {
	
	private String cheiro; //atributos privados da classe Sabonete
	private String cor;


	// toString para retornar todos os atributos dos sabonetes
	@Override
	public String toString() {
		return "Sabonete: cheiro=" + cheiro + ", cor=" + cor + "\n";
	}
	
	//construtor que define os parâmetros para instanciar objetos
	public Sabonete(String cheiro, String cor) {
		super();
		this.cheiro = cheiro;
		this.cor = cor;
	}
	
	public Sabonete(String texto) {
		String[] arrayAuxiliar1 = texto.split(",");
		String[] arrayAuxiliar2 = arrayAuxiliar1[0].split("=");
		this.cheiro = arrayAuxiliar2[1].trim();

		String[] arrayAuxiliar3 = arrayAuxiliar1[1].split("=");
		this.cor = arrayAuxiliar2[1].trim();

	}

}
