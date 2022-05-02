
public class Contador {

	private static int valor;
	

//	public Contador() {   //o objeto já inicia com o valor 1 incluído
//		this.valor = 1;
//	}

	static {
		valor=1;
	}
	
	public static void incrementar() {    
		valor ++;
	}
	
	public static int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
}
