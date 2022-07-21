import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Produto produto = new Produto();
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		Menu menu = new Menu();
		
		while (menu.getOpcao() != 2) {

		System.out.println("Escolha o que fazer no menu:");
		System.out.println("1- CALCULAR VALOR DO PRODUTO\n 2- SAIR DO PROGRAMA");
		menu.setOpcao(scanner2.nextInt());

		if (menu.getOpcao() == 1) {
		
		System.out.println("Qual produto desejado?");
		produto.setNome(scanner.next());
		
		System.out.println("Qual valor produto desejado?");
		produto.setValor(scanner.nextDouble());	
		
		System.out.println("Qual a porcentagem de desconto do produto desejado?");
		produto.setPorcentagemdesconto(scanner.nextDouble());	
		
		System.out.println(produto.calculardesconto());
		

		}
	 else {

	System.out.println("Programa finalizado");
}

}
	}
}