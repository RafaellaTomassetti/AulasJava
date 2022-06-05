
public class Constante {

	// final em Java serve para atribuir valores constantes, ou seja,
	//que a partir da sua declaração, seus valores não poderão mais serem alterados,
	// mesmo com a visibilidade pública
	public static final double MEDIA_DA_PROVA; 
	
	//static não precisa criar objetos pra acessar os métodos
	static {
		MEDIA_DA_PROVA = 7.0; //definindo uma constante
	}
	
	
}
