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

		for (int x = 1; x <= 4; x++) {

			Usuario usuario = new Usuario(); // Instanciar e criar um objeto usuario:
			usuario.endereco = new Endereco();
			
			Scanner scanner = new Scanner(System.in); // Instanciar e criar um objeto Scanner

			System.out.println("Digite o nome do usuário " + x); // imprimir informação na tela

			usuario.setNome(scanner.next()) ;

			System.out.println("Digite a idade:"); // imprimir informação na tela

			usuario.idade = scanner.nextInt();
			
			
		    System.out.println("Digite O SEXO: F para feminino e M para masculino:"); // imprimir informação na tela
		    Sexo sexo = null;
		    
		    usuario.setSexo(sexo.valueOf(scanner.next()));
//		    
//				switch(sexo.getNum()){
//					case "F":
//					sexo.setNum("Feminino");
//							break;                           //BREAK é usado pois, se não for, tudo que está depois da verificação será executado
//					case "M":
//						sexo.setNum("Masculino");
//						break;
//			
//				default:                       //se nenhum dos casos for verdadeiro, aparecerá o que está no default
//				System.out.println("Esse valor não representa um sexo");
//			
//				}
			
			
			System.out.println("Digite a rua:"); // imprimir informação na tela

			usuario.endereco.rua = scanner.next();

			System.out.println("Digite o número da casa:"); // imprimir informação na tela

			usuario.endereco.numero = scanner.nextInt();

			System.out.println("Digite o bairro:"); // imprimir informação na tela

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
				// está lendo a 1 ºlinha e guarda em line, enquanto tiver conteúso, ou seja,
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



	
