import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class main {

	public static void main(String[] args) throws IOException {

		String s = "Texto para ser gravado no arquivo";
		
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))){ //essa linha deve estar num TRY para caso aconteca algum erro no caminho
	
		//o lugar onde a informa��o ser� inscrita � o par�metro
		//cria��o do objeto respons�vel pela escrita
		//se n�o tiver o arquivo, ele cria e depois escreve
		
		escrever.write(s);
		}
	}

}
