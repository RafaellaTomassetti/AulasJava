
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
			System.out.println("A l�mpada est� ligada");
			
		} else {
			System.out.println("A l�mpada foi desligada");
		}

	 }
}
