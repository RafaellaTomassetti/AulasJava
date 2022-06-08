import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) throws IOException {
		
		List<Aluno> listaDeAlunos = new ArrayList<Aluno>();
		
		Professor professor1 = new Professor("Rafael", 1111111, 4000);
		Professor professor2 = new Professor("Mayara", 2222222, 4000);

		Curso curso1 = new Curso("Elétrica", 100, 1, professor1);
		Curso curso2 = new Curso("Desenvolvimento de Sistemas", 100, 1, professor2);

		
		Aluno aluno1 = new Aluno("Sofia", 333333, 0 ,curso1, FormaPag.A_VISTA);
		listaDeAlunos.add(aluno1);
		Aluno aluno2 = new Aluno("Pedro", 444444, 0, curso1, FormaPag.CARNÊ);
		listaDeAlunos.add(aluno2);
		Aluno aluno3 = new Aluno("Rafaella", 555555, 0, curso2, FormaPag.A_VISTA);
		listaDeAlunos.add(aluno3);
		Aluno aluno4 = new Aluno("Matheus", 666666, 0, curso2, FormaPag.CARTAO_CREDITO);
		listaDeAlunos.add(aluno4);
		
		
		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("entrada.txt"))) {													
			
			for (Aluno aluno : listaDeAlunos) { 
				
				escrever.write(aluno.toString()); 
		}
		
		
		for (Aluno alunos: listaDeAlunos) {
		System.out.println("O/A aluno(a) " + alunos.getNome() + ", portador do cpf " + alunos.getCpf() + ", está matriculado no curso de " + alunos.getCurso().getTitulo() + ".");
		System.out.println("Seu/sua professor(a) será " + alunos.getCurso().getProfessor().getNome() );
		System.out.println("Sua forma de pagamento será " + alunos.getFormaPag());
		System.out.println("Com valor total de " + alunos.getValorPagarCurso());
		System.out.println("-------------------------------------------------------------------------------");
		}
		

	}
}
}
