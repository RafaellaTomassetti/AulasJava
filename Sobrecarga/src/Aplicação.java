import java.util.Scanner;

public class Aplicação {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);   //scanner para receber informação do usuário	
				
		Matematica matematica = new Matematica();  //instanciando objeto
		
		System.out.println("Somar dois números");   //imprimir informação na tela
		System.out.println("Digite o primeiro número");
		
		int x = scanner.nextInt();   //salva o que o usuário digitar nessa variável

		System.out.println("Digite o segundo número");//imprimir informação na tela
		
		int y = scanner.nextInt(); //salva o que o usuário digitar nessa variável
		
	

		int soma = matematica.somar(x, y); //nova variável que vai salvar a soma dos 2 valores INTEIROS
		System.out.println("O resultado é " + soma + "!!!");  //imprimir na tela o resultado da soma

		soma = matematica.somar(x, y, 5); // variável que vai salvar a soma dos 3 valores INTEIROS
		System.out.println("O resultado é " + soma + "!!!");
		
		double soma2 = matematica.somar(x, y); // variável que vai salvar a soma dos 2 valores DOUBLE
		System.out.println("O resultado é " + soma2 + "!!!");


	}

}
