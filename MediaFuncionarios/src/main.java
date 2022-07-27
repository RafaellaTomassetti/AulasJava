import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		SetorEmpresa financeiro = new SetorEmpresa();
		SetorEmpresa compras = new SetorEmpresa();
		SetorEmpresa RH = new SetorEmpresa();
		SetorEmpresa vendas = new SetorEmpresa();

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de funcionários do setor FINANCEIRO");
		financeiro.setQtdeFuncionario(scanner.nextInt());
		
		System.out.println("Digite o salário dos funcionários do setor FINANCEIRO");
		financeiro.setSalario(scanner.nextDouble());
		
		double mediaFinanceiro = financeiro.getQtdeFuncionario() * financeiro.getSalario();
				
		System.out.println("Digite a quantidade de funcionários do setor COMPRAS");
		compras.setQtdeFuncionario(scanner.nextInt());
		
		System.out.println("Digite o salário dos funcionários do setor COMPRAS");
		compras.setSalario(scanner.nextDouble());
		
		double mediaCompras = compras.getQtdeFuncionario() * compras.getSalario();
		
		System.out.println("Digite a quantidade de funcionários do setor RH");
		RH.setQtdeFuncionario(scanner.nextInt());
		
		System.out.println("Digite o salário dos funcionários do setor RH");
		RH.setSalario(scanner.nextDouble());
		
		double mediaRH = RH.getQtdeFuncionario() * RH.getSalario();

		System.out.println("Digite a quantidade de funcionários do setor VENDAS");
		vendas.setQtdeFuncionario(scanner.nextInt());
		
		System.out.println("Digite o salário dos funcionários do setor VENDAS");
		vendas.setSalario(scanner.nextDouble());
		
		double mediaVendas = vendas.getQtdeFuncionario() * vendas.getSalario();
	
	
	double media = (mediaFinanceiro + mediaCompras + mediaRH + mediaVendas)/4 ;
	System.out.println("A média salarial da empresa é: " + media);
}
}
