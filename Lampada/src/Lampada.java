
public class Lampada {
	private boolean estado;
	

	public Lampada() {
		this.estado = true;
	}

	public void ligar() {
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
