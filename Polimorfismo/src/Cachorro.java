
public class Cachorro extends Animal{  //classe Cachorro que estende de Animal
	//Cachorro éa classe-filha
	
	//sobrescrita do método falar da classe-mãe
	@Override
	public void Falar() {
		System.out.println("Au Au");
	}
	//criação  de um método que só o chachorro tem
	public void Morder() {
		System.out.println("NHAAAAC");
	}
	
	
}
