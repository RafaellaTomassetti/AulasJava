import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class main { // lan�a a excess�o

	public static void main(String[] args) throws FileNotFoundException, IOException {

		try(BufferedReader reader = new BufferedReader(new FileReader("entrada.txt"))) {
			String line;
			String string = ""; //junta todas linhas em uma coisa s�
			
			
			//usa o while at� escrever todas as linhas, pois � o la�o que eu utilizo quando eu n�o sei a quantidade de linhas.
			while((line = reader.readLine())!=null) { //!= significa diferente
			//est� lendo a 1 �linha e guarda em line, enquanto tiver conte�so, ou seja, enquanto for diferente de nulo
				string += line + "\n";
			}
			//quando for nulo, ou seja, quando n�o tiver mais conte�do, vai mostrar na tela
			System.out.println(string);
		}
		
	}

}
