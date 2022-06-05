
public class Aplicacao {

	public static void main(String[] args) {  //main para executar o programa

//	    Matematica matematica = new Matematica();

//		int resultado = matematica.somar(2, 3);
//		System.out.println(resultado);
//
//		resultado = matematica.subtrair(10, 4);
//		System.out.println(resultado);
//		
		int resultado = Matematica.somar(200, 78);  //como os métodos são estáticos, não preciso instanciar um objeto
		//colocando o resultado da soma de dois números na variável 'resultado'
		//o parâmetro são os 2 valores que serão somados
		System.out.println(resultado); //mostrando o resultado na tela
		
		resultado = Matematica.subtrair(200, 78);
		System.out.println(resultado);
		
//		Contador contador1 = new Contador();  //instanciando objeto contador1
//		Contador contador2 = new Contador();
//		Contador contador3 = new Contador();
//		contador1.incrementar();             //incrementando valor no contador1
		//lembrando que o contador se inicia com o valor 1, e o método incrementar soma 1 a variável
//		
//		
//		System.out.println(contador1.getValor());  //mostrando o valor do contador
//		System.out.println(contador2.getValor());
//		System.out.println(contador3.getValor());
		
//		Contador.incrementar();  //como o método incrementar é static, não precisa 
		//instanciar objeto para utilizar o método
		
//		Contador.incrementar();
//		Contador.incrementar();
//
//		System.out.println(Contador.getValor()); //mostrando o valor do Contador
//		
		System.out.println(Constante.MEDIA_DA_PROVA); //mostrando o valor da constante 
		
		
		
	}

}
