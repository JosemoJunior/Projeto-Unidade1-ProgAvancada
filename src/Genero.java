
public class Genero {
	
	private String descricao;
	
	//Construtores
	
	public Genero() {}

	public Genero(String descricao) {
		this.descricao = descricao;
	}
	
	//Gets e Sets
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	//toString

	@Override
	public String toString() {
		return "Genero [descricao=" + descricao + "]";
	}

}
