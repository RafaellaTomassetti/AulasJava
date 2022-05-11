
public class Aplicacao {

	public static void main(String[] args) {
		
		// Item item = new Item();  //não pode criar uma instância de uma classe abtrata
	
		Item item = new Cogumelo();  //criou a variável
		item.pegar();
		
		item = new Moeda();      //variável já criada, não precisa repetir o nome da classe (Item)
		item.pegar();
		
		item = new Diamante();
		item.pegar();
		
		
		
		
	}

}
