
public class main {
	
	public static final double PI = 3.14;  //determina que � constante

	private enum Sexo{   //Criando enum dentro da pr�pria classe
		MASCULINO, FEMININO  //definindo constantes
	}
	
	public static void main(String[] args) {

		double pi = main.PI;
		
		DiaDaSemana hoje = DiaDaSemana.SEGUNDA;  //S� CONSEGUE COLOCAR O ENDERE�O DE UM OBJETO 
		
		int num = DiaDaSemana.SEGUNDA.getNum();
		System.out.println(num);
		
		String s = "TERCA";
		hoje = DiaDaSemana.valueOf(s); //vai procurar a lista de constantes de DiaDaSemana um valor que corresponda 
		//nesse caso, vai tentar encontrar um valor parecido com "TERCA"
		
		System.out.println(hoje.getNum());//vai mostrar o n�mero correspondente ao dia 
		
		//CRIA��O DE ENUM DENTRO DA CLASSE
		
		Sexo sexo = Sexo.MASCULINO;
		sexo = Sexo.FEMININO;

	

}
}
