import java.util.List;
import java.util.ArrayList;

public class Filme {
	
	private String titulo;
	private String duracao;
	private List<Sessao> listaSessoesFilme;
	private List<Ator> listaElencoFilme;
	private List<Genero> listaGenerosFilme;
	
	//Construtores
	public Filme() {
		this.listaSessoesFilme = new ArrayList<Sessao>();
		this.listaElencoFilme = new ArrayList<Ator>();
		this.listaGenerosFilme = new ArrayList<Genero>();
	}
	
	public Filme(String titulo, String duracao) {
		this.titulo = titulo;
		this.duracao = duracao;
		this.listaSessoesFilme = new ArrayList<Sessao>();
		this.listaElencoFilme = new ArrayList<Ator>();
		this.listaGenerosFilme = new ArrayList<Genero>();
	}
	
	
	
	public Filme(String titulo, String duracao, List<Sessao> listaSessoes, List<Ator> listaElenco,
			List<Genero> listaGeneros) {
		super();
		this.titulo = titulo;
		this.duracao = duracao;
		this.listaSessoesFilme = new ArrayList<Sessao>();
		this.listaElencoFilme = new ArrayList<Ator>();
		this.listaGenerosFilme = new ArrayList<Genero>();
	}

	//Gets e Sets

	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getDuracao() {
		return duracao;
	}



	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}



	public List<Sessao> getListaSessoes() {
		return listaSessoesFilme;
	}



	public void setListaSessoes(List<Sessao> listaSessoes) {
		this.listaSessoesFilme = listaSessoes;
	}



	public List<Ator> getListaElenco() {
		return listaElencoFilme;
	}



	public void setListaElenco(List<Ator> listaElenco) {
		this.listaElencoFilme = listaElenco;
	}



	public List<Genero> getListaGeneros() {
		return listaGenerosFilme;
	}



	public void setListaGeneros(List<Genero> listaGeneros) {
		this.listaGenerosFilme = listaGeneros;
	}


	//toString
	@Override
	public String toString() {
		return "Filme [titulo=" + titulo + ", duracao=" + duracao + ", listaSessoes=" + listaSessoesFilme + ", listaElenco="
				+ listaElencoFilme + ", listaGeneros=" + listaGenerosFilme + "]";
	}
	
	//Metodos
	
	public void listarSessoes() {
		
		System.out.println("Sessoes que contem este filme: ");
		//Testando se a lista está vazia;
		if (listaSessoesFilme.size() <= 0) {
			System.out.println("Não há sessões cadastradas para este filme!");
		} else {
		for (Sessao sessaoFilme : listaSessoesFilme) {
			System.out.println("-> " + sessaoFilme.toString());
		}
		}
		
	}
	
	public void listarAtores() {
		
		System.out.println("Elenco do filme: ");
		if (listaElencoFilme.size() <= 0) {
			System.out.println("Não há atores cadastrados para este filme!");
		} else {
		
		for (Ator atorFilme : listaElencoFilme) {
			System.out.println("-> " + atorFilme.getNome());
		}
		}
		
	}
	
	public void listarGeneros() {
		System.out.println("Generos do filme: ");
		if (listaGenerosFilme.size() <= 0) {
			System.out.println("Não há generos cadastrados para este filme!");
		} else {
		for (Genero generoFilme : listaGenerosFilme) {
			System.out.println("-> " + generoFilme.getDescricao());
		}
		}
		
	}
	
	public void addGenero(Genero generoNovo) throws GeneroRepetidoException{
		for (Genero generoExistente : listaGenerosFilme) {
			if (generoNovo.getDescricao().equals(generoExistente.getDescricao())) {
				throw new GeneroRepetidoException("Genero já cadastrado neste filme!");
			}
		}
		this.listaGenerosFilme.add(generoNovo);
		System.out.println("Genero adicionado ao filme com sucesso!");
	}
	
	public void addAtor(Ator atorNovo) throws AtorJaCadastradoException{
		for (Ator atorExistente : listaElencoFilme) {
			if (atorNovo.getNome().equals(atorExistente.getNome())) {
				throw new AtorJaCadastradoException(
				"Ator já cadastrado neste filme!");
			}
			
			
		}
		
		this.listaElencoFilme.add(atorNovo);
		System.out.println("Ator cadastrado com sucesso!");
		
	}
	
	public void addSessao(Sessao sessaoNova) throws SessaoRepetidaException{
		
		for (Sessao sessaoExistente : listaSessoesFilme) {
			if (sessaoNova.getData_sessao().equals(sessaoExistente.getData_sessao())
					&& sessaoNova.getHor_sessao().equals(sessaoExistente.getHor_sessao())) {
				
				throw new SessaoRepetidaException(
						" Sessao já cadastrada para este filme.");
				
			}
		}
	
		this.listaSessoesFilme.add(sessaoNova);	
		System.out.println("Sessao cadastrada com sucesso!");
	}
	
	
	
}
