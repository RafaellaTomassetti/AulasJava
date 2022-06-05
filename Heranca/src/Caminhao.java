
public class Caminhao extends Veiculo{ //classe-filha que estende da classe-mãe Veículo

	//a buzina do caminhão será diferente, então não vai precisar do super
	@Override  
	public void buzinar() {
		System.out.println("FOOOOOOOOOOON"); //mudando a buzina do caminhão
	}
	
	
	
	
}
