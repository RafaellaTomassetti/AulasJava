
public class main {

	public static void main(String[] args) {

		Animal animal = new Cachorro();    //cachorro est� com "extends" em animal. 
		                                  //A vari�vel animal est� apontando para o objeto "Cachorro"
		animal.falar();

		animal = new Gato();
		animal.falar();
		
		
	
	}

}
