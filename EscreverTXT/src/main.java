import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) throws IOException { //lan�a a excess�o 

List<Sabonete> listaDeSabonete = new ArrayList<Sabonete>(); //fazendo uma lista da classe Sabonete 
		
		Sabonete sabonete = new Sabonete(" lavanda"," roxo"); //instanciando um objeto sabonete
		listaDeSabonete.add(sabonete);
		
		Sabonete sabonete2 = new Sabonete(" baunilha"," amarelo"); //instanciando um objeto sabonete
		listaDeSabonete.add(sabonete2);

		
		Sabonete sabonete3 = new Sabonete(" rosas"," rosa"); //instanciando um objeto sabonete
		listaDeSabonete.add(sabonete3);
		
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))){ //essa linha deve estar num TRY para caso aconteca algum erro no caminho
			for (Sabonete sabonetes : listaDeSabonete) {									//se deu errado a situa��o, ele mostra o erro 
		//junta as informa��es e escreve onde precisa
		//o lugar(destino) onde a informa��o ser� inscrita � o par�metro
		//cria��o do objeto respons�vel pela escrita
		//se n�o tiver o arquivo, ele cria e depois escreve
		
		escrever.write(sabonetes.toString()); //write � um m�todo que escreve
		//write recebe a vari�vel que cont�m o texto
		}
		}
	}

}
