
public class Aplicação {

	public static void main(String[] args) {

		Preparador preparador = new Preparador();
		
		LeiteQuente leiteQuente = new LeiteQuente();
		preparador.prepararBebida(leiteQuente);        //preparando a bebida leite quente
		
		Refrigerante refrigerante = new Refrigerante();
		preparador.prepararBebida(refrigerante);      //preparando a bebida refrigerante
		
	}

}
