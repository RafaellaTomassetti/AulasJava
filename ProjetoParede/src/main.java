import java.util.Scanner;

public class main {

	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	Parede parede = new Parede();
    Azulejo azulejo = new Azulejo();
    
    System.out.println("Digite a altura da parede: ");
    parede.setHp(scanner.nextDouble());
    
    System.out.println("Digite a largura da parede: ");
    parede.setLp(scanner.nextDouble());
    
    System.out.println("Digite a altura do azulejo: ");
    azulejo.setHa(scanner.nextDouble());
    
    System.out.println("Digite a largura do azulejo: ");
    azulejo.setLa(scanner.nextDouble());
	
    double areaParede = parede.getHp() * parede.getLp();
    double areaAzulejo = azulejo.getHa() * azulejo.getLa();
    
    double numeroAzulejos = areaParede/areaAzulejo; 
    System.out.println("A quantidade de azulejos necessários para cobrir uma parede de " + areaParede + " metros quadrados é: " + numeroAzulejos );
	}

}
