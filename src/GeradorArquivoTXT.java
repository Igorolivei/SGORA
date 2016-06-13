import java.util.ArrayList;
import java.io.IOException;

public interface GeradorArquivoTXT<Object> {

	public void escrever(Object o) throws IOException;
	public ArrayList<Animal> lerAnimais();
}
