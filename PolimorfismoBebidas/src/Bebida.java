
public class Bebida {
	
	private String nome;        //atribuições da superclasse, que serão estendidas para as subclasses
	private boolean aquecer;
	
	//construtor que recebe os atributos
	public Bebida(String nome, boolean aquecer) {
			super();
			this.nome = nome;
			this.aquecer = aquecer;
		}
	
	//método preparar
	public void preparar() {
		System.out.println("Pegando copo");

	}

	//métodos getters e setters para ter acesso aos atributos privados
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isAquecer() {
		return aquecer;
	}
	public void setAquecer(boolean aquecer) {
		this.aquecer = aquecer;
	}

	
}
