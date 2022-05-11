
public class Aplicacao {

	public static void main(String[] args) {

		ContaCorrente contacorrente = new ContaCorrente();
		contacorrente.depositar(200);
		contacorrente.transferir(350);
		contacorrente.sacar(1000);
		contacorrente.calcularSaldo();
		System.out.println();
		
		ContaInvestimento containvestimento = new ContaInvestimento();
		containvestimento.depositar(30);
		containvestimento.transferir(40);
		containvestimento.sacar(20);
		containvestimento.calcularSaldo();

		
	}

}
