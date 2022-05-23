import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; //Importando a classe Scanner para receber informação do usuário

public class main {

	public static void main(String[] args) {
		
		
		List<Usuario> listaDeUsuario = new ArrayList<Usuario>();

		for (int x = 1; x <= 4; x++) {

			Usuario usuario = new Usuario(); // Instanciar e criar um objeto usuario:
			usuario.endereco = new Endereco();
			
			Scanner scanner = new Scanner(System.in); // Instanciar e criar um objeto Scanner:

			System.out.println("Digite o nome do usuário " + x); // imprimir informação na tela

			usuario.setNome(scanner.next()) ;

			System.out.println("Digite a idade:"); // imprimir informação na tela

			usuario.idade = scanner.nextInt();
			
			
		    System.out.println("Digite O SEXO: F para feminino e M para masculino:"); // imprimir informação na tela
		    Sexo sexo = null;
			usuario.setSexo(sexo.valueOf( scanner.next()));
			
			System.out.println("Digite a rua:"); // imprimir informação na tela

			usuario.endereco.rua = scanner.next();

			System.out.println("Digite o número da casa:"); // imprimir informação na tela

			usuario.endereco.numero = scanner.nextInt();

			System.out.println("Digite o bairro:"); // imprimir informação na tela

			usuario.endereco.bairro = scanner.next();
			
			listaDeUsuario.add(usuario);

		}
		
		for (Usuario usuario : listaDeUsuario) {
			System.out.println(usuario);
	
		}
	}
}


	
