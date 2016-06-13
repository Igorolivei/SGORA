/**
 * Classe que guarda informações da alimentação de um animal
 */
import java.util.Date;

public class Alimentacao {
	
	/**
	 * Data em que foi colocado o alimento
	 */
	private Date dataAlimentacao;
	/**
	 * Animal que foi alimentado
	 */
	private Animal animal;
	
	/**
	 * Retorna data em que o animal foi alimentado
	 * @return Date dataAlimentacao
	 */
	public Date getDataAlimentacao() {
		return dataAlimentacao;
	}
	/**
	 * Define data em que o animal foi alimentado
	 * @param dataAlimentacao Date
	 */
	public void setDataAlimentacao(Date dataAlimentacao) {
		this.dataAlimentacao = dataAlimentacao;
	}
	
	/**
	 * Retorna o animal que foi alimentado
	 * @return Animal animal
	 */
	public Animal getAnimal() {
		return animal;
	}
	/**
	 * Define o animal que foi alimentado
	 * @param animal Animal
	 */
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}	
	
}
