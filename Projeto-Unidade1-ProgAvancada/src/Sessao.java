
public class Sessao {
	
	private Filme filme;
	private String data_sessao;
	private String hor_sessao;
	private double valor_inteira;
	private double valor_meia;
	private int	encerrada;
	
	//Construtores
	
	public Sessao() {}
	
	public Sessao(String data_sessao, String hor_sessao, double valor_inteira, double valor_meia) {
		super();
		this.data_sessao = data_sessao;
		this.hor_sessao = hor_sessao;
		this.valor_inteira = valor_inteira;
		this.valor_meia = valor_meia;
	}


	public Sessao(Filme filme, String data_sessao, String hor_sessao, double valor_inteira, double valor_meia,
			int encerrada) {
		super();
		this.filme = filme;
		this.data_sessao = data_sessao;
		this.hor_sessao = hor_sessao;
		this.valor_inteira = valor_inteira;
		this.valor_meia = valor_meia;
		this.encerrada = encerrada;
		
	}
	
	//Gets e Sets

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
		System.out.println("Filme Inserido na Sessao!");
	}

	public String getData_sessao() {
		return data_sessao;
	}

	public void setData_sessao(String data_sessao) {
		this.data_sessao = data_sessao;
	}

	public String getHor_sessao() {
		return hor_sessao;
	}

	public void setHor_sessao(String hor_sessao) {
		this.hor_sessao = hor_sessao;
	}

	public double getValor_inteira() {
		return valor_inteira;
	}

	public void setValor_inteira(double valor_inteira) {
		this.valor_inteira = valor_inteira;
	}

	public double getValor_meia() {
		return valor_meia;
	}

	public void setValor_meia(double valor_meia) {
		this.valor_meia = valor_meia;
	}

	public int getEncerrada() {
		return encerrada;
	}

	public void setEncerrada(int encerrada) {
		this.encerrada = encerrada;
	}

	
	//toString
	@Override
	public String toString() {
		return "Sessao [filme=" + filme.getTitulo() + ", data_sessao=" + data_sessao + ", hor_sessao=" + hor_sessao
				+ ", valor_inteira=" + valor_inteira + ", valor_meia=" + valor_meia + ", encerrada=" + encerrada + "]";
	}
	
	

}
