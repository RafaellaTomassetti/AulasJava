
public class LeiteQuente extends Bebida { //classe LeiteQuente que estende da superclasse Bebida

	public LeiteQuente() {
		super("Leite Quente", true); //o construtor está recebendo informação da classe
		//construtor recebe o nome e se é necessário aquecer(true) ou não(false)
		//super recebe o construtor da superclasse
	}

	@Override
	public void preparar() {          //sobrescrita do método preparar da superclasse
		super.preparar();
		System.out.println("Colocando o leite no copo"); //mostando a preparação 

		
	}



	
	

}
