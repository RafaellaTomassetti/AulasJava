
public class Circulo implements AreaCalculavel {
	
		int raio = 10;
		
		@Override
		public void calcularArea() {
			
			double area;
			area = Math.PI*Math.pow(2, raio); 
			//classe Math é estática, ou seja, não precisa criar objetos para acessar seus métodos
			System.out.println("A área do círculo é " + area + " cm2");

		}

	
}
