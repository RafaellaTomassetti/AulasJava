public class Endereco { //endereço deve ser do tipo Object
	String rua;
	int numero;
	String bairro;
	
	@Override
	public String toString() {
		return "Endereço [rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + "]";
	}

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