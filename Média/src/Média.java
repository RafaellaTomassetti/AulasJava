
public class Media {

	//atributos privados
	private Double nota1;
	private Double nota2;
	private Double nota3;

	public void imprimir() {  //método imprimir
	double notafinal = (this.nota1 * 3 + this.nota2 * 2 + this.nota3 * 5)/10;
	//fórmula da média que será salva na variável notafinal
	System.out.println(notafinal);  //mostrando na tela a nota final

	}

	//métodos getters e setters para acessar os atributos privados
	public Double getNota1() {
		return nota1;
	}

	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}

	public Double getNota2() {
		return nota2;
	}

	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}

	public Double getNota3() {
		return nota3;
	}

	public void setNota3(Double nota3) {
		this.nota3 = nota3;
	}

}

