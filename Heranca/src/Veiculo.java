
public class Veiculo {  //classe-mãe Veículo

	//atributos com o modificador protected
	protected String marca;  //permite acesso às classes filhas, mas proíbe a qualquer outro acesso externo.
	protected String modelo; //já o private proíbe qualquer acesso externo à própria classe, inclusive das classes filhas.
	protected int ano;
	private String nome;

	public void buzinar() {  //método que todas as classes-filhas devem ter
		System.out.println("BI BI");
	}

	public void imprimir() {   //método que todas as classes-filhas devem ter
		System.out.println("Marca: "+ marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano " + ano);
	}
	
	//métodos getters e setters para acessar atributos
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
