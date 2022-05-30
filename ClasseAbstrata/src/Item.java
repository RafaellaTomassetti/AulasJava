
public abstract class Item { //classe abstrata não cria objetos e nem tem IMPLEMENTAÇÃO DE CÓDIGO
	
	private int posicaoX = 1;  //atributos privados
	private int posicaoY = 1;
	
	public abstract void pegar();  //todos que herdarem a classe ITEM, devem ter o método pegar
	//classe abstrata só tem a assinatura (;)
	//se fosse implementar, teriam as chaves ({})
	
	
	//Getter and Setter//

	public int getPosicaoX() {
		return posicaoX;
	}

	public void setPosicaoX(int posicaoX) {
		this.posicaoX = posicaoX;
	}

	public int getPosicaoY() {
		return posicaoY;
	}

	public void setPosicaoY(int posicaoY) {
		this.posicaoY = posicaoY;
	}
	

}
