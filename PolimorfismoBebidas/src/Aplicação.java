
public class Aplicação {

	public static void main(String[] args) { //classe main para executar o programa

		Preparador preparador = new Preparador(); //instanciando objeto da classe Preparador
		
		LeiteQuente leiteQuente = new LeiteQuente(); //instanciando objeto da classe LeiteQuente
		preparador.prepararBebida(leiteQuente);         //preparando a bebida leiteQuente com o método prepararBebida da classe preparador
		
		Refrigerante refrigerante = new Refrigerante(); //instanciando objeto da classe Refrigerante
		preparador.prepararBebida(refrigerante);      //preparando a bebida refrigerante com o método prepararBebida da classe preparador
		
	}

}
