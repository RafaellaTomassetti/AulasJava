import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class main {

	public static void main(String[] args) throws IOException { //lança a excessão 

		String s = "Texto para ser gravado no arquivo"; //salvar o texto em uma váriável do tipo string
		
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))){ //essa linha deve estar num TRY para caso aconteca algum erro no caminho
												//se deu errado a situação, ele mostra o erro 
		//junta as informações e escreve onde precisa
		//o lugar(destino) onde a informação será inscrita é o parâmetro
		//criação do objeto responsável pela escrita
		//se não tiver o arquivo, ele cria e depois escreve
		
		escrever.write(s); //write é um método que escreve
		//write recebe a variável que contém o texto
		}
	}

}
