
public class Main {

	public static void main(String[] args) {

		Média nota1 = new Média(); // criando a variável e instanciando o objeto pessoa
		Média.nota1 = 8.5;

		nota1.multiplicar1(8.5);

		Média nota2 = new Média();
		Média.nota2 = 7.5;
		nota2.multiplicar2(7.5);

		Média nota3 = new Média();
		Média.nota3 = 6;
		nota3.multiplicar3(6);

	}

}
