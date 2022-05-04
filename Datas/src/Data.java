
public class Data {
	public static final int FORMATO_12H = 1;
	public static final int FORMATO_24H = 2;

	private int dia;
	private int mes;
	private int ano;
	private int hora = -1;
	private int min = -1;
	private int seg = -1;

	// Construtor que recebe dia, mes e ano
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public Data(int dia, int mes, int ano, int hora, int min, int seg) {
		this(dia, mes, ano);
		this.hora = hora;
		this.min = min;
		this.seg = seg;
	}
	
	public void imprimir(int formato) {
		String data = dia + "/" + mes + "/" + ano;
				
		if(hora == -1) {
			System.out.println(data);
		} else {
			String horario = ":" + min + ":" + seg;
				
			if (formato == FORMATO_24H) {
				horario = hora + horario;
			} else {
				// Se o formato for 12h
				if (hora == 0) {
					horario = 12 + horario;
					horario += " AM";
				} else if (hora >=12) {
					// Se hora for maior ou igual a 12, é preciso subtrair 12 da hora para obter 
					// a hora no formato 12h, e concatena o "PM" no fim
					horario = (hora - 12) + horario;
					horario += " PM";
				} else {
					// Se a hora for menor que 12, simplesmente utiliza a própria hora e concatena
					// o "AM" no fim
					horario = hora + horario;
					horario += " AM";

				}
				
			}
			// Imprime a data/hora formatada
						System.out.println(data + " " + horario);

		}
	}

	public int getDia() {
		return dia;
	}


	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	public int getHora() {
		return hora;
	}

	public int getMin() {
		return min;
	}

	public int getSeg() {
		return seg;
	}

}

	
