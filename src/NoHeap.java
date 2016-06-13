/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SGORA;

/**
 * Classe que representa um Nó de uma arvore Heap
 * @author Allan & Igor
 */
public class NoHeap{
    
    /**
     * Atributo que representa o conteudo de um NÓ
     */
    private Animal animal;
    /**
    * Atributo que representa a quantidade de animais
    */
    private int quantidade;
    /**
    * Atributo que aponta para o nó filho da esquerda.
    */
    private NoHeap filhoEsquerdo;
    /**
    * Atributo que aponta para o nó filho da direita.
    */
    private NoHeap filhoDireito;

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

    public NoHeap getFilhoEsquerdo() {
        return filhoEsquerdo;
    }

    public void setFilhoEsquerdo(NoHeap filhoEsquerdo) {
        this.filhoEsquerdo = filhoEsquerdo;
    }

    public NoHeap getFilhoDireito() {
        return filhoDireito;
    }

    public void setFilhoDireito(NoHeap filhoDireito) {
        this.filhoDireito = filhoDireito;
    }
    
    
}