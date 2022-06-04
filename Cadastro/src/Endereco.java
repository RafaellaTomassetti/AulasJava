public class Endereco { //endereço deve ser do tipo Object
	String rua;  //atributos da classe endereço
	int numero;
	String bairro;
	
	
	
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
	
	// toString para retornar todos os atributos dos usuÃ¡rios
		@Override
		public String toString() {
			return rua + ", numero=" + numero + ", bairro=" + bairro ;
		}

		public Endereco(String[] arrayLinha) {
			
			String[] arrayAuxiliar2 = arrayLinha[2].split("=");
			this.rua = arrayAuxiliar2[1].trim();

			String[] arrayAuxiliar3 = arrayLinha[3].split("=");
			this.numero = Integer.parseInt(arrayAuxiliar3[1].trim());

			String[] arrayAuxiliar4 = arrayLinha[4].split("=");
			this.bairro = arrayAuxiliar4[1].trim();

		}

		public Endereco() {
			
		}



}
