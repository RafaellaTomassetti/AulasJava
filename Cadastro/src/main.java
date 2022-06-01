import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; //Importando a classe Scanner para receber informação do usuário

public class main {

	public static void main(String[] args) throws IOException {

		List<Usuario> listaDeUsuario = new ArrayList<Usuario>();
		Scanner scanner = new Scanner(System.in); // Instanciar e criar um objeto Scanner

		for (int x = 1; x <= 2; x++) {

			Usuario usuario = new Usuario(); // Instanciar e criar um objeto usuario:
			usuario.endereco = new Endereco();

			System.out.println("Digite o nome do usuário " + x); // imprimir informação na tela

			usuario.setNome(scanner.next());

			System.out.println("Digite a idadedo usuário " + x); // imprimir informação na tela

			usuario.idade = scanner.nextInt();

			System.out.println("Digite O SEXO do usuário " + x + " : 1 para feminino e 2 para masculino:"); 
			int sexo = 0; // sexo vai entrar com o valor 0

			while (sexo != 1 && sexo != 2) { // o sexo entra pois é diferente de 1 e 2
				// && = e
				// while usado para testar e depois executar
				sexo = scanner.nextInt();
				if (sexo == 1) { // condição lógica

					usuario.setSexo(Sexo.FEMININO); // usa o set para adicionar o atributo na variável

				} else if (sexo == 2) { // usa o set para adicionar o atributo na variável

					usuario.setSexo(Sexo.MASCULINO);

				} else {
					System.out.println("Esse valor não representa um sexo");
					System.out.println("Digite O SEXO: 1 para feminino e 2 para masculino:");
					// enquanto o usuário digitar algo diferente de 1 e 2, vai pedir para digitar o
					// sexo novamente
				}
			}

			System.out.println("Digite a rua do usuário " + x); // imprimir informação na tela

			usuario.endereco.rua = scanner.next();

			System.out.println("Digite o número da casa do usuário " + x); // imprimir informação na tela

			usuario.endereco.numero = scanner.nextInt();

			System.out.println("Digite o bairro do usuário " + x); // imprimir informação na tela

			usuario.endereco.bairro = scanner.next();

			listaDeUsuario.add(usuario);

		}

		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("entrada.txt"))) { // essa linha deve estar num
			// TRY para caso aconteça algum erro no caminho
			for (Usuario usuario : listaDeUsuario) { // se deu errado a situação, ele mostra o erro
				// junta as informações e escreve onde precisa
				// o lugar(destino) onde a informação será inscrita é o parâmetro
				// criação do objeto responsável pela escrita
				// se não tiver o arquivo, ele cria e depois escreve

				escrever.write(usuario.toString()); // write é um método que escreve
				// write recebe a variável que contém o texto
			}
		}
		List<Usuario> listaDeUsuariosLidos = new ArrayList<Usuario>(); // fazendo uma lista da classe Sabonete
		try (BufferedReader reader = new BufferedReader(new FileReader("entrada.txt"))) {
			String line;

			// usa o while até escrever todas as linhas, pois é o laço que eu utilizo quando
			// eu não sei a quantidade de linhas.
			while ((line = reader.readLine()) != null) { // != significa diferente
				// está lendo a 1º linha e guarda em line, enquanto tiver conteúso, ou seja,
				// enquanto for diferente de nulo

				Usuario usuarios = new Usuario(line);
				
				listaDeUsuariosLidos.add(usuarios);

			}
		}

		for (Usuario UsuarioLido : listaDeUsuariosLidos) { // se deu errado a situação, ele mostra o erro
			// junta as informações e escreve onde precisa
			// o lugar(destino) onde a informação será inscrita é o parâmetro
			// criação do objeto responsável pela escrita
			// se não tiver o arquivo, ele cria e depois escreve

			System.out.print(UsuarioLido.toString());

		}

	}
}
