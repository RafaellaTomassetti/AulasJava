
public class Refrigerante extends Bebida {

	public Refrigerante() { 
		super("Refrigerante", false);  //o construtor est� recebendo informa��o da classe
		//super recebe o construtor da superclasse
		
	}

	@Override                        //sobrescrita do m�todo preparar da superclasse
	public void preparar() {
		super.preparar();
		System.out.println("Colocando gelo no copo");
		System.out.println("Colocando o refrigerante no copo");

		

	}
	
	
	
}
