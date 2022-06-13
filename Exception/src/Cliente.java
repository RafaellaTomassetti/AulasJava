
public class Cliente {

	private String nome;
	private int cpf;
	private ContaBancaria contabancaria;
	public String getNome() {
		
		return nome;
	}
	
	
	public Cliente(String nome, int cpf, ContaBancaria contabancaria) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.contabancaria = contabancaria;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public ContaBancaria getContabancaria() {
		return contabancaria;
	}
	public void setContabancaria(ContaBancaria contabancaria) {
		this.contabancaria = contabancaria;
	} 
	
	
	
	

}
