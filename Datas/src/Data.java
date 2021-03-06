
public class Data { // classe pública Data
	public static final int FORMATO_12H = 1;
	public static final int FORMATO_24H = 2;
	// final em Java serve para atribuir valores constantes, ou seja,
	// que a partir da sua declaração, seus valores não poderão mais serem
	// alterados,
	// mesmo com a visibilidade pública

	// atributos da classe
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
	// Construtor completo, que recebe informações de data e horário

	public Data(int dia, int mes, int ano, int hora, int min, int seg) {
		// Chama o outro construtor da classe
		this(dia, mes, ano);
		this.hora = hora;
		this.min = min;
		this.seg = seg;
	}

	// Imprime a data/hora formatada (de acordo com o formato especificado)
	public void imprimir(int formato) {
		// Monta a string de impressão de data
		String data = dia + "/" + mes + "/" + ano;

		if (hora == -1) {
			// Se hora for -1, significa que os dados de horário não foram passado no
			// construtor.
			// Então exibe só a data
			System.out.println(data); // imprime a data

		} else { // nesse caso a hora foi passada no construtor, então ela é diferente de -1
			// Monta parte da string da horário (deixa a hora de fora por enquanto)

			String horario = ":" + min + ":" + seg; // nova variável que guarda o minuto e segundo

			if (formato == FORMATO_24H) { // FORMATAÇÃO DA HORA
				// Se o formato for 24h, concatena a hora no início da string (o atributo já foi
				// fornecido no formato 24h)

				horario = hora + horario;
			} else {
				// Se o formato for 12h
				if (hora == 0) { // se a hora for 0, ela ficará valendo 12 e aparecerá o AM no final
					horario = 12 + horario;
					horario += " AM";
				} else if (hora >= 12) {
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

//Métodos getters para acessar os atributos privados da classe
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
