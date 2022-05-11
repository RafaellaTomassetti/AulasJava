
public class Retangulo implements AreaCalculavel {

	int base = 30;
	int altura = 20;
	
	@Override
	public void calcularArea() {
		
		int area;
		area = base*altura;
		System.out.println("A área do retângulo é " + area + " cm2");

	}


}
