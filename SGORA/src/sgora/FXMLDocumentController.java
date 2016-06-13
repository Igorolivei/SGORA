/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author Cynthia
 */
public class FXMLDocumentController implements Initializable {
    
    Heap heap = new Heap();
    int count = 0;
    TabelaHeap lista = new TabelaHeap(heap.getArrayHeap());
    
    @FXML
    private TextField campoNome;
    
    @FXML
    private TextField campoEspecie;
    
    @FXML
    private RadioButton radioMacho;
    
    @FXML
    private RadioButton radioFemea;
    
    @FXML
    private TextField campoQuantidade;
    
    @FXML
    private TableView<NoHeap> listaDeAnimais;
    
    @FXML
    private TableColumn<NoHeap,String> tabelaNomeAnimal;
    
    @FXML
    private TableColumn<NoHeap,String> tabelaQuantidadeAnimal;
        
    @FXML
    private void handleButtonAction(ActionEvent event) {
        count++;
        Animal novoAnimal = new AnimalTerrestre(count, campoNome.getText(), campoEspecie.getText());
        NoHeap novoNo = new NoHeap(novoAnimal,Integer.parseInt(campoQuantidade.getText()));
        heap.inserir(novoNo);
        lista.atualizaTabela(heap.getArrayHeap());
        heap.imprimir();
    }
    
    @FXML
    private void initialize() {
        // Inicializa a tablea de pessoa com duas colunas.
        listaDeAnimais.getColumns().addAll(tabelaNomeAnimal, tabelaQuantidadeAnimal);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
