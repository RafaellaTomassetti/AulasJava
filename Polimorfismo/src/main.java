
public class main {

	public static void main(String[] args) {

//		Animal animal = new Cachorro();    //cachorro está com "extends" em animal. 
//		                                  //A variável animal está apontando para o objeto "Cachorro"
//		animal.falar();
//
//		animal = new Gato();            //gato está endereçado em "animal"
//		animal.falar();
		// isso só acontece porque a superclasse é animal

		Gato gato = new Gato();  //criei um objeto tipo gato na heap. A variável "gato" aponta para a classe Gato.
		Cachorro cachorro = new Cachorro(); //criei um objeto tipo cachorro na heap. A variável "cachorro" aponta para a classe Cachorro.
		falar(gato);             //o método falar precisa de um parâmetro dentro de "Animal"
		falar(cachorro);

	}

	public static void falar(Animal a) {     //o "a" é a instância. O "a" representa um animal. Nesse caso ele aponta para o "gato"
	a.Falar();
		
	if(a instanceof Cachorro) {         // instanceof é um operador de comparação. A resposta seá true ou false.
	          						//ele vê se o objeto é da classe que eu estou comparando.
		   Cachorro c = (Cachorro) a;  
		   c.Morder();
		
	}
	
 }
}
