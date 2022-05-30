
public class Retangulo implements AreaCalculavel { //classe pública que implementa a interface AreaCalculavel

	int base = 30;  //atributos necessários para calcular a área do retângulo
	int altura = 20;
	
	@Override
	public void calcularArea() {   //override do método calcular área da interface.
		
		int area;   //variável criada para guardar o valor da área
		area = base*altura;    //fórmula para cálculo da área do quadrado
		System.out.println("A área do retângulo é " + area + " cm2");  //mostrar na tela o resultado da área

	}


}
