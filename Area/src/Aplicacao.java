import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Matematica matematica = new Matematica();

		System.out.println("Digite a base");

		int x = scanner.nextInt();

		System.out.println("Digite a altura");

		int y = scanner.nextInt();

		
		if (x == y) {
			int area = matematica.calculararea(x);
			System.out.println("A área do quadrado é " + area );
			
		}
		else  {
			double area = matematica.calculararea(x, y);
			System.out.println("A área do triângulo é " + area );
		}
		

}
}
