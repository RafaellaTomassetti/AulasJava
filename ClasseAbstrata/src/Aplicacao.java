
public class Aplicacao {

	public static void main(String[] args) {
		
		// Item item = new Item();  //n�o pode criar uma inst�ncia de uma classe abtrata
	
		Item item = new Cogumelo();  //criou a vari�vel
		item.pegar();
		
		item = new Moeda();      //vari�vel j� criada, n�o precisa repetir o nome da classe (Item)
		item.pegar();
		
		item = new Diamante();
		item.pegar();
		
		
		
		
	}

}
