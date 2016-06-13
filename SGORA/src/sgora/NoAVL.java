package sgora;

public class NoAVL{

	private Animal animal;
	private int altura;
	private NoAVL filhoEsquerdo;
	private NoAVL filhoDireito;
	
	public NoAVL(int altura) {
		this.altura = altura; 
	}
	
	public NoAVL(Animal animal, int altura, NoAVL filhoEsquerdo, NoAVL filhoDireito) {
		this.animal = animal;
		this.altura = altura;
		this.filhoEsquerdo = filhoEsquerdo;
		this.filhoDireito = filhoDireito;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public NoAVL getFilhoEsquerdo() {
		return filhoEsquerdo;
	}

	public void setFilhoEsquerdo(NoAVL filhoEsquerdo) {
		this.filhoEsquerdo = filhoEsquerdo;
	}

	public NoAVL getFilhoDireito() {
		return filhoDireito;
	}

	public void setFilhoDireito(NoAVL filhoDireito) {
		this.filhoDireito = filhoDireito;
	}
	
	
}
