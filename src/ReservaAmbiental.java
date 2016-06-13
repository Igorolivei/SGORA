/**
 * Classe que guarda informa��es da Reserva Ambiental onde est� sendo utilizado o software
 */
import java.util.ArrayList;

public class ReservaAmbiental {
	/**
	 * Nome da reserva
	 */
	private String nome;
	/**
	 * Regi�o onde fica a reserva
	 */
	private String regiao;
	/**
	 * Extens�o da reserva (em km�)
	 */
	private double extensao;
	/**
	 * Lista de animais contidos na reserva
	 */
	private ArrayList<Animal> listaAnimais;
	
	/**
	 * Retorna o nome da reserva
	 * @return String nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * Define o nome da reserva
	 * @param nome String
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Retorna a regi�o da reserva
	 * @return String regiao
	 */
	public String getRegiao() {
		return regiao;
	}
	/**
	 * Define a regi�o da reserva 
	 * @param regiao String
	 */
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	
	/**
	 * Retorna a extens�o da reserva
	 * @return double extensao
	 */
	public double getExtensao() {
		return extensao;
	}
	/**
	 * Define a extens�o da reserva
	 * @param extensao double
	 */
	public void setExtensao(double extensao) {
		this.extensao = extensao;
	}
	
	/**
	 * Retorna a lista de animais da reserva
	 * @return ArrayList listaAnimais
	 */
	public ArrayList<Animal> getListaAnimais() {
		return listaAnimais;
	}
	/**
	 * Retorna a lista de animais da reserva
	 * @param listaAnimais ArrayList
	 */
	public void setListaAnimais(ArrayList<Animal> listaAnimais) {
		this.listaAnimais = listaAnimais;
	}
}
