
public enum Sexo {
	
	F("Feminino"), M("Masculino"); //definindo constantes
	
	
	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	private String num;

	private Sexo(String num) {
		this.num = num;
	}

	
}
