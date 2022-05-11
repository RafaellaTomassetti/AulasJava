
public class ContaCorrente extends ContaBancaria{

	@Override
	public double calcularSaldo() {
		double saldofinal;
		saldofinal = getSaldo()*0.90; //saldo menos 10%
		System.out.println("Seu saldo final na Conta Corrente é R$ " + saldofinal);
		return saldofinal;
	}

	

}
