import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class main { // lança a excessão

	public static void main(String[] args) throws FileNotFoundException, IOException {

		try(BufferedReader reader = new BufferedReader(new FileReader("entrada.txt"))) {
			String line;
			String string = ""; //junta todas linhas em uma coisa só
			
			
			//usa o while até escrever todas as linhas, pois é o laço que eu utilizo quando eu não sei a quantidade de linhas.
			while((line = reader.readLine())!=null) { //!= significa diferente
			//está lendo a 1 ºlinha e guarda em line, enquanto tiver conteúso, ou seja, enquanto for diferente de nulo
				string += line + "\n";
			}
			//quando for nulo, ou seja, quando não tiver mais conteúdo, vai mostrar na tela
			System.out.println(string);
		}
		
	}

}
