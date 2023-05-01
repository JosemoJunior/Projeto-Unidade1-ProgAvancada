import java.util.List;
import java.util.ArrayList;

public class Sala {
	
	private int numSala;
	private int capacidade;
	private List<Sessao> listaSessoes;
	
	//Construtores
	
	public Sala() {
		//ao chamar o construtor, ele irá criar um ArrayList<Sessao>()
		this.listaSessoes = new ArrayList<Sessao>();
	}
	
		
	public Sala(int numSala, int capacidade) {
		super();
		this.numSala = numSala;
		this.capacidade = capacidade;
		this.listaSessoes = new ArrayList<Sessao>();
	}

	//Gets e Sets
	//Número da Sala
	
	public int getNumSala() {
		return numSala;
	}


	public void setNumSala(int numSala) {
		this.numSala = numSala;
	}

	//Capacidade da Sala
	public int getCapacidade() {
		return capacidade;
	}


	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	//Lista de Sessões
	public List<Sessao> getListaSessoes() {
		return listaSessoes;
	}


	public void setListaSessoes(List<Sessao> listaSessoes) {
		this.listaSessoes = listaSessoes;
	}
	
	//toString
	
	@Override
	public String toString() {
		return "Sala [numSala=" + numSala + ", capacidade=" + capacidade + ", listaSessoes=" + listaSessoes + "]";
	}

	
	// Métodos:
	
	//Cadastrar as sessões na sala:



	public void cadastrarSessao(Sessao sessao) throws SessaoRepetidaException{
		
		
		for (Sessao sessaoNova: listaSessoes) {
			if (sessao.getData_sessao().equals(sessaoNova.getData_sessao())
					&& sessao.getHor_sessao().equals(sessaoNova.getHor_sessao())) {
				
				throw new SessaoRepetidaException(
						"Sessão já cadastrada para esta sala.");
				
			}
		}
		
		
		this.listaSessoes.add(sessao);	
		System.out.println("A Sessão foi cadastrada na sala com sucesso!");
		
	}
	
	
	//Alterar as sessões na sala:
	public void alterarSessao(int posicao, Sessao sessao) {
		
		//testando a posição
		if (posicao < 0 || posicao >= listaSessoes.size()) {
			throw new IndexOutOfBoundsException("Posição inexistente! Verifique o indice");
		} 
		
		else {
			this.listaSessoes.set(posicao, sessao);
		}
		
	}
	
	//Remover as sessões na sala:
	public void removerSessao(int posicao) {
		
		//testando a posição
		if (posicao < 0 || posicao >= listaSessoes.size()) {
			throw new IndexOutOfBoundsException("Posição inexistente!, verifique o indice");
		} 
		
		else {
			this.listaSessoes.remove(posicao);
		}
		
	}
	
		
	//Listar as sessões cadastradas na sala:
	public void listarSessoes() {
		for (Sessao sessoesCadastradas : listaSessoes) {
			System.out.println(sessoesCadastradas.toString());
		}
	}
	
	
	

}
