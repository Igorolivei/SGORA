package sgora;

/**
 * Define um animal
 * @author Igor
 *
 */
public abstract class Animal {
	
	/**
	 * C�digo da tag do animal
	 */
	private int codigo;
	/**
	 * Nome do animal
	 */
	private String nome;
	/** 
	 * Esp�cie do animal
	 */
	private String especie;
	/**
	 * Sexo do animal
	 */
	private String sexo;
	/**
	 * Alimento do animal
	 */
	private String alimento;
	/**
	 * Tempo em que o animal deve ser alimentado
	 */
	private int tempoAlimentacao;

    public Animal(int codigo, String nome, String especie, String sexo) {
        this.codigo = codigo;
        this.nome = nome;
        this.especie = especie;
        this.sexo = sexo;
    }
	
        
        
	/**
	 * Retorna o c�digo do animal
	 * @return String codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * Define o c�digo do animal
	 * @param codigo String
	 */
	public void setCodigo(int codigo) {
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
	 * Retorna esp�cie do animal
	 * @return String especie
	 */
	public String getEspecie() {
		return especie;
	}
	/**
	 * Define esp�cie do animal
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
	public String getSexo() {
		return sexo;
	}
	/**
	 * Define o sexo do animal
	 * @param sexo char
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
        
        @Override
        public String toString() {
        return this.getCodigo()+
               "\n" + this.getNome() +
               "\n" + this.getEspecie() +
               "\n" + this.getSexo();
        }

}
