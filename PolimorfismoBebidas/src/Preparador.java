
public class Preparador {
// é a receita da preparação das bebidas
	
	public void prepararBebida(Bebida bebida) { //método prepararBebida que tem como parâmetro a bebida que serápreparada
		System.out.println("Preparando a bebida " + bebida.getNome()); //mostra na tela a pebida que está sendo preparada
		bebida.preparar(); //utiliza o método na variável criada
		//mostra na tela a frase "Pegando o copo" da classe Bebida
		

		
	if(bebida.isAquecer()) {      // teste para saber se a bebida será aquecida ou não
		System.out.println("Aquecendo a bebida " + bebida.getNome());   //mostra na tela a pebida que está sendo aquecida
	} 
	
		System.out.println("Bebida preparada com sucesso"); //mostra o fim do processo de preparação
	System.out.println(); //deixa uma linha em branco
}
}
