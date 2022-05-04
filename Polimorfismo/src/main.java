
public class main {

	public static void main(String[] args) {

		Animal animal = new Cachorro();    //cachorro está com "extends" em animal. 
		                                  //A variável animal está apontando para o objeto "Cachorro"
		animal.falar();

		animal = new Gato();
		animal.falar();
		
		
	
	}

}
