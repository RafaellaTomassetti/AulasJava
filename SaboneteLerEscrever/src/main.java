//importando os Buffers, File, exceptions, ArrayList e Scanner
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) throws IOException { // lança a excessão

		List<Sabonete> listaDeSabonete = new ArrayList<Sabonete>(); // fazendo uma lista da classe Sabonete

		Sabonete sabonete = new Sabonete(" lavanda", " roxo"); // instanciando um objeto sabonete com os parâmetros
		listaDeSabonete.add(sabonete); //adicionando as informações do sabonete na lista

		Sabonete sabonete2 = new Sabonete(" baunilha", " amarelo"); // instanciando um objeto sabonete com os parâmetros
		listaDeSabonete.add(sabonete2);

		Sabonete sabonete3 = new Sabonete(" rosas", " rosa"); // instanciando um objeto sabonete com os parâmetros
		listaDeSabonete.add(sabonete3);
		
		//Buffer é uma memória temporária que pode ler ou escrever 
		//o try verifica se a ação será realizada completamente
		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("entrada.txt"))) { // essa linha deve estar num
			// TRY para caso aconteça algum erro no caminho - se deu errado a situação, ele mostra o erro
				// junta as informações e escreve onde precisa
				// o lugar(destino) onde a informação será inscrita é o parâmetro(nesse caso é entrada.txt )
				// criação do objeto responsável pela escrita
				// se não tiver o arquivo, ele cria e depois escreve																				// TRY para caso aconteca
																							// algum erro no caminho
			for (Sabonete sabonetes : listaDeSabonete) {  //para a lista de sabonete, vai escrever a informação no txt

				escrever.write(sabonetes.toString()); // write é um método que escreve
				// write recebe a variável que contém o texto
			}
		}
		List<Sabonete> listaDeSabonetesLidos = new ArrayList<Sabonete>(); // fazendo uma lista de sabonetes lidos da classe Sabonete
		//Buffer para ler a lista de sabonetes
		try (BufferedReader reader = new BufferedReader(new FileReader("entrada.txt"))) {
			String line;
			String string = ""; // junta todas linhas em uma coisa só

			// usa o while até escrever todas as linhas, pois é o laço que eu utilizo quando
			// eu não sei a quantidade de linhas.
			while ((line = reader.readLine()) != null) { // != significa diferente
				// está lendo a 1 ºlinha e guarda em line, enquanto tiver conteúso, ou seja,
				// enquanto for diferente de nulo

				Sabonete sabonete1 = new Sabonete(line); //criando objeto que recebe a string Line que leu toda a informação
				listaDeSabonetesLidos.add(sabonete1); //adicionando a nova variável que possui a informação lida na lista de sabonetes lidos

			}
		}

	}

}
