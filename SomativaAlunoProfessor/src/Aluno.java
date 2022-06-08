
public class Aluno extends Usuario {
	private double valorPagarCurso;
	private Curso curso;
	private FormaPag formaPag;
	
	//construtor
	public Aluno(String nome, int cpf, double valorPagarCurso, Curso curso, FormaPag formaPag) {
		super(nome, cpf);
		this.valorPagarCurso = valorPagarCurso;
		this.curso = curso;
		this.formaPag = formaPag;
	}
	
	@Override
	public String toString() {
		return "Aluno [nome " +  valorPagarCurso=" + this.valorPagarCurso + ", curso=" + curso.toString() + ", formaPag=" + formaPag + "]";
	}



	public double getValorPagarCurso() {
		valorPagarCurso = (((curso.getQtdHorasCurso() * curso.getValorHoraCurso()) + curso.getProfessor().getSalario())* formaPag.getJuros());
		return valorPagarCurso;
	
	}
		

	public void setValorPagarCurso(double valorPagarCurso) {
		this.valorPagarCurso = valorPagarCurso;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public FormaPag getFormaPag() {
		return formaPag;
	}

	public void setFormaPag(FormaPag formaPag) {
		this.formaPag = formaPag;
	}
	
	

}
