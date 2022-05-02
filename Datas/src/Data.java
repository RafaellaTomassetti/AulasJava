
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

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getSeg() {
		return seg;
	}

	public void setSeg(int seg) {
		this.seg = seg;
	}

	public Data(int dia, int mes, int ano, int hora, int min, int seg) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.hora = hora;
		this.min = min;
		this.seg = seg;
	}

	public static final double FORMATO_12H;

	static {
		FORMATO_12H = (dia + "/" + mes + "/" + ano + "   " + hora + ":" + min + ":" + seg);
	}
	public static final double FORMATO_24H;

	static {
		FORMATO_24H =(dia + "/" + mes + "/" + ano + "   " + hora + ":" + min + ":" + seg);
	}

	public void imprimir(int dia, int mes, int ano, int hora, int min, int seg) {
		System.out.println(dia + "/" + mes + "/" + ano + "   " + hora + ":" + min + ":" + seg);
	}

	public void imprimir(int dia, int mes, int ano) {
		System.out.println(dia + "/" + mes + "/" + ano);
	}

}
