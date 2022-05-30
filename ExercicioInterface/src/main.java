
public class main {  //classe main para aplicação dos métodos

	public static void main(String[] args) {
	
		AreaCalculavel circulo = new Circulo();  //objeto círculo instanciado. É da classe AreaCalculavel
		circulo.calcularArea();  //usando o método de calcular área do CÍRCULO
		
		AreaCalculavel quadrado = new Quadrado(); //objeto quadrado instanciado. É da classe AreaCalculavel
		quadrado.calcularArea();	//usando o método de calcular área do QUADRADO
		
		AreaCalculavel retangulo = new Retangulo(); //objeto retângulo instanciado. É da classe AreaCalculavel
		retangulo.calcularArea();      //usando o método de calcular área do RETÂNGULO
		
		
	}

}
