import java.util.Scanner ;

public class main {

	public static void main(String[] args) {
//		int x = 100;
//		double y = 1200.6;
//		int a = 0;
//		double b = 0;
//		short z = (short) 20000; // o short suporta at� 32727
//		byte t = 127; // o byte suporta at� 127
//
//		System.out.println(z);
//		System.out.println(t);
//
//		a = (int) y; // vai transformar o y(double) em inteiro -- tira a v�rgula
//		b = x; // vai transformar o b(int) em double -- pois � maior, tem mais espa�o, por isso
//				// que funciona
//
//		System.out.println(a);
//		System.out.println(b);
//
//		System.out.println("----------------------------------------------------------------------");
//
//		int idadepessoa = 61;
//
//		if (idadepessoa < 18) {
//			System.out.println("Voc� n�o pode beber"); // se o if tiver uma linha apenas, n�o precisa de chaves
//		} else if (idadepessoa < 60) {
//			System.out.println("Bora tomar uma");
//
//		} else {
//			System.out.println("Quanto � a sua aposentadoria?");
//
//		}
//		System.out.println("Voc� tem " + idadepessoa + " anos");

		System.out.println("----------------------------------------------------------------------");

//		int num = 9;
//
//		switch (num) {
//		case 1:
//			System.out.println("domingo");
//			break;
//		case 2:
//			System.out.println("segunda");
//			break;
//		case 3:
//			System.out.println("ter�a");
//			break;
//		case 4:
//			System.out.println("quarta");
//			break;
//		case 5:
//			System.out.println("quinta");
//			break;
//		case 6:
//			System.out.println("sexta");
//			break;
//		case 7:
//			System.out.println("s�bado");
//			break;
//		default: 
//			System.out.println("Esse n�mero n�o representa um dia da semana.");
//
//		}
//      System.out.println("----------------------------------------------------------------------");

//		
//		char caractere = 'b'; //aspas duplas representam caractere
//		switch (caractere) {
//		case 'a':
//			System.out.println("seu caractere � a");
//			break;
//		case 'b':
//			System.out.println("seu caractere � b");
//			break;
//		default:
//			System.out.println("valor inv�lido");
//			break;
//		}
//         System.out.println("----------------------------------------------------------------------");
//		
//		String farol = "verde";
//		switch (farol) {
//		case "vermelho":
//			System.out.println("Pare o carro!!");
//			break;
//		case "verde":
//			System.out.println("Siga!!");
//			break;
//		case "amarelo":
//			System.out.println("Aten��o!!");
//			break;
//		default: 
//			System.out.println("Valor inv�lido");
//
//		}		
		
//		int x = 0;
//		while (x < 10) {  //while: testa primeiro e faz depois
//			System.out.println(x);
//			x = x + 1;
//
//		}
		
//		x = 0;
//		do {            //do...while: faz primeiro, testa e se a cond��o for verdadeira, vai continuar a execu��o
//			System.out.println(x);
//			x=x+1;
//		} while(x<10);
		
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Qual n�mero deseja realizar a tabuada? ");
		
		int y;
		
		y = ler.nextInt();
		
		for(int x = 0; x < 11; x++) {
		System.out.println(y + "x" + x + " = " + x*y);
		
		}

	

	}

}
