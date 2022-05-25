import java.util.Scanner;  //Importando a classe Scanner para receber informação do usuário

public class Aplicacao { 

	public static void main(String[] args) {  //classe main

		Scanner scanner = new Scanner(System.in);  //Instanciar e criar um objeto Scanner:

		Matematica matematica = new Matematica(); 	//Instanciar e criar um objeto matyematica:

		System.out.println("Digite a base");   //imprimir informação na tela

		int x = scanner.nextInt();

		System.out.println("Digite a altura");  //imprimir informação na tela

		int y = scanner.nextInt();

		
		if (x == y) {  //condição lógica para saber qual é a forma geométrica que precisa descobrir a área
			int area = matematica.calculararea(x);
			System.out.println("A área do quadrado é " + area );   //imprimir informação na tela
			
		}
		else  {
			double area = matematica.calculararea(x, y);
			System.out.println("A área do triângulo é " + area );   //imprimir resultado da área na tela
			int area = matematica.calculararea(x, y);
			System.out.println("A área do retângulo é " + area );   //imprimir resultado da área na tela
		}
		

}
}
