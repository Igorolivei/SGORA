import java.util.ArrayList;

public class ReservaAmbiental {
	private String nome;
	private String regiao;
	private double extensao;
	private ArrayList<Animal> listaAnimais;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	
	public double getExtensao() {
		return extensao;
	}
	public void setExtensao(double extensao) {
		this.extensao = extensao;
	}
	
	public ArrayList<Animal> getListaAnimais() {
		return listaAnimais;
	}
	public void setListaAnimais(ArrayList<Animal> listaAnimais) {
		this.listaAnimais = listaAnimais;
	}
}
