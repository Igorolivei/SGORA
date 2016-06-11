
public abstract class Animal {
	
	private String codigo;
	private String nome;
	private String especie;
	private String alimento;
	private int tempoAlimentacao;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public String getAlimento() {
		return alimento;
	}
	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	public int getTempoAlimentacao() {
		return tempoAlimentacao;
	}
	public void setTempoAlimentacao(int tempoAlimentacao) {
		this.tempoAlimentacao = tempoAlimentacao;
	}

}
