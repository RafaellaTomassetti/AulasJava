import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {

//		List lista = new ArrayList(); // como n�o temos essa classe no projeto, precisa importar
//		// lista � uma vari�vel do tipo list
//
//		lista.add("abc"); // add recebe Object, ou seja, qualquer coisa
//		lista.add(12);
//		lista.add(true);
//
//		for (int x = 0; x < lista.size(); x++) { //aqui intera enquanto a condi��o for verdadeira
//			System.out.println(lista.get(x)); // o get recebe o index(�ndice)
//
//
//		}
//		
//		System.out.println();
//		for (Object valor : lista) { // vari�vel valor do tipo Object para receber qualquer tipo de dado
//			//pega o valor do �ndice 0 e aloca na vari�vel valor. Assim por diante.
//			//varre TODOS os valores que est�o na lista
//			
//			System.out.println(valor);
//		}
//		System.out.println();
//
//		//EXCLUIR ITEM DA LISTA A PARTIR DO INDEX
//		
//		lista.remove(0); //removendo o �ndice 0
//		//n�o mostra NULO, ele desvincula. � uma lista din�mica.
//		//ele reorganiza a lista, ou seja, j� que n�o tem mais o "abc", o '12' foi para o �ndice 0.
//		for (Object valor : lista) { 
//			System.out.println(valor); //mostrando a lista atualizada
//
//		}
//		
//		System.out.println();
//		//ADICIONANDO ITEM NA LISTA SEM APAGAR NADA
//		lista.add(0, "def"); //adicionando "def" no �ndice 0
//		//agora o '12' est� na posi��o 1 novamente.
//		
//		for (Object valor : lista) { 
//			System.out.println(valor); //mostrando a lista atualizada
//
//		}
//		System.out.println();
//		// ADICIONANDO ITEM NA LISTA SUBSTITUINDO ALGO QUE J� EXISTE
//		
//		lista.set(0, "ghi"); // substitui o que est� no �ndice 0 por "ghi" 
//		// agora o "ghi' est� na posi��o 0, ficando no lugar de "def".
//
//		for (Object valor : lista) {
//			System.out.println(valor); // mostrando a lista atualizada
//		}
//		
//		//clear apaga tudo que est� na lista
//		lista.clear();
//		if(lista.isEmpty()) //teste para saber se a lista est� vazia
//		System.out.println("Sua lista est� vazia");

		Conta conta1 = new Conta("�gua", 60.00);
		Conta conta2 = new Conta("Luz", 120.00);

		List<Conta> listaDeContas = new ArrayList<Conta>(); // s� aceita os objetos do tipo Conta

		listaDeContas.add(conta1);
		listaDeContas.add(conta2);
		for (Conta conta : listaDeContas) {
			System.out.println(conta);

		}
	}
}