import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; //Importando a classe Scanner para receber informa��o do usu�rio

public class main {

	public static void main(String[] args) {

		Usuario usuario = new Usuario(); // Instanciar e criar um objeto usuario:
		Endereco endereco = new Endereco();

		for (int x = 1; x <= 4; x++) {

			Scanner scanner = new Scanner(System.in); // Instanciar e criar um objeto Scanner:

			System.out.println("Digite o nome do usu�rio " + x); // imprimir informa��o na tela

			usuario.nome = scanner.next();

			System.out.println("Digite a idade:"); // imprimir informa��o na tela

			usuario.idade = scanner.nextInt();

			System.out.println("Digite a rua:"); // imprimir informa��o na tela

			endereco.rua = scanner.next();

			System.out.println("Digite o n�mero da casa:"); // imprimir informa��o na tela

			endereco.numero = scanner.nextInt();

			System.out.println("Digite o bairro:"); // imprimir informa��o na tela

			endereco.bairro = scanner.next();

		}
		for (int x = 1; x <= 4; x++) {

			System.out.println("Nome:");
			System.out.println(usuario.nome);
			
			System.out.println("Idade:");
			System.out.println(usuario.idade);
		}
		
		}
	}


