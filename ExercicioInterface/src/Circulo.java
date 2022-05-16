
public class Circulo implements AreaCalculavel { //classe pública que implementa a interface AreaCalculavel
	
		int raio = 10;  //atributo necessário para calcular a área do do círculo
		
		@Override
		public void calcularArea() { //override do método calcular área da interface.
			
			double area;  //variável criada para guardar o valor da área
			
			area = Math.PI*Math.pow(2, raio); //classe math que possiu várias funcionalidades matemáticas
			//classe Math é estática, ou seja, não precisa criar objetos para acessar seus métodos
			
			System.out.println("A área do círculo é " + area + " cm2");

		}

	
}
