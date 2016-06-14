/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgora.gui;

import sgora.arvores.NoHeap;
import sgora.arvores.Heap;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import sgora.Animal;
import sgora.AnimalAquatico;
import sgora.AnimalTerrestre;

/**
 * Controller da aplicação
 * @author Allan & Igor
 */
public class FXMLDocumentController implements Initializable {
    
    ArrayList<Animal> animaisExtintos = new ArrayList<Animal>();
    ArrayList<Animal> animaisRiscoExtincao = new ArrayList<Animal>();
    String extintos;
    String riscoExtincao;
    String todos;
    Heap heap = new Heap();
    int count = 0;
    
    @FXML
    private Label mensagem;
    
    @FXML
    private TextField campoNome;
    
    @FXML
    private TextField campoEspecie;
    
    @FXML
    private TextField campoQuantMacho;
    
    @FXML
    private TextField campoQuantFemea;
    
    @FXML
    private RadioButton radioTerrestre;
        
    @FXML
    private RadioButton radioAquatico;
            
    @FXML
    private RadioButton radioAereo;
    
    @FXML
    private TextArea listaDeAnimais;
    
    @FXML
    private TextArea listaDeAnimaisExtincao;
        
    @FXML
    private void handleButtonAction(ActionEvent event) {
        count++;
       
        if(radioTerrestre.isSelected() == true){
            
            Animal novoAnimal = new AnimalTerrestre(count, campoNome.getText(), campoEspecie.getText(), Integer.parseInt(campoQuantMacho.getText()), Integer.parseInt(campoQuantFemea.getText()));
            NoHeap novoNo = new NoHeap(novoAnimal,(Integer.parseInt(campoQuantMacho.getText())+Integer.parseInt(campoQuantFemea.getText())));
            heap.inserir(novoNo);
            campoNome.setText("");
            campoEspecie.setText("");
            campoQuantMacho.setText("");
            campoQuantFemea.setText("");
            
                                    
        }else if (radioAquatico.isSelected() == true){
            Animal novoAnimal = new AnimalAquatico(count, campoNome.getText(), campoEspecie.getText(), Integer.parseInt(campoQuantMacho.getText()), Integer.parseInt(campoQuantFemea.getText()));
            NoHeap novoNo = new NoHeap(novoAnimal,(Integer.parseInt(campoQuantMacho.getText())+Integer.parseInt(campoQuantFemea.getText())));
            heap.inserir(novoNo);
            campoNome.setText("");
            campoEspecie.setText("");
            campoQuantMacho.setText("");
            campoQuantFemea.setText("");
            
        }else{
            Animal novoAnimal = new AnimalTerrestre(count, campoNome.getText(), campoEspecie.getText(), Integer.parseInt(campoQuantMacho.getText()), Integer.parseInt(campoQuantFemea.getText()));
            NoHeap novoNo = new NoHeap(novoAnimal,(Integer.parseInt(campoQuantMacho.getText())+Integer.parseInt(campoQuantFemea.getText())));
            heap.inserir(novoNo);
            campoNome.setText("");
            campoEspecie.setText("");
            campoQuantMacho.setText("");
            campoQuantFemea.setText("");
        }
        extintos = "Animais extintos (0 exemplares ou exemplares de apenas um sexo): \n";
        riscoExtincao = "Animais com risco de extinção (há casais, mas menos de 10 exemplares):\n";
        todos = "";
        initialize();
    }
    
    @FXML
    private void initialize() {
        
        ArrayList<NoHeap> nos = heap.getArrayHeap();
        
        for(int i = 0; i < nos.size(); i++) {
            
            int quantFemea = nos.get(i).getAnimal().getQuantFemea();
            int quantMacho = nos.get(i).getAnimal().getQuantMacho();
            int quantTotal = quantFemea + quantMacho;
            if (quantFemea == 0 || quantMacho == 0){
                animaisExtintos.add(nos.get(i).getAnimal());
            } else if (quantFemea > 0 && quantMacho > 0 && quantTotal < 10) {
                animaisRiscoExtincao.add(nos.get(i).getAnimal());
            }
            todos += nos.get(i).getAnimal().toString()+"\n";
        }
        
        for(int i = 0; i < animaisExtintos.size(); i++){
            extintos += animaisExtintos.get(i).toString()+"\n";
        }
        
        for(int i = 0; i < animaisRiscoExtincao.size(); i++){
            riscoExtincao += animaisRiscoExtincao.get(i).toString()+"\n";
        }
        
        listaDeAnimais.setText(todos);
        listaDeAnimaisExtincao.setText(extintos+"\n"+riscoExtincao);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
                 
    }
    
}
