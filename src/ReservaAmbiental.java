/**
 * Classe que guarda informações da Reserva Ambiental onde está sendo utilizado o software
 */
import java.util.ArrayList;

public class ReservaAmbiental {
	/**
	 * Nome da reserva
	 */
	private String nome;
	/**
	 * Região onde fica a reserva
	 */
	private String regiao;
	/**
	 * Extensão da reserva (em km²)
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
	 * Retorna a região da reserva
	 * @return String regiao
	 */
	public String getRegiao() {
		return regiao;
	}
	/**
	 * Define a região da reserva 
	 * @param regiao String
	 */
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	
	/**
	 * Retorna a extensão da reserva
	 * @return double extensao
	 */
	public double getExtensao() {
		return extensao;
	}
	/**
	 * Define a extensão da reserva
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
