
public class Aplicacao {

	public static void main(String[] args) { //classe-mãe para executar o programa

		
		Veiculo veiculo = new Veiculo();  //instanciando objeto da classe Veiculo
	
		veiculo.setMarca("Honda");   //utilizando set para atribuir um valor na variável
		veiculo.setModelo("City");
		veiculo.setAno(2013);

		
		veiculo.imprimir();  //utilizando o método no objeto
		veiculo.buzinar();
		System.out.println();  //deixando uma linha em branco

		
		// agora é um novo objeto, então tem que atribuir as caracteríticas novamente
		
		Carro carro = new Carro();   //novo objeto que vem da classe Carro
		carro.setMarca("Volvo");  //utilizando set para atribuir um valor na variável
		carro.setModelo("XC 60");
		carro.setAno(2022);
		carro.setQuatroPortas(true); //usando o set para definir se o carro tem 4 portas(true) ou não(false)
		
		carro.imprimir();  //utilizando o método no objeto
		carro.buzinar();		
		System.out.println();  //deixando uma linha em branco


		Caminhao caminhao = new Caminhao();  //novo objeto que vem da classe Caminhão
		caminhao.setMarca("Mercedes");  //utilizando set para atribuir um valor na variável
		caminhao.setModelo("568");
		caminhao.setAno(2022);
		
		caminhao.imprimir();  //utilizando o método no objeto
		caminhao.buzinar();
		System.out.println();  //deixando uma linha em branco
		
		Moto moto = new Moto();  //novo objeto que vem da classe Moto
		moto.setMarca("Motooo");  //utilizando set para atribuir um valor na variável
		moto.setModelo("777");
		moto.setAno(2022);
		
		moto.imprimir(); //utilizando o método no objeto
		moto.buzinar();
		moto.empinar();  //esse é o método específico da moto
		System.out.println();//deixando uma linha em branco


	}

}
