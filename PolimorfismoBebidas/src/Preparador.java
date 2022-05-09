
public class Preparador {
// é a receita da preparação das bebidas
	
	public void prepararBebida(Bebida bebida) {
		System.out.println("Preparando a bebida " + bebida.getNome());
		bebida.preparar();
		

		
	if(bebida.isAquecer()) {      // teste para saber se a bebida será aquecida ou não
		System.out.println("Aquecendo a bebida " + bebida.getNome());
	} 
	
		System.out.println("Bebida preparada com sucesso");
	System.out.println();
}
}
