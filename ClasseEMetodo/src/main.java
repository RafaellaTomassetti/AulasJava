import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		Cor cor = new Cor();
		Menu menu = new Menu();

		while (menu.getOpcao() != 2) {

			System.out.println("Escolha o que fazer no menu:");
			System.out.println("1- ESCOLHER UMA COR\n 2- SAIR DO PROGRAMA");

			menu.setOpcao(scanner2.nextInt());

			if (menu.getOpcao() == 1) {

				System.out.println("Digite o número de uma cor: ");
				System.out.println(" 1- AMARELO\n 2- VERDE\n 3- VERMELHO\n 4- ROSA\n 5- PRETO\n 6-AZUL");

				cor.setNumero(scanner2.nextInt());

				switch (cor.getNumero()) {
				case 1:
					System.out.println(
							"Por ser uma cor quente, o amarelo também transmite a sensação de dinamismo e estímulo.\n "
									+ "Considerada a cor do otimismo e da energia, segundo a psicologia das cores.\n "
									+ "Tem ainda a capacidade de estimular a concentração e o intelecto das pessoas.");
					break;

				case 2:
					System.out.println(
							"Para a psicologia das cores, o verde está associado com a saúde, a vitalidade, a natureza e fertilidade.\n"
									+ " Para os psicólogos, essa cor possui a capacidade de acalmar as pessoas e aliviar o stress.");
					break;

				case 3:
					System.out.println(
							"Essa cor primária está ligada ao dinamismo, ou seja, a vontade de se movimentar e agir.\n"
									+ "Experiências mostram que o vermelho tem a capacidade de estimular o corpo humano, fazendo com que \n"
									+ " ocorra um aumento na pressão sanguínea e do número de batimentos cardíacos, por exemplo.");

					break;

				case 4:
					System.out.println(
							"O rosa possui grande personalidade própria, sendo que alguns sentimentos só se descrevem\n "
									+ "com o rosa, com grande predominância de associações positivas, tais como o doce, a cortesia, o\n "
									+ "charme e a ternura.");
					break;

				case 5:
					System.out.println(
							"O preto é a cor mais poderosa e neutra. Tende a ser associada à elegância e força.\n"
									+ " Assim como o violeta, essa cor transmite a sensação de mistério, além de ser relacionada ao medo, curiosidade e, algumas vezes, memória emocional.\n"
									+ " Além disso, é considerado um tom masculino e impessoal.");
					break;

				case 6:
					System.out.println("O azul transmite a ideia de calma, serenidade e tranquilidade.\n"
							+ "Por esse motivo, costuma ser comum o seu uso para representar profissionalismo, estabilidade e segurança.\n");
					break;
				default:
					System.out.println("Esse número não representa uma cor");

				}

			} else {

				System.out.println("Programa finalizado");

			}
		}

	}
}
