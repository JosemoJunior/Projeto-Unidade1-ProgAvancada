
public class Ator {
	
	private String nome;
	
	//Construtores
	
	public Ator() {}

	public Ator(String nome) {
		this.nome = nome;
	}

	//Gets e Sets
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	//toString
	@Override
	public String toString() {
		return "Ator [nome=" + nome + "]";
	}

}
