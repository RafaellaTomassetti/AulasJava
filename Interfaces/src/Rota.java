
public class Rota {

	public void ir(Automovel automovel) {      //autom�vel � o par�metro pois ele � mais gen�rico.
		//se fosse Ferrari, essa classe s� caberia � ela 
		
		automovel.virarDireita();
		automovel.virarEsquerda();
		automovel.acelerar();
		automovel.virarDireita();
		System.out.println();
		
	}
	
}
