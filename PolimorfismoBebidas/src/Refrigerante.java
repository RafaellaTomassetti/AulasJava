
public class Refrigerante extends Bebida {  //classe Refrigerante que estende da superclasse Bebida

	public Refrigerante() { 
		super("Refrigerante", false);  //o construtor está recebendo informação da classe
		//construtor recebe o nome e se é necessário aquecer(true) ou não(false)
		//super recebe o construtor da superclasse
		
	}

	@Override                        //sobrescrita do método preparar da superclasse
	public void preparar() {
		super.preparar();        //utilizando o método da superclasse Bebida
		System.out.println("Colocando gelo no copo");  //mostrando a preparação
		System.out.println("Colocando o refrigerante no copo");

		

	}
	
	
	
}
