
public class Professor extends Usuario {
	
	private double salario;

	//construtor
	public Professor(String nome, int cpf, double salario) {
		super(nome, cpf);
		this.salario = salario;
	}
	
	
	
	@Override
	public String toString() {
		return " Professor [ nome= "+ this.getNome() + ", salario= " + salario + ", cpf = " + this.getCpf() +"]";
	}



	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}
