import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Principal {

	public static void main(String[] args) {	
		
		
		//Instanciando os objetos
		Ator ator1 = new Ator("Keano Reeves");
		Ator ator2 = new Ator("Laurence Fishburne");
		Ator ator3 = new Ator("Carrie-Anne Moss");
		Ator ator4 = new Ator("Keira Kightley");
		Ator ator5 = new Ator("Johnny Depp"); 
		
		Genero genero1 = new Genero("Ficção Científica");
		Genero genero2 = new Genero("Ação");
		Genero genero3 = new Genero("Aventura");
		Genero genero4 = new Genero("Comédia");
		
		//Filme filme1 = new Filme("Matrix", "136");
		//Filme filme2 = new Filme("Piratas do Caribe: No Fim do Mundo", "168");
		
		Filme filme1 = new Filme();
		filme1.setTitulo("Matrix");
		filme1.setDuracao("136");
		
		Filme filme2 = new Filme("Piratas do Caribe: No Fim do Mundo", "168");
		
		//Filme filme2 = new Filme();
		//filme2.setTitulo("Piratas do Caribe: No Fim do Mundo");
		//filme2.setDuracao("168");
		
		Sessao sessao1 = new Sessao(filme2,"28/04/2023" ,"14:00", 30.00, 15.00, 0);
		Sessao sessao2 = new Sessao(filme2,"28/04/2023" ,"17:30", 30.00, 15.00, 0);
		Sessao sessao3 = new Sessao(filme1,"28/04/2023" ,"19:00", 30.00, 15.00, 0);
		Sessao sessao4 = new Sessao(filme1,"28/04/2023" ,"22:00", 30.00, 15.00, 0);
		
		Sala sala1 = new Sala(01,70);
		
		// Adicionando os gereros aos filmes		
		try {

		filme1.addGenero(genero1);
		filme1.addGenero(genero2);
		
		filme2.addGenero(genero3);
		filme2.addGenero(genero4);
		
				
		} catch (GeneroRepetidoException e) {
			
			System.out.println("Erro: " + e.getMessage());
			
		} 
		
		// Adicionando os gereros aos filmes		
		try {
			
		filme1.addAtor(ator1);
		filme1.addAtor(ator2);
		filme1.addAtor(ator3);
		
		filme2.addAtor(ator4);
		filme2.addAtor(ator5);
		
				
		} catch (AtorJaCadastradoException e) {
			
			System.out.println("Erro: " + e.getMessage());
			
		} 
				
		// Relacionando as sessoes aos filmes (ADD a Sessao ao Filme e o Filme às Sessoes)
		
		try {
		
		filme1.addSessao(sessao3);
		sessao3.setFilme(filme1);
		
		filme1.addSessao(sessao4);
		//sessao4.setFilme(filme1);
		
		
		filme2.addSessao(sessao1);
		//sessao1.setFilme(filme2);
		
		filme2.addSessao(sessao2);
		//sessao2.setFilme(filme2);
		
				
		} catch (SessaoRepetidaException e) {
			
			System.out.println("Erro: " + e.getMessage());
			
		} 
		
		
		//Adiconando as Sessões à Sala
		try {
			
		sala1.cadastrarSessao(sessao1);
		sala1.cadastrarSessao(sessao2);
		sala1.cadastrarSessao(sessao3);
		sala1.cadastrarSessao(sessao4);
		
				
		} catch (SessaoRepetidaException e) {
			
			System.out.println("Erro: " + e.getMessage());
			
		} 
		
		//Listando as Sessões cadastradas na sala
		
		sala1.listarSessoes();
		System.out.println("\n");
		
		
		//Alterando a ordem da Sessão
		sala1.alterarSessao(0, sessao3);
		sala1.listarSessoes();
		System.out.println("\n");
		
		//Removendo a Sessao:
		sala1.removerSessao(0);
		sala1.listarSessoes();
		System.out.println("\n");
		
		
		//Listando os filmes com duraçao maior de 2hrs e do genero comédia
		
		filmesMaioresDuasHoras(sala1);
		System.out.println("\n");
		
		filmesComedia(sala1);
		System.out.println("\n");
		
		//Outros testes
		//Filme1
		filme1.listarAtores();
		System.out.println("\n");
		
		filme1.listarGeneros();
		System.out.println("\n");
		
		filme1.listarSessoes();
		System.out.println("\n");
		
		//Filme2
		
		filme2.listarAtores();
		System.out.println("\n");
		
		filme2.listarGeneros();
		System.out.println("\n");
		
		filme2.listarSessoes();
		System.out.println("\n");
		

	
	}
	public static void filmesMaioresDuasHoras (Sala sala) {
		
		System.out.println("Lista dos filmes com mais de duas horas:");
		
		List<Sessao> sessoes = sala.getListaSessoes();
		Set<Filme> filmesLongos = new HashSet<Filme>();
		
		for (int i=0;i<sessoes.size();i++) {
			
			if (Integer.parseInt(sessoes.get(i).getFilme().getDuracao()) > 120) {
				filmesLongos.add(sessoes.get(i).getFilme());
			}
			
		}
		
		for (Filme filme : filmesLongos) {
			System.out.println("-> " + filme.getTitulo());
		}
		
	}
	
	public static void filmesComedia (Sala sala) {
		
		   System.out.println("Lista dos filmes com Genero Comédia:");

	        List<Sessao> sessoes = sala.getListaSessoes();
	        Set<Filme> filmesGeneroComedia = new HashSet<Filme>();

	        for (int i=0;i<sessoes.size();i++) {

	            for (Genero genero : sessoes.get(i).getFilme().getListaGeneros()) {

	                if (genero.getDescricao().equals("Comédia")) {
	                    filmesGeneroComedia.add(sessoes.get(i).getFilme());
	                }
	            }
	        }

	        for (Filme filme : filmesGeneroComedia) {
	            System.out.println("-> " + filme.getTitulo());
	        }

		
	}
	

}

