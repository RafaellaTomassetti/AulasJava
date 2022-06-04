
public class Usuario { //classe pública usuário
	private String nome;  //atributos do Usuário
	int idade;
	Endereco endereco;  //atributo endereço que vem da classe endereço
	Sexo sexo;  //sexo que vem do Enum Sexo

	// toString para retornar todos os atributos dos sabonetes
	@Override
	public String toString() {
			return "Usuario nome=" + nome + ", idade=" + idade + ", Endereço: rua =" + endereco + ", sexo=" + sexo + "\n";

	}
	public Usuario(String texto) {   //construtor com o parâmetro de String
		String[] arrayLinha = texto.split(","); //split usado para dividir o toString a cada vírgula que aparecer
		String[] arrayNome = arrayLinha[0].split("="); 
		//cria uma nova variável para pegar a posição 0 da arrayLinha e dividir quando aparecer o "="
		this.nome =  arrayNome[1].trim();  //o nome será exatamente a parte que o NOME foi dividido

		String [] arrayAuxiliar3 = arrayLinha[1].split("=");
		//cria uma nova variável para pegar a posição 1 da arrayLinha e dividir quando aparecer o "="

		this.idade = Integer.parseInt(arrayAuxiliar3[1].trim());  //converte a string da Array em inteiro com o Integer.parseInt
		//o trim tira os espaços vazios dos lados 
		
		String [] arrayAuxiliar4 = arrayLinha[5].split("=");
		//cria uma nova variável para pegar a posição 5 da arrayLinha e dividir quando aparecer o "="
		this.sexo = Sexo.valueOf(arrayAuxiliar4[1].trim());
		//converte a string da Array em Enum com o valueOf

		
		Endereco endereco = new Endereco(arrayLinha); //intanciando novo objeto da classe Endereco que recebe a arrayLinha
		this.endereco = endereco;

	}
	//construtor sem parâmetros
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	//métodos getters e setters do Usuário
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
	
