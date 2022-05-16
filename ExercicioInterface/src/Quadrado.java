
public class Quadrado implements AreaCalculavel { //classe pública que implementa a interface AreaCalculavel

	int base = 20;  //atributos necessários para calcular a área do quadrado
	int altura = 20;
	
	@Override    
	public void calcularArea() {    //override do método calcular área da interface.
		
		int area;  //variável criada para guardar o valor da área
		area = base*altura;  //fórmula para cálculo da área do quadrado
		System.out.println("A área do quadrado é " + area + " cm2");

	}

}
