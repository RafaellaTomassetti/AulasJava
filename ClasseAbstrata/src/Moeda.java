
public class Moeda extends Item { //subclasse qu extende de ITEM

	//Override do método pegar da classe-mãe
	@Override
	public void pegar() {
		System.out.println("Pegou a Moeda +50 pontos"); //mensagem que aparece ao usar o método
	}
	

}
