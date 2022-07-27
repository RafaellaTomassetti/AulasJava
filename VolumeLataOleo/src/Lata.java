
public class Lata {

	private double volume;
	private double raio;
	private double altura;
	
	public void calcularVolume(double raio, double altura) {
		this.volume = Math.PI * raio * raio * altura;
	    System.out.println("O valor do volume da lata de óleo é: " + this.volume);
	    
	}
	
}