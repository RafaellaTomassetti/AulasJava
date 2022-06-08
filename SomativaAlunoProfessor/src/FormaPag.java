
public enum FormaPag {
	
	A_VISTA(0.9),
	CARNÊ(1.1),
	CARTAO_CREDITO(1.05);
	
	private double juros;

	private FormaPag(double juros) {
		this.juros = juros;
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}
	
	
	
	

}
