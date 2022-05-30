import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; //Importando a classe Scanner para receber informa��o do usu�rio

public class main {

	public static void main(String[] args) throws IOException {
		
		
		List<Usuario> listaDeUsuario = new ArrayList<Usuario>();

		for (int x = 1; x <= 4; x++) {

			Usuario usuario = new Usuario(); // Instanciar e criar um objeto usuario:
			usuario.endereco = new Endereco();
			
			Scanner scanner = new Scanner(System.in); // Instanciar e criar um objeto Scanner

			System.out.println("Digite o nome do usu�rio " + x); // imprimir informa��o na tela

			usuario.setNome(scanner.next()) ;

			System.out.println("Digite a idade:"); // imprimir informa��o na tela

			usuario.idade = scanner.nextInt();
			
			
		    System.out.println("Digite O SEXO: F para feminino e M para masculino:"); // imprimir informa��o na tela
		    Sexo sexo = null;
		    
		    usuario.setSexo(sexo.valueOf(scanner.next()));
//		    
//				switch(sexo.getNum()){
//					case "F":
//					sexo.setNum("Feminino");
//							break;                           //BREAK � usado pois, se n�o for, tudo que est� depois da verifica��o ser� executado
//					case "M":
//						sexo.setNum("Masculino");
//						break;
//			
//				default:                       //se nenhum dos casos for verdadeiro, aparecer� o que est� no default
//				System.out.println("Esse valor n�o representa um sexo");
//			
//				}
			
			
			System.out.println("Digite a rua:"); // imprimir informa��o na tela

			usuario.endereco.rua = scanner.next();

			System.out.println("Digite o n�mero da casa:"); // imprimir informa��o na tela

			usuario.endereco.numero = scanner.nextInt();

			System.out.println("Digite o bairro:"); // imprimir informa��o na tela

			usuario.endereco.bairro = scanner.next();
			
			listaDeUsuario.add(usuario);

		}
		
		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("entrada.txt"))) { // essa linha deve estar num
			// TRY para caso aconte�a algum erro no caminho
			for (Usuario usuario : listaDeUsuario) { // se deu errado a situa��o, ele mostra o erro
			// junta as informa��es e escreve onde precisa
			// o lugar(destino) onde a informa��o ser� inscrita � o par�metro
			// cria��o do objeto respons�vel pela escrita
			// se n�o tiver o arquivo, ele cria e depois escreve

				escrever.write(usuario.toString()); // write � um m�todo que escreve
				// write recebe a vari�vel que cont�m o texto
			}
		}
		List<Usuario> listaDeUsuariosLidos = new ArrayList<Usuario>(); // fazendo uma lista da classe Sabonete
		try (BufferedReader reader = new BufferedReader(new FileReader("entrada.txt"))) {
			String line;

			// usa o while at� escrever todas as linhas, pois � o la�o que eu utilizo quando
			// eu n�o sei a quantidade de linhas.
			while ((line = reader.readLine()) != null) { // != significa diferente
				// est� lendo a 1 �linha e guarda em line, enquanto tiver conte�so, ou seja,
				// enquanto for diferente de nulo

				Usuario usuarios = new Usuario(line);
				listaDeUsuariosLidos.add(usuarios);

			}
		}
		
		for (Usuario UsuarioLido : listaDeUsuariosLidos) { // se deu errado a situa��o, ele mostra o erro
			// junta as informa��es e escreve onde precisa
			// o lugar(destino) onde a informa��o ser� inscrita � o par�metro
			// cria��o do objeto respons�vel pela escrita
			// se n�o tiver o arquivo, ele cria e depois escreve

			System.out.print(UsuarioLido.toString());

	}

	}
}



	
