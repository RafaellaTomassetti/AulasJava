
public class Circulo implements AreaCalculavel {
	
		int raio = 10;
		
		@Override
		public void calcularArea() {
			
			double area;
			area = Math.PI*Math.pow(2, raio); 
			//classe Math � est�tica, ou seja, n�o precisa criar objetos para acessar seus m�todos
			System.out.println("A �rea do c�rculo � " + area + " cm2");

		}

	
}
