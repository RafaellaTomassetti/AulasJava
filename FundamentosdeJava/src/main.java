import java.util.Scanner;

public class main {

	public static void main(String[] args) {
//
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
//		if (idadePessoa < 20) {         //condição lógica
//			System.out.println("Você não pode beber");
//		} else if (idadePessoa < 80) {
//			System.out.println("Bora tomar uma");
//		} else {
//			System.out.println("Quanto é a sua aposentadoria?");
//		}
//		System.out.println("Você tem " + idadePessoa);

		// System.out.println(-------------------------------------------);

//		int num = 9;
//
//		switch (num) {  //switch case usado para TESTAR o conteúdo da variável, quando os valores são CONSTANTES
//		case 1:
//			System.out.println("Segunda " );
//			break;                           //BREAK é usado pois, se não for, tudo que está depois da verificação será executado
//		case 2:
//			System.out.println("Terça" );
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
//			System.out.println("Sábado " );
//			break;
//		case 7:
//			System.out.println("Domingo" );
//			break;
//			default:                       //se nenhum dos casos for verdadeiro, aparecerá o que está no default
//				System.out.println("Esse número não representa um dia da semana");

		// }
		// System.out.println(------------------------------------------);

//		int x = 8;
//		while (x<10) {               //enquanto x for menor que 8, é para ser executado o programa
//			System.out.println(x);
//			x = x + 1;
//		
//	}
//		
//	int x=10;
//		
//		do {
//			System.out.println(x);      //x aparecerá na tela enquanto ele for menor que 15
//		x=x+1;
//	}while(x<15); 
	
		// ************ TABUADA **************
//Scanner ler = new Scanner(System.in); //scanner para receber informação do usuário
//System.out.println("Qual número deseja realizar a tabuada?");
//
//int y;
//
//y = ler.nextInt();            //lendo informação do usuário
//
//	for(int x=0;  x<11; x++) {  // X iniciará em 0 e somará 1 (++) até o x sendo menor que 11.
//		System.out.println(y + "x" + x + "= " + x*y);
//		
//

		// *********** MATRIZES *************
		int x1 = 3;
		int y1 = 4;
		int z1 = 5;

		System.out.println(x1); // sem as matrizes teríamos que fazer vários Sysos
		System.out.println(y1);
		System.out.println(z1);
		System.out.println();

		double x2[] = { 3, 4, 5, 6 }; // já está determinando que a matriz tem 4 espaços

		for (int aux = 0; aux < x2.length; aux++) { // o programa vai executar até o auxiliar(aux) ser menor que a
													// quantidade de índices(4 nesse caso).
			System.out.println("Valor do índice " + aux + " = " + x2[aux]);

		}
		System.out.println();

		String nome[] = { "Rafael" + "Gislene" + "Lara" }; // já está determinando que a matriz tem 3 espaços
		
		for (int aux1 = 0; aux1 < nome.length; aux1++) { // o programa vai executar até o auxiliar(aux) ser menor que a
														// quantidade de índices(3 nesse caso).
			System.out.println(nome[aux1]);

			if (nome[aux1] == "Lara") { // condição para descobrir em qual índice "Gislene" está alocado
				System.out.println("O índice de Gislene é " + aux1);
              
			}

		}
		System.out.println();
		int[] arrayInt = new int[5];           //instância de um objeto de Matriz
		String[] ArrayString = new String[4];
		double[] ArrayDouble = new double[4];
		
		arrayInt[3] = 4;            // na posição 3, o número quatro está sendo alocado
		
		int[] numero = new int[6];
		Scanner teclado = new Scanner(System.in);   //scanner para receber informação do usuário
		
		for (int aux2 = 0; aux2 < numero.length; aux2++) {    // o programa vai executar até o auxiliar(aux) ser menor que a
			System.out.println("Digite um número qualquer:");// quantidade de posições da matriz(6 nesse caso).
			numero[aux2] = teclado.nextInt();
			
		}
		
		for (int aux2 = 0; aux2 < numero.length; aux2++) {
			System.out.println("índice " + aux2 + " = " + numero[aux2]); //vai mostrar qual é o valor alocado em cada índice
		}
		
		
		}
		
 	}
