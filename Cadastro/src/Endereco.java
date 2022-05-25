public class Endereco { //endereço deve ser do tipo Object
	String rua;  //atributos da classe endereço
	int numero;
	String bairro;
	
	// toString para retornar todos os atributos dos usuários
	@Override
	public String toString() {
		return "Endereço [rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + "]";
	}
	
	//métodos getters e setters
	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
		
	

}
