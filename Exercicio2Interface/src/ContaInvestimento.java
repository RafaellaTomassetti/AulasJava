
public class ContaInvestimento extends ContaBancaria {


	@Override
	public double calcularSaldo() {
		double saldofinal;
		saldofinal = getSaldo()*1.05; //saldo acrescido de 5%
		System.out.println("Seu saldo final na Conta investimento é R$ " + saldofinal);
		return saldofinal;
		
		
	}
	
}
