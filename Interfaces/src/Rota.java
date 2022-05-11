
public class Rota {

	public void ir(Automovel automovel) {      //automóvel é o parâmetro pois ele é mais genérico.
		//se fosse Ferrari, essa classe só caberia à ela 
		
		automovel.virarDireita();
		automovel.virarEsquerda();
		automovel.acelerar();
		automovel.virarDireita();
		System.out.println();
		
	}
	
}
