
public class Quadrado implements AreaCalculavel {

	int base = 20;
	int altura = 20;
	
	@Override
	public void calcularArea() {
		
		int area;
		area = base*altura;
		System.out.println("A área do quadrado é " + area + " cm2");

	}

}
