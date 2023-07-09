package ex2;

public class Livro extends Produto implements Calcular{
	private String autor;
	private String tema;
	private int qtdPag;
	private double imposto;
	
	public Livro(){}
	

	public Livro(String nome, double preco,  int qtd, String autor, String tema, int qtdPag) {
		super();
		this.autor = autor;
		this.tema = tema;
		this.qtdPag = qtdPag;
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}


	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getQtdPag() {
		return qtdPag;
	}

	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}


	@Override
	public double calcularimposto() {
		
		if (tema == "educativo") {
			System.out.println("O livro educativo "+ nome + " não tem imposto");
			return imposto;
		}else {
			imposto = preco *0.10;
			System.out.println("O imposto sobre o livro " + nome + " é de " + imposto + " R$." );
			return imposto;
		}
		
	}


	@Override
	public String toString() {
		return "Título: " + nome + ", preco: " + preco + ", quantidade: " + qtd + " em estoque.";
	}
	



	
}
