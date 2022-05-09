
public class main {

	public static void main(String[] args) {

//		Animal animal = new Cachorro();    //cachorro est� com "extends" em animal. 
//		                                  //A vari�vel animal est� apontando para o objeto "Cachorro"
//		animal.falar();
//
//		animal = new Gato();            //gato est� endere�ado em "animal"
//		animal.falar();
		// isso s� acontece porque a superclasse � animal

		Gato gato = new Gato();  //criei um objeto tipo gato na heap. A vari�vel "gato" aponta para a classe Gato.
		Cachorro cachorro = new Cachorro(); //criei um objeto tipo cachorro na heap. A vari�vel "cachorro" aponta para a classe Cachorro.
		falar(gato);             //o m�todo falar precisa de um par�metro dentro de "Animal"
		falar(cachorro);

	}

	public static void falar(Animal a) {     //o "a" � a inst�ncia. O "a" representa um animal. Nesse caso ele aponta para o "gato"
	a.Falar();
		
	if(a instanceof Cachorro) {         // instanceof � um operador de compara��o. A resposta se� true ou false.
	          						//ele v� se o objeto � da classe que eu estou comparando.
		   Cachorro c = (Cachorro) a;  
		   c.Morder();
		
	}
	
 }
}
