
public class Pix {

	public static void main(String[] args) {
		int chavecpf;
		String chaveemail;
		int chavetelefone;
		String chavealeatorio;

		Cliente cliente1 = new Cliente(); // criando a variável e instanciando o objeto pessoa

		cliente1.nome = "Rafaella";
		cliente1.valor = 10.50;
		
		System.out.println(cliente1.nome);
		System.out.println(cliente1.valor);

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
