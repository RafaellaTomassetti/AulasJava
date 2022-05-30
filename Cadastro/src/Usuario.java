
public class Usuario {
	private String nome;
	int idade;
	Endereco endereco;
	Sexo sexo;

	@Override
	public String toString() {
			return "Usuario [nome=" + nome + ", idade=" + idade + ", endereco=" + endereco + ", sexo=" + sexo + "]";

	}
	public Usuario(String texto) {
		String[] arrayAuxiliar1 = texto.split(",");
		String[] arrayAuxiliar2 = arrayAuxiliar1[0].split("=");
		this.nome = arrayAuxiliar2[1].trim();

	}

	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		return nome;
	}


	public Sexo getSexo() {
		return sexo;
	}


	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	
}
	