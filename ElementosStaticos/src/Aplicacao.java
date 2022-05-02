
public class Aplicacao {

	public static void main(String[] args) {

//	    Matematica matematica = new Matematica();

//		int resultado = matematica.somar(2, 3);
//		System.out.println(resultado);
//
//		resultado = matematica.subtrair(10, 4);
//		System.out.println(resultado);
//		
		int resultado = Matematica.somar(200, 78);  //como os métodos são estáticos, não preciso instanciar um objeto
		System.out.println(resultado);
		resultado = Matematica.subtrair(200, 78);
		System.out.println(resultado);
		
//		Contador contador1 = new Contador();
//		Contador contador2 = new Contador();
//		Contador contador3 = new Contador();
//		contador1.incrementar();
//		
//		
//		System.out.println(contador1.getValor());
//		System.out.println(contador2.getValor());
//		System.out.println(contador3.getValor());
		
//		Contador.incrementar();
//		Contador.incrementar();
//		Contador.incrementar();
//
//		System.out.println(Contador.getValor());
//		
		System.out.println(Constante.MEDIA_DA_PROVA);
		
		
		
	}

}
