
public class Pix { 

	public static void main(String[] args) { //classe pública main para executar o programa
		int chavecpf;   //atributos da classe
		String chaveemail;
		int chavetelefone;
		String chavealeatorio;

		Cliente cliente1 = new Cliente(); // criando a variável e instanciando o objeto pessoa

		cliente1.nome = "Rafaella";  //atribuindo valor de String na variável
		cliente1.valor = 10.50;     //atribuindo valor double na variável
		
		System.out.println(cliente1.nome);  //imprimindo a variável na tela
		System.out.println(cliente1.valor); //imprimindo a variável na tela

		Cliente cliente2 = new Cliente();
		cliente2.nome = "João";
		cliente2.valor = 5.75;
		
		System.out.println(cliente2.nome);
		System.out.println(cliente2.valor);
		
		
		boolean msg = cliente1.dar(11.50, cliente2);

		if(msg == true) {
			System.out.println("depois");
			System.out.println(cliente1.nome);
			System.out.println(cliente1.valor);
			
			System.out.println(cliente2.nome);
			System.out.println(cliente2.valor);
			
		}
		
	}

}
