
public class Cogumelo extends Item { //subclasse qu extende de ITEM

	
	//Override do método pegar da classe-mãe
	@Override
	public void pegar() {
		System.out.println("Pegou o Cogumelo +100 pontos"); //mensagem que aparece ao usar o método
	}
	

}
