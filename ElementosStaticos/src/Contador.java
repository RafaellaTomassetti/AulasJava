
public class Contador {

	private static int valor; 
	//variável static, ou seja, o valor de uma variável não varia

//	public Contador() {   //o objeto já inicia com o valor 1 incluído
//		this.valor = 1;
//	}

	static {  // método static que executa uma função sem a depender de um objeto
		valor=1;
	}
	
	public static void incrementar() {  //método static incrementar
		valor ++;   //incrementa em 1 a variável
	}
	
	//métodos getter e setter
	public static int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
}
