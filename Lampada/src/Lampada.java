
public class Lampada { //classe pública Lampada
	private boolean estado;  //variável booleana privada
	

	public Lampada() {
		this.estado = true;
	}

	public void ligar() {   //método ligar tem um retorno verdadeiro
		estado = true;

	}

	public void desligar() {
		estado = false;

	}

	public void imprimir() {
		if (estado == true) {
			System.out.println("A lâmpada está ligada");
			
		} else {
			System.out.println("A lâmpada foi desligada");
		}

	 }
}
