import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class main {

	public static void main(String[] args) throws IOException {
		
	
	String x;
	Scanner scanner = new Scanner(System.in); // Instanciar e criar um objeto Scanner:

	System.out.println("Digite qualquer texto"); // imprimir informa��o na tela
	x = scanner.nextLine();
	
	try(BufferedWriter escrever = new BufferedWriter(new FileWriter("entrada.txt"))) {
	
	escrever.write(x);
	}
	
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

	