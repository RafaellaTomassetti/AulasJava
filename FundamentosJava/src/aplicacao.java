import java.util.Scanner;

public class aplicacao {

	public static void main(String[] args) {

	// *********** IF ELSE *************

//		int x = 100;
//		double y = 200;
//		int a = 0;
//		double b = 0;
//		short z = (short) 100000;
//		System.out.println(z);
//
//		byte t = 100;
//		System.out.println(t);
//
//		a = (int) y;
//		b = x;
//
//		System.out.println(a);
//		System.out.println(b);
//
//		int idadePessoa = 25;
//
//		if (idadePessoa < 20) {         //condi��o l�gica
//			System.out.println("Voc� n�o pode beber");
//		} else if (idadePessoa < 80) {
//			System.out.println("Bora tomar uma");
//		} else {
//			System.out.println("Quanto � a sua aposentadoria?");
//		}
//		System.out.println("Voc� tem " + idadePessoa);

		// System.out.println(-------------------------------------------);
		
		// *********** SWITCH CASE *************

//		int num = 9;
//
//		switch (num) {  //switch case usado para TESTAR o conte�do da vari�vel, quando os valores s�o CONSTANTES
//		case 1:
//			System.out.println("Segunda " );
//			break;                           //BREAK � usado pois, se n�o for, tudo que est� depois da verifica��o ser� executado
//		case 2:
//			System.out.println("Ter�a" );
//			break;
//		case 3:
//			System.out.println("Quarta " );
//			break;
//		case 4:
//			System.out.println("Quinta"  );
//			break;
//		case 5:
//			System.out.println("Sexta " );
//			break;
//		case 6:
//			System.out.println("S�bado " );
//			break;
//		case 7:
//			System.out.println("Domingo" );
//			break;
//			default:                       //se nenhum dos casos for verdadeiro, aparecer� o que est� no default
//				System.out.println("Esse n�mero n�o representa um dia da semana");

		// }
		// System.out.println(------------------------------------------);
		
		// *********** WHILE DO *************
		
//		int x = 8;
//		while (x<10) {               //enquanto x for menor que 8, � para ser executado o programa
//			System.out.println(x);
//			x = x + 1;
//		
//	}
//		
//	int x=10;
//		
//		do {
//			System.out.println(x);      //x aparecer� na tela enquanto ele for menor que 15
//		x=x+1;
//	}while(x<15); 

		// ************ TABUADA (FOR) **************
//Scanner ler = new Scanner(System.in); //scanner para receber informa��o do usu�rio
//System.out.println("Qual n�mero deseja realizar a tabuada?");
//
//int y;
//
//y = ler.nextInt();            //lendo informa��o do usu�rio
//
//	for(int x=0;  x<11; x++) {  // X iniciar� em 0 e somar� 1 (++) at� o x sendo menor que 11.
//		System.out.println(y + "x" + x + "= " + x*y);
//		
//
//
//		// *********** MATRIZES *************
//		int x1 = 3;
//		int y1 = 4;
//		int z1 = 5;
//
//		System.out.println(x1); // sem as matrizes ter�amos que fazer v�rios Sysos
//		System.out.println(y1);
//		System.out.println(z1);
//		System.out.println();
//
//		double x[] = { 3, 4, 5, 6 }; // j� est� determinando que a matriz tem 4 espa�os(length).
//		// java entende que um objeto est� sendo constru�do.
//
//		for (int aux = 0; aux < x.length; aux++) { // o programa vai executar at� o auxiliar(aux) ser menor que a
//													// quantidade de �ndices(4 nesse caso).
//
//			
//			System.out.println("Valor do �ndice " + aux + " = " + x[aux]);  //x[aux] ser� substitu�da pelo conte�do
//
//		}
//		System.out.println();
//
//		String nome[] = { "Rafael", "Gislene", "Lara" }; // j� est� determinando que a matriz tem 3 espa�os
//
//		for (int aux1 = 0; aux1 < nome.length; aux1++) { // o programa vai executar at� o auxiliar(aux) ser menor que a
//															// quantidade de �ndices(3 nesse caso).
//			System.out.println(nome[aux1]);
//
//			if (nome[aux1] == "Gislene") { // condi��o para descobrir em qual �ndice "Gislene" est� alocado
//				System.out.println("O �ndice de Gislene � " + aux1);
//
//			}
//
//		}
//		System.out.println();
//		int[] arrayInt = new int[5]; // inst�ncia de um objeto de Matriz. Define que os objetos recebem inteiros
//		
//		String[] ArrayString = new String[4];
//		double[] ArrayDouble = new double[4];
//
//		arrayInt[3] = 4; // na posi��o 3, o n�mero quatro est� sendo alocado.
//
//		int[] numero = new int[6];  //vari�vel n�mero recebe 6 posi��es(de 0 a 5)
//		
//		Scanner teclado = new Scanner(System.in); // scanner para receber informa��o do usu�rio
//
//		for (int aux2 = 0; aux2 < numero.length; aux2++) { // o programa vai executar at� o auxiliar(aux) ser menor que
//															// a quantidade de posi��es da matriz(6 nesse caso).
//			System.out.println("Digite um n�mero qualquer:");
//			numero[aux2] = teclado.nextInt();   ;;
//
//		}
//
//		for (int aux2 = 0; aux2 < numero.length; aux2++) {
//			System.out.println("�ndice " + aux2 + " = " + numero[aux2]); // vai mostrar qual � o valor alocado em cada
//																			// �ndice
//		}
		
		int[] arrayQualquer = new int[3];
		
		Object[] arrayObject = new Object[5]; //matriz do tipo objeto consegue receber qualquer coisa
		
		arrayObject[0] = 12; //a matriz receber� 12 na posi��o 0
		arrayObject[1] = "Rafaella"; //recebendo String
		arrayObject[2] = 8.7; //recebendo double
		arrayObject[3] = true; //recebendo boolean
		arrayObject[4] = arrayQualquer; //uma array dentro de outra

		for (int aux2 = 0; aux2 < arrayObject.length; aux2++) { 
			System.out.println("�ndice " + aux2 + " = " + arrayObject[aux2]);
			
		}	
		
		//***********MATRIZ BIDIRECIONAL(COM LINHAS E COLUNAS)************
			
			int[][] arrayBidirecional = new int[4][3];
			arrayBidirecional[0][0] = 4;
			arrayBidirecional[2][1] = 8;

			
			for (int linha = 0; linha < arrayBidirecional.length; linha++) { 
			
				for (int coluna = 0; coluna < arrayBidirecional[0].length; coluna++) { 
					System.out.print("  �ndice [" + linha + "] ["+ coluna+"] = " + arrayBidirecional [linha][coluna] + " " );
				}
			
				System.out.println();
			}
		
	}

}