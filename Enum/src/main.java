
public class main {
	
	public static final double PI = 3.14;  //determina que é constante

	private enum Sexo{   //Criando enum dentro da própria classe
		MASCULINO, FEMININO  //definindo constantes
	}
	
	public static void main(String[] args) {

		double pi = main.PI; //salvando a constante PI da classe main na variável 'pi'
		
		DiaDaSemana hoje = DiaDaSemana.SEGUNDA;  //SÓ CONSEGUE COLOCAR O ENDEREÇO DE UM OBJETO 
		
		int num = DiaDaSemana.SEGUNDA.getNum();  //num está recebendo o número que representa o dia da semana SEGUNDA
		System.out.println(num); //mostrando na tela o número que representa o dia da semana SEGUNDA
		
		String s = "TERCA";  //s recebe a string 
		hoje = DiaDaSemana.valueOf(s); //vai procurar a lista de constantes de DiaDaSemana um valor que corresponda 
		//nesse caso, vai tentar encontrar um valor parecido com "TERCA"
		
		System.out.println(hoje.getNum());//vai mostrar o número correspondente ao dia 
		
		//CRIAÇÃO DE ENUM DENTRO DA CLASSE
		
		Sexo sexo = Sexo.MASCULINO ;  //variável sexo do enum Sexo que recebe MASCULINO
		sexo = Sexo.FEMININO;  //variável sexo do enum Sexo que recebe FEMININO

	

}
}
