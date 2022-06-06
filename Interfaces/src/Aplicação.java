
public class Aplicação {

	public static void main(String[] args) {  //classe main para executar o programa
		
		Rota rota = new Rota();          //instanciando objeto da classe Rota
		Ferrari ferrari = new Ferrari(); //instanciando objeto da classe Ferrari
		Fusca fusca = new Fusca();       //instanciando objeto da calsse Fusca
		
		rota.ir(ferrari);  //aplicando métodos nos objetos
		rota.ir(fusca);
		
		
		Automovel automovel = new Ferrari();  //instaciando objeto da classe Ferrari
		rota.ir(automovel); //aplicando métodos no objeto
		
		automovel = new Fusca();
		rota.ir(automovel);
		
		Vendedor vendedor = new Vendedor();  //instaciando objeto da classe Vendedor
		Apartamento apartamento = new Apartamento();   //instaciando objeto da classe Apartamento
		
		vendedor.mostrarPreco(apartamento);  //aplicando métodos nos objetos
		vendedor.mostrarPreco(ferrari);

	}

}
