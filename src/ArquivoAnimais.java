import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;

public class ArquivoAnimais implements GeradorArquivoTXT<Animal> {

	@Override
	public void escrever(Animal a) throws IOException {
		FileWriter TXT = new FileWriter("historicoalimentacao.txt");
	    PrintWriter gravarTXT = new PrintWriter(TXT);
	 
	    gravarTXT.printf(a.getCodigo()+"|"+a.getClass().toString()+"|"+a.getEspecie()+"|"+a.getNome()+"|"+a.getAlimento()+"|"+a.getTempoAlimentacao());
	    
	    TXT.close();		
	}

	@Override
	public ArrayList<Animal> lerAnimais() {
		ArrayList<Animal> a = new ArrayList<Animal>();
		
		try {
	    	FileReader TXT = new FileReader("historicoalimentacao.txt");
	        BufferedReader lerTXT = new BufferedReader(TXT);
	   
	        String linha = lerTXT.readLine(); 
	        
	        String codAnimal = lerTXT.readLine().split("|")[1];
	        String tempoAlimentacao = lerTXT.readLine().split("|")[2];
	        	        
	        while (linha != null) {	   
	          linha = lerTXT.readLine();
	          
	          
	        }
	   
	        TXT.close();
	      } catch (IOException e) {
	          System.err.printf("Erro na abertura do arquivo: %s.\n",
	            e.getMessage());
	      }
		
		return a;
	}

}
