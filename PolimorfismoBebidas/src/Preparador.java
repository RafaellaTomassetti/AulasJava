
public class Preparador {
// � a receita da prepara��o das bebidas
	
	public void prepararBebida(Bebida bebida) {
		System.out.println("Preparando a bebida " + bebida.getNome());
		bebida.preparar();
		

		
	if(bebida.isAquecer()) {      // teste para saber se a bebida ser� aquecida ou n�o
		System.out.println("Aquecendo a bebida " + bebida.getNome());
	} 
	
		System.out.println("Bebida preparada com sucesso");
	System.out.println();
}
}
