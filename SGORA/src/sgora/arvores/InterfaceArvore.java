package sgora.arvores;

/**
 * Interface responsável por definir métodos comuns para as arvores.
 * @author Allan & Igor
 */
public interface InterfaceArvore {
    
    /**
     * Método responsável por inserir um NÓ em uma arvore
     * @param no
     */
    public void inserir(NoHeap no);
    /**
     * Método responsável remover um NÓ em uma arvore
     */
    
    public void inserir(NoAVL no);
    /**
     * Método responsável remover um NÓ em uma arvore
     */
    public void remover();
    /**
     * Método responsável imprimir uma arvore
     */
    void imprimir();
}
