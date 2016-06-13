package SGORA;

/**
 * Classe que representa um nó de uma arvore Heap
 * @author Allan & Igor
 */
public class NoHeap{
    
    /**
     * Atributo que representa o conteudo de um nó
     */
    private Animal animal;
    /**
    * Atributo que representa a quantidade de animais
    */
    private int quantidade;

    /**
    * Construtor da classe
    */
    public NoHeap(Animal animal, int quantidade) {
        this.animal = animal;
        this.quantidade = quantidade;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }   
    
}