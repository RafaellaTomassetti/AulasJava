import java.util.Scanner ;

public class main {

	public static void main(String[] args) {
//		int x = 100;
//		double y = 1200.6;
//		int a = 0;
//		double b = 0;
//		short z = (short) 20000; // o short suporta até 32727
//		byte t = 127; // o byte suporta até 127
//
//		System.out.println(z);
//		System.out.println(t);
//
//		a = (int) y; // vai transformar o y(double) em inteiro -- tira a vírgula
//		b = x; // vai transformar o b(int) em double -- pois é maior, tem mais espaço, por isso
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
//			System.out.println("Você não pode beber"); // se o if tiver uma linha apenas, não precisa de chaves
//		} else if (idadepessoa < 60) {
//			System.out.println("Bora tomar uma");
//
//		} else {
//			System.out.println("Quanto é a sua aposentadoria?");
//
//		}
//		System.out.println("Você tem " + idadepessoa + " anos");

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
//			System.out.println("terça");
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
//			System.out.println("sábado");
//			break;
//		default: 
//			System.out.println("Esse número não representa um dia da semana.");
//
//		}
//      System.out.println("----------------------------------------------------------------------");

//		
//		char caractere = 'b'; //aspas duplas representam caractere
//		switch (caractere) {
//		case 'a':
//			System.out.println("seu caractere é a");
//			break;
//		case 'b':
//			System.out.println("seu caractere é b");
//			break;
//		default:
//			System.out.println("valor inválido");
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
//			System.out.println("Atenção!!");
//			break;
//		default: 
//			System.out.println("Valor inválido");
//
//		}		
		
//		int x = 0;
//		while (x < 10) {  //while: testa primeiro e faz depois
//			System.out.println(x);
//			x = x + 1;
//
//		}
		
//		x = 0;
//		do {            //do...while: faz primeiro, testa e se a condção for verdadeira, vai continuar a execução
//			System.out.println(x);
//			x=x+1;
//		} while(x<10);
		
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Qual número deseja realizar a tabuada? ");
		
		int y;
		
		y = ler.nextInt();
		
		for(int x = 0; x < 11; x++) {
		System.out.println(y + "x" + x + " = " + x*y);
		
		}

	

	}

}
