
public class Apartamento implements ItemCaro{  //classe Apartamento que implementa ItemCaro

	//sobreescrita do atributo da interface ItemCaro
	@Override
	public double getPreco() {
		return 250000;  //retorno do valor
	}

	
}
