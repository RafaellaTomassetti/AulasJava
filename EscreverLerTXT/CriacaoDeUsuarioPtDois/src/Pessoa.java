
public class Pessoa {
	
	String nome;
	int idade;
	Endereco endereco;
	Sexo sexo;
	
	public String getNome() {
		return nome;
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
	
	
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	@Override
	public String toString() {
		return "Pessoa nome = " + nome + ", idade = " + idade + ", \n Endereco: " + ", Bairro = " + endereco.getBairro() + ", N�mero = " + endereco.getRua() + ", Rua = " + endereco.getNum() + ", Sexo= " + sexo + "  ";
	}
	
	
	
	
}
