
public class Sabonete {

	private String cheiro; // atributos privados da classe Sabonete
	private String cor;

	// toString para retornar todos os atributos dos sabonetes
	@Override
	public String toString() {
		return "Sabonete:cheiro=" + cheiro + ", cor=" + cor + "\n";
	}

	// construtor que define os parâmetros para instanciar objetos
	public Sabonete(String cheiro, String cor) {
		super();
		this.cheiro = cheiro;
		this.cor = cor;
	}
	// toString com parâmetro apenas de UMA string
	public Sabonete(String texto) {
		String[] arrayAuxiliar1 = texto.split(","); 
		//com o split, quando achar a vírgula, vai quebrar o texto em 2 partes
		//o que vem antes da vírgula. fica na posição 0
		//o que fica depois, fica na posição 1
		
		String[] arrayAuxiliar2 = arrayAuxiliar1[0].split("=");
		
		//trim tira os espaços vazios dos lados
		this.cheiro = arrayAuxiliar2[1].trim();

		String[] arrayAuxiliar3 = arrayAuxiliar1[1].split("=");
		this.cor = arrayAuxiliar2[1].trim();

	}

}
