
public class LeiteQuente extends Bebida {

	public LeiteQuente() {
		super("Leite Quente", true); //o construtor está recebendo informação da classe
		//super recebe o construtor da superclasse
	}

	@Override
	public void preparar() {          //sobrescrita do método preparar da superclasse
		super.preparar();
		System.out.println("Colocando o leite no copo");

		
	}



	
	

}
