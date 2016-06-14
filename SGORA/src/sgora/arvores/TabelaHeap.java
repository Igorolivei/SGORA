package sgora.arvores;

import sgora.arvores.NoHeap;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Allan
 */
public class TabelaHeap {
    
    private ObservableList<NoHeap> tabela = FXCollections.observableArrayList();

    public TabelaHeap(ArrayList<NoHeap> listaHeap) {
        for (int i = 0; i < listaHeap.size(); i++){
            this.tabela.add(listaHeap.get(i));
        }
    }
    
    public void atualizaTabela(ArrayList<NoHeap> listaHeap) {
        this.tabela.clear();
        for (int i = 0; i < listaHeap.size(); i++){
            this.tabela.add(listaHeap.get(i));
        }
    }

}
