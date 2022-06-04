//importando os Buffers, File, exceptions, ArrayList e Scanner
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class main {

	public static void main(String[] args) throws IOException { //classe main para executar o programa
		
	
	String x;  //variável x do tipo String
	Scanner scanner = new Scanner(System.in); // Instanciar e criar um objeto Scanner

	System.out.println("Digite qualquer texto"); // imprimir informação na tela
	x = scanner.nextLine(); //salvando na variável x o que o usuário escrever
	
	//Buffer é uma memória temporária que pode ler ou escrever 
	//o try verifica se a ação será realizada completamente
	try(BufferedWriter escrever = new BufferedWriter(new FileWriter("entrada.txt"))) {
		// o lugar(destino) onde a informação será inscrita é o parâmetro. Nesse caso é o entrada.txt
		// criação do objeto responsável pela escrita
		// se não tiver o arquivo, ele cria e depois escreve
	escrever.write(x);// write é um método que escreve
	// write recebe a variável que contém o texto que será escrito
	}
	
	try(BufferedReader reader = new BufferedReader(new FileReader("entrada.txt"))) {
		String line;
		String string = ""; //junta todas linhas em uma coisa só
		
		//usa o while até escrever todas as linhas, pois é o laço que eu utilizo quando eu não sei a quantidade de linhas.
		while((line = reader.readLine())!=null) { //!= significa diferente
		//está lendo a 1 ºlinha e guarda em line, enquanto tiver conteúdo, ou seja, enquanto for diferente de nulo
			string += line + "\n";
		}
		//quando for nulo, ou seja, quando não tiver mais conteúdo, vai mostrar na tela
		System.out.println(string);
		}
	}
}

	
