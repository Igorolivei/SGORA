/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgora;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * Controller da aplicação
 * @author Allan & Igor
 */
public class FXMLDocumentController implements Initializable {
    

    Heap heap = new Heap();
    int count = 0;
    
    @FXML
    private Label mensagem;
    
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
    private RadioButton radioTerrestre;
        
    @FXML
    private RadioButton radioAquatico;
            
    @FXML
    private RadioButton radioAereo;
    
    @FXML
    private TextArea listaDeAnimais;
    
    @FXML
    private TableColumn<NoHeap,String> tabelaNomeAnimal;
    
    @FXML
    private TableColumn<NoHeap,String> tabelaQuantidadeAnimal;
        
    @FXML
    private void handleButtonAction(ActionEvent event) {
        count++;
        String sexo;
        if (radioMacho.isSelected() == true){
            sexo = "Macho";
        }else{
            sexo = "Femea";
        }
       
        if(radioTerrestre.isSelected() == true){
            
            Animal novoAnimal = new AnimalTerrestre(count, campoNome.getText(), campoEspecie.getText(),sexo);
            NoHeap novoNo = new NoHeap(novoAnimal,Integer.parseInt(campoQuantidade.getText()));
            heap.inserir(novoNo);
            campoNome.setText("");
            campoEspecie.setText("");
            campoQuantidade.setText("");
            
                                    
        }else if (radioAquatico.isSelected() == true){
            Animal novoAnimal = new AnimalAquatico(count, campoNome.getText(), campoEspecie.getText(),sexo);
            NoHeap novoNo = new NoHeap(novoAnimal,Integer.parseInt(campoQuantidade.getText()));
            heap.inserir(novoNo);
            campoNome.setText("");
            campoEspecie.setText("");
            campoQuantidade.setText("");
            
        }else{
            Animal novoAnimal = new AnimalTerrestre(count, campoNome.getText(), campoEspecie.getText(),sexo);
            NoHeap novoNo = new NoHeap(novoAnimal,Integer.parseInt(campoQuantidade.getText()));
            heap.inserir(novoNo);
            campoNome.setText("");
            campoEspecie.setText("");
            campoQuantidade.setText("");
        }
    }
    
    @FXML
    private void initialize() {
        // Inicializa a tablea de pessoa com duas colunas.
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
                 
    }
    
}
