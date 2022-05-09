
public class Bebida {
	
	private String nome;        //atribuições da superclasse, que serão extendidas para as subclasses
	private boolean aquecer;
	

	public Bebida(String nome, boolean aquecer) {
			super();
			this.nome = nome;
			this.aquecer = aquecer;
		}
	
	
	public void preparar() {
		System.out.println("Pegando copo");

	}

	
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