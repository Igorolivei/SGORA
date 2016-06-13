import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Date;

public class HistoricoAlimentacao implements GeradorArquivoTXT<Alimentacao> {

	@Override
	public void escrever(Alimentacao a) throws IOException {
	 
	    FileWriter TXT = new FileWriter("historicoalimentacao.txt");
	    PrintWriter gravarTXT = new PrintWriter(TXT);
	 
	    gravarTXT.printf(a.getDataAlimentacao().toString()+"|"+a.getAnimal().getCodigo()+"|"+a.getAnimal().getTempoAlimentacao()+"|"+a.getAnimal().getAlimento());
	    
	    TXT.close();
	}

	@Override
	public ArrayList<Animal> lerAnimais() {
		ArrayList<Animal> animais = new ArrayList<Animal>();

	    try {
	    	FileReader TXT = new FileReader("historicoalimentacao.txt");
	        BufferedReader lerTXT = new BufferedReader(TXT);
	   
	        String linha = lerTXT.readLine(); 
	        
	        Date data = (Date) lerTXT.readLine().split("|")[0];
	        String codAnimal = lerTXT.readLine().split("|")[1];
	        String tempoAlimentacao = lerTXT.readLine().split("|")[2];
	        
	        if ((data.toDate()) >= tempoAlimentacao){
	        	
	        }
	        
	        while (linha != null) {	   
	          linha = lerTXT.readLine();
	          
	          
	        }
	   
	        TXT.close();
	      } catch (IOException e) {
	          System.err.printf("Erro na abertura do arquivo: %s.\n",
	            e.getMessage());
	      }
		
		return animais;
	}

}
