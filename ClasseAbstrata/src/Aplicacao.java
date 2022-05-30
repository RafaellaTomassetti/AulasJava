
public class Aplicacao {  //CLASSE MAIN 

	public static void main(String[] args) {
		
		// Item item = new Item();  //não pode criar uma instância de uma classe abtrata
	
		Item item = new Cogumelo();  //Instanciou objeto  CRIOU UMA VARIÁVEL
		item.pegar();  //realizou ação pela classe COGUMELO
		
		item = new Moeda();      //variável já criada, não precisa repetir o nome da classe (Item)
		item.pegar(); //realizou ação pela classe MOEDA
		
		item = new Diamante(); //variável já criada, não precisa repetir o nome da classe (Item)
		item.pegar(); //realizou ação pela classe DIAMANTE
		
		
		
		
	}

}
