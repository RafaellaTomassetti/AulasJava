import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) throws IOException { // lan�a a excess�o

		List<Sabonete> listaDeSabonete = new ArrayList<Sabonete>(); // fazendo uma lista da classe Sabonete

		Sabonete sabonete = new Sabonete(" lavanda", " roxo"); // instanciando um objeto sabonete
		listaDeSabonete.add(sabonete);

		Sabonete sabonete2 = new Sabonete(" baunilha", " amarelo"); // instanciando um objeto sabonete
		listaDeSabonete.add(sabonete2);

		Sabonete sabonete3 = new Sabonete(" rosas", " rosa"); // instanciando um objeto sabonete
		listaDeSabonete.add(sabonete3);

		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("entrada.txt"))) { // essa linha deve estar num
																							// TRY para caso aconteca
																							// algum erro no caminho
			for (Sabonete sabonetes : listaDeSabonete) { // se deu errado a situa��o, ele mostra o erro
				// junta as informa��es e escreve onde precisa
				// o lugar(destino) onde a informa��o ser� inscrita � o par�metro
				// cria��o do objeto respons�vel pela escrita
				// se n�o tiver o arquivo, ele cria e depois escreve

				escrever.write(sabonetes.toString()); // write � um m�todo que escreve
				// write recebe a vari�vel que cont�m o texto
			}
		}

		List<Sabonete> listaDeSabonetesLidos = new ArrayList<Sabonete>(); // fazendo uma lista da classe Sabonete
		try (BufferedReader reader = new BufferedReader(new FileReader("entrada.txt"))) {
			String line;

			// usa o while at� escrever todas as linhas, pois � o la�o que eu utilizo quando
			// eu n�o sei a quantidade de linhas.
			while ((line = reader.readLine()) != null) { // != significa diferente
				// est� lendo a 1 �linha e guarda em line enquanto tiver conte�so, ou seja,
				// enquanto for diferente de nulo

				Sabonete sabonete1 = new Sabonete(line);
				listaDeSabonetesLidos.add(sabonete1);

			}
		}

		for (Sabonete SaboneteLido : listaDeSabonetesLidos) { // se deu errado a situa��o, ele mostra o erro
			// junta as informa��es e escreve onde precisa
			// o lugar(destino) onde a informa��o ser� inscrita � o par�metro
			// cria��o do objeto respons�vel pela escrita
			// se n�o tiver o arquivo, ele cria e depois escreve

			System.out.print(SaboneteLido.toString());

		}

	}
}
