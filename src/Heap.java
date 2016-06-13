package SGORA;
import java.util.ArrayList;

/**
 * Classe que representa uma arvore Heap
 * @author Allan & Igor
 */
public class Heap implements InterfaceArvore{
    
    
    /**
    * Atributo que aponta para o nó filho da esquerda.
    */
    public ArrayList <NoHeap> arrayHeap = new ArrayList<NoHeap>();
    /**
    * Atributo que aponta para o nó cabeça.
    */
    private NoHeap head;
      
    /**
    * Construtor da classe.
    */
    public Heap() {
        this.head = null;
    }
    
    /**
    * Construtor da classe.
    */
    public Heap(NoHeap head) {
        this.head = head;
    }
    
    /**
     * Retorna o indice do pai de um nó
     * @param i
     * @return Indice do arrayList
     */
    public NoHeap pai(int i){
        return arrayHeap.get(i/2);
    }

    /**
    * Retorna o indice do filho esquerdo de um nó
    * @param i
    * @return Indice do arrayList
    */
    public int esquerdo(int i){
        return (i*2);
    }
    
    /**
     * Retorna o indice do filho de um nó
     * @param i
     * @return Indice do arrayList
     */
    public int direito(int i){
        return (i*2+1);
    }
    
    public void subir(int i, int n){
        
    }
    
    @Override
    public void inserir(NoHeap no) {
        
    }

    @Override
    public void remover() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
