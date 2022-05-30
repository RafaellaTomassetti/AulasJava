
public enum Sexo {
	
	F("Feminino"), M("Masculino"); //definindo constantes
	
	private String num;
	
	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	private Sexo(String num) {
		this.num = num;
	}

	
}
