
public class main {  //classe main para aplicação dos métodos

	public static void main(String[] args) {
	
		AreaCalculavel circulo = new Circulo();  //objeto círculo instanciado. É da classe AreaCalculavel
		circulo.calcularArea();
		
		AreaCalculavel quadrado = new Quadrado(); //objeto quadrado instanciado. É da classe AreaCalculavel
		quadrado.calcularArea();	
		
		AreaCalculavel retangulo = new Retangulo(); //objeto retângulo instanciado. É da classe AreaCalculavel
		retangulo.calcularArea();
		
		
	}

}
