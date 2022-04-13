
public class Pessoa {

	String nome;
	int numFigurinhas;
	
	void receber (int numFigurinhas) {
		this.numFigurinhas  += numFigurinhas;
	}
	
	boolean dar (int numFigurinhas, Pessoa pessoa) {
	
		
		 if (numFigurinhas > this.numFigurinhas) { 
		        System.out.println("Você não tem figurinhas suficientes para dar para " + pessoa.nome);
		       return  false; // retorno booleano
		        
		        
		     } else {
		        System.out.println("Você tem figurinhas suficientes para dar para " + pessoa.nome);
		    	this.numFigurinhas  -= numFigurinhas;
				pessoa.receber(numFigurinhas);	
				return true;   // retorno booleano
		     }
		 
		 
	
				
	}
	
	
	
}
