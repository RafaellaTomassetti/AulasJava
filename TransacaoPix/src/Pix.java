
public class Pix { 

	public static void main(String[] args) { //classe pública main para executar o programa
		int chavecpf;   //atributos da classe
		String chaveemail;
		int chavetelefone;
		String chavealeatorio;

		Cliente cliente1 = new Cliente(); //instanciando o objeto cliente 1

		cliente1.nome = "Rafaella";  //atribuindo valor de String na variável
		cliente1.valor = 10.50;     //atribuindo valor double na variável
		
		System.out.println(cliente1.nome);  //imprimindo a variável na tela
		System.out.println(cliente1.valor); //imprimindo a variável na tela

		Cliente cliente2 = new Cliente(); //instanciando cliente 2
		cliente2.nome = "João";   //atribuindo valor de String na variável
		cliente2.valor = 5.75;    //atribuindo valor double na variável
		
		System.out.println(cliente2.nome);  //imprimindo a variável na tela
		System.out.println(cliente2.valor);   //imprimindo a variável na tela
		
		
		boolean msg = cliente1.dar(11.50, cliente2); //11.50 é o valor que será tranferido e o cliente 2 é pra quem o dinheiro será tranferido

		if(msg == true) {
			System.out.println("depois");
			System.out.println(cliente1.nome); 
			System.out.println(cliente1.valor); //vai mostrar como ficou o saldo final do cliente 1
			
			System.out.println(cliente2.nome);
			System.out.println(cliente2.valor); //vai mostrar como ficou o saldo final do cliente 2
			
		}
		
	}

}
