import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {

//		List lista = new ArrayList(); // como não temos essa classe no projeto, precisa importar
//		// lista é uma variável do tipo list
//
//		lista.add("abc"); // add recebe Object, ou seja, qualquer coisa
//		lista.add(12);
//		lista.add(true);
//
//		for (int x = 0; x < lista.size(); x++) { //aqui intera enquanto a condição for verdadeira
//			System.out.println(lista.get(x)); // o get recebe o index(índice)
//
//
//		}
//		
//		System.out.println();
//		for (Object valor : lista) { // variável valor do tipo Object para receber qualquer tipo de dado
//			//pega o valor do índice 0 e aloca na variável valor. Assim por diante.
//			//varre TODOS os valores que estão na lista
//			
//			System.out.println(valor);
//		}
//		System.out.println();
//
//		//EXCLUIR ITEM DA LISTA A PARTIR DO INDEX
//		
//		lista.remove(0); //removendo o índice 0
//		//não mostra NULO, ele desvincula. É uma lista dinâmica.
//		//ele reorganiza a lista, ou seja, já que não tem mais o "abc", o '12' foi para o índice 0.
//		for (Object valor : lista) { 
//			System.out.println(valor); //mostrando a lista atualizada
//
//		}
//		
//		System.out.println();
//		//ADICIONANDO ITEM NA LISTA SEM APAGAR NADA
//		lista.add(0, "def"); //adicionando "def" no índice 0
//		//agora o '12' está na posição 1 novamente.
//		
//		for (Object valor : lista) { 
//			System.out.println(valor); //mostrando a lista atualizada
//
//		}
//		System.out.println();
//		// ADICIONANDO ITEM NA LISTA SUBSTITUINDO ALGO QUE JÁ EXISTE
//		
//		lista.set(0, "ghi"); // substitui o que está no índice 0 por "ghi" 
//		// agora o "ghi' está na posição 0, ficando no lugar de "def".
//
//		for (Object valor : lista) {
//			System.out.println(valor); // mostrando a lista atualizada
//		}
//		
//		//clear apaga tudo que está na lista
//		lista.clear();
//		if(lista.isEmpty()) //teste para saber se a lista está vazia
//		System.out.println("Sua lista está vazia");

		Conta conta1 = new Conta("Água", 60.00);
		Conta conta2 = new Conta("Luz", 120.00);

		List<Conta> listaDeContas = new ArrayList<Conta>(); // só aceita os objetos do tipo Conta

		listaDeContas.add(conta1);
		listaDeContas.add(conta2);
		for (Conta conta : listaDeContas) {
			System.out.println(conta);

		}
	}
}