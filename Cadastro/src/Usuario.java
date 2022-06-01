
public class Usuario {
	private String nome;
	int idade;
	Endereco endereco;
	Sexo sexo;

	// toString para retornar todos os atributos dos sabonetes
	@Override
	public String toString() {
			return "Usuario nome=" + nome + ", idade=" + idade + ", Endereço: rua =" + endereco + ", sexo=" + sexo + "\n";

	}
	public Usuario(String texto) {
		String[] arrayLinha = texto.split(","); //split usado para dividir o toString a cada vírgula que aparecer
		String[] arrayNome = arrayLinha[0].split("="); 
		this.nome =  arrayNome[1].trim();
		//cria uma nova variável para pegar a posição 0 da arrayAuxiliar1 e dividir quando aparecer o "="

		String [] arrayAuxiliar3 = arrayLinha[1].split("=");
		this.idade = Integer.parseInt(arrayAuxiliar3[1].trim());  //converte a string da Array em inteiro com o Integer.parseInt

		
		String [] arrayAuxiliar4 = arrayLinha[5].split("=");
		this.sexo = Sexo.valueOf(arrayAuxiliar4[1].trim());
		
		Endereco endereco = new Endereco(arrayLinha);
		this.endereco = endereco;

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
	