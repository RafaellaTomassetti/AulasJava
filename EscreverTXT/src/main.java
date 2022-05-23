import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class main {

	public static void main(String[] args) throws IOException {

		String s = "Texto para ser gravado no arquivo";
		
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))){ //essa linha deve estar num TRY para caso aconteca algum erro no caminho
	
		//o lugar onde a informação será inscrita é o parâmetro
		//criação do objeto responsável pela escrita
		//se não tiver o arquivo, ele cria e depois escreve
		
		escrever.write(s);
		}
	}

}
