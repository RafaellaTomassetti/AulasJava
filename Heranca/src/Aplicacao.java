
public class Aplicacao {

	public static void main(String[] args) {

		
		Veiculo veiculo = new Veiculo();
	
		veiculo.setMarca("Honda");
		veiculo.setModelo("City");
		veiculo.setAno(2013);

		
		veiculo.imprimir();
		veiculo.buzinar();
		System.out.println();

		
		// agora é um novo objeto, então tem que atribuir as caracteríticas novamente
		
		Carro carro = new Carro();
		carro.setMarca("Volvo");
		carro.setModelo("XC 60");
		carro.setAno(2022);
		carro.setQuatroPortas(true);
		
		carro.imprimir();
		carro.buzinar();		
		System.out.println();


		Caminhao caminhao = new Caminhao();
		caminhao.setMarca("Mercedes");
		caminhao.setModelo("568");
		caminhao.setAno(2022);
		
		caminhao.imprimir();
		caminhao.buzinar();
		System.out.println();
		
		Moto moto = new Moto();
		moto.setMarca("Motooo");
		moto.setModelo("777");
		moto.setAno(2022);
		
		moto.imprimir();
		moto.buzinar();
		moto.empinar();
		System.out.println();


	}

}
