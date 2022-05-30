
public class Aplicação {

	public static void main(String[] args) {
		
		Rota rota = new Rota();          //instanciando objeto
		Ferrari ferrari = new Ferrari(); //instanciando objeto
		Fusca fusca = new Fusca();       //instanciando objeto
		
		rota.ir(ferrari);
		rota.ir(fusca);
		
		
		Automovel automovel = new Ferrari();
		rota.ir(automovel);
		
		automovel = new Fusca();
		rota.ir(automovel);
		
		Vendedor vendedor = new Vendedor();
		Apartamento apartamento = new Apartamento();
		
		vendedor.mostrarPreco(apartamento);
		vendedor.mostrarPreco(ferrari);

	}

}
