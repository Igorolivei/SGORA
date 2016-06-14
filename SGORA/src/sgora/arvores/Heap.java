package sgora.arvores;

import sgora.arvores.InterfaceArvore;
import java.util.ArrayList;

/**
 * Classe que representa uma arvore Heap
 * @author Allan & Igor
 */
public class Heap implements InterfaceArvore{
    /**
     * Arranjo do heap
     */
    private ArrayList <NoHeap> arrayHeap = new ArrayList<NoHeap>();

    /**
     * 
     * @return 
     */
    public ArrayList<NoHeap> getArrayHeap() {
        return arrayHeap;
    }

    public void setArrayHeap(ArrayList<NoHeap> arrayHeap) {
        this.arrayHeap = arrayHeap;
    }    
    
    /**
     * Retorna o indice do pai de um n�
     * @param i
     * @return Indice do arrayList
     */
    public int pai(int i){
        return ((i-1)/2);
    }

    /**
    * Retorna o indice do filho esquerdo de um n�
    * @param i
    * @return Indice do arrayList
    */
    public int esquerdo(int i){
        return ((i*2)+1);
    }
    
    /**
     * Retorna o indice do filho de um n�
     * @param i
     * @return Indice do arrayList
     */
    public int direito(int i){
    	return ((i*2)+2);
    }
    
    /**
     * Sobe corrigindo a arvore
     * usado na inser��o
     * @param i
     */
    public void subir(int i){
    	if ((i > 0) && ( this.arrayHeap.get(this.pai(i)).getQuantidade() > this.arrayHeap.get(i).getQuantidade()) ){
        	NoHeap temp = this.arrayHeap.get(pai(i));
        	this.arrayHeap.set(this.pai(i), this.arrayHeap.get(i));
        	this.arrayHeap.set(i, temp);
        	this.subir(this.pai(i));
        }
    }
    
    /**
     * Desce corrigindo a arvore
     * usado na remo��o
     * @param i
     */
    public void descer(int i){
    	int filho;
    	if ( (this.direito(i) <= (arrayHeap.size()-1)) && (this.arrayHeap.get(this.direito(i)).getQuantidade() < this.arrayHeap.get(esquerdo(i)).getQuantidade()) ){
    		filho = this.direito(i);
    	}else{
    		filho = this.esquerdo(i);
    	}
    	if ( (filho <= (arrayHeap.size()-1)) && (this.arrayHeap.get(filho).getQuantidade() < this.arrayHeap.get(i).getQuantidade()) ){
    		NoHeap temp = this.arrayHeap.get(i);
        	this.arrayHeap.set(i, this.arrayHeap.get(filho));
        	this.arrayHeap.set(filho, temp);
        	this.descer(filho);
    	}
    }
    
    /**
     * Metodo que corrige a arvore a partir de um indice.
     * @param i
     */
    public void heapify(int i){
    	int l = this.esquerdo(i);
    	int r = this.direito(i);
    	int menor;
    	if ( (l <= (this.arrayHeap.size()-1) ) && (this.arrayHeap.get(l).getQuantidade() < this.arrayHeap.get(i).getQuantidade()) ){
    		menor = l;
    	}else{
    		menor = i;
    	}
    	if ( (r <= (this.arrayHeap.size()-1)) && (this.arrayHeap.get(r).getQuantidade() < this.arrayHeap.get(menor).getQuantidade()) ){
    		menor = r;
    	}
    	if(menor != i){
    		NoHeap temp = this.arrayHeap.get(i);
        	this.arrayHeap.set(i, this.arrayHeap.get(menor));
        	this.arrayHeap.set(menor, temp);
        	this.heapify(menor);
    	}
    }
    
    /**
     * M�todo que insere um elemento elemento.
     */
    @Override
    public void inserir(NoHeap novoNo) {
        this.arrayHeap.add(novoNo);
        this.subir(this.arrayHeap.size()-1);
    }
    /**
     * M�todo que remove o menor elemento.
     */
    @Override
    public void remover() {
        this.arrayHeap.set(0, this.arrayHeap.get(this.arrayHeap.size()-1));
        this.arrayHeap.remove((this.arrayHeap.size()-1));
        this.descer(0);
    }

    @Override
    public void imprimir() {
       
    }
    
    public String imprimirLista() {
        String lista = "";
        for (int i = 0; i < this.arrayHeap.size(); i++){
            lista = lista + this.arrayHeap.get(i).toString();
        }
        return lista;
    }

	@Override
	public void inserir(NoAVL no) {
		// TODO Auto-generated method stub
		
	}        
    
}
