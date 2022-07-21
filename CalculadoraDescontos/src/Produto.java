
public class Produto {
	private String nome;
	private double valor;
	private double porcentagemdesconto;
	
	public double calculardesconto() {
		double porcentagem = (100 -this.porcentagemdesconto)/100;
		double valorfinal = this.valor*porcentagem;
		return valorfinal;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getPorcentagemdesconto() {
		return porcentagemdesconto;
	}
	public void setPorcentagemdesconto(double porcentagemdesconto) {
		this.porcentagemdesconto = porcentagemdesconto;
	}

}
