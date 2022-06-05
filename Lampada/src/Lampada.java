
public class Lampada { //classe pública Lampada
	private boolean estado;  //variável booleana privada
	

	public Lampada() { //estado inicial da lâmpada é true
		this.estado = true;
	}

	public void ligar() {   //método ligar tem um retorno verdadeiro
		estado = true;

	}

	public void desligar() {  //método desligar tem um retorno falso
		estado = false;

	}

	public void imprimir() {
		if (estado == true) {  //condição lógica para analisar se o estado da lâmpada é true ou não
			System.out.println("A lâmpada está ligada");
			
		} else {
			System.out.println("A lâmpada foi desligada");
		}

	 }
}
