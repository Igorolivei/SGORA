/**
 * Define um animal
 * @author Igor
 *
 */
public abstract class Animal {
	
	/**
	 * Código da tag do animal
	 */
	private String codigo;
	/**
	 * Nome do animal
	 */
	private String nome;
	/** 
	 * Espécie do animal
	 */
	private String especie;
	/**
	 * Sexo do animal
	 */
	private char sexo;
	/**
	 * Alimento do animal
	 */
	private String alimento;
	/**
	 * Tempo em que o animal deve ser alimentado
	 */
	private int tempoAlimentacao;
	
	/**
	 * Retorna o código do animal
	 * @return String codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * Define o código do animal
	 * @param codigo String
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	/**
	 * Retorna nome do animal
	 * @return String nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * Define nome do animal
	 * @param nome String
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/** 
	 * Retorna espécie do animal
	 * @return String especie
	 */
	public String getEspecie() {
		return especie;
	}
	/**
	 * Define espécie do animal
	 * @param especie String
	 */
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	/**
	 * Retorna alimento do animal
	 * @return String alimento
	 */
	public String getAlimento() {
		return alimento;
	}
	/**
	 * Define alimento do animal
	 * @param alimento String
	 */
	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	/**
	 * Retorna quantidade de dias em que o animal deve ser alimentado
	 * @return int tempoAlimentacao
	 */
	public int getTempoAlimentacao() {
		return tempoAlimentacao;
	}
	/**
	 * Define quantidade de dias em que o animal deve ser alimentado
	 * @param tempoAlimentacao int
	 */
	public void setTempoAlimentacao(int tempoAlimentacao) {
		this.tempoAlimentacao = tempoAlimentacao;
	}
	
	/**
	 * Retorna o sexo do animal
	 * @return char sexo
	 */
	public char getSexo() {
		return sexo;
	}
	/**
	 * Define o sexo do animal
	 * @param sexo char
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

}
