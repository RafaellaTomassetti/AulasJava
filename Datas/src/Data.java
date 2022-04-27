
public class Data {
	private int dia;
	private int mes;
	private int ano;
	private int hora;
	private int min;
	private int seg;
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
	}

	public Data(int dia, int mes, int ano, int hora, int min, int seg) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.hora = hora;
		this.min = min;
		this.seg = seg;
	}
	
	
	public void imprimir(int dia, int mes, int ano, int hora, int min, int seg) {
		System.out.println(dia + "/" + mes + "/" + ano + "   " + hora + ":" + min + ":" + seg);
	}
	public void imprimir(int dia, int mes, int ano) {
		System.out.println(dia + "/" + mes + "/" + ano);
	}
}
