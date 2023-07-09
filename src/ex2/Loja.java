package ex2;

import java.util.List;

public class Loja {

	private String nome;
	private String cnpj;
	private List<Livro> livros;
	private List<Videogames> videogames;

	Loja (){}

	
	public Loja(String nome, String cnpj, List<Livro> livros, List<Videogames> videogames) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videogames = videogames;
	}




	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public List<Videogames> getVideogames() {
		return videogames;
	}

	public void setVideogames(List<Videogames> videogames) {
		this.videogames = videogames;
	}
	
	void meusLivros() {
		System.out.println("------------------------------------------------------------------------");

		if (livros.isEmpty()) {
			System.out.println("A loja não tem livros no seu estoque.");
		}else {
			System.out.println("A loja Americanas possui esses estes livros para a venda:");
		}
		for (int i =0; i<livros.size(); i++) {
			System.out.println(livros.get(i));
		}
		
		System.out.println("------------------------------------------------------------------------");

	}
	void meusLivros(String nome, double preco,  int qtd, String autor, String tema, int qtdPag){
		Livro livro = new Livro ( nome, preco, qtd, autor, tema, qtdPag);
		livros.add(livro);
	}
	
	void meusVideogames(){
		
		if (videogames.isEmpty()) {
			System.out.println("A loja não tem livros no seu estoque.");
		}else {
			System.out.println("A loja Americanas possui esses estes video-games para a venda:");
		}
		
		for (int i = 0; i<videogames.size(); i++) {
			System.out.println(videogames.get(i));
		}
		
		System.out.println("------------------------------------------------------------------------");
	}
	
	void meusVideogames(String nome,  double preco, int qtd, String marca, String modelo, boolean usado){
		Videogames videogame = new Videogames(nome,preco, qtd, marca, modelo, usado);
		videogames.add(videogame);
	}
	
	double calculaPatrimonio(){
		double precoslivro = 0.0;
		double precosvideo = 0.0;
		double qtdvi = 0.0;
		double qtdli = 0.0;
		double subtotallivros= 0.0;
		double totallivros= 0.0;
		double subtotalvideo= 0.0;
		double totalvideo = 0.0;
		double patrimonio = 0.0;
		for (Videogames videogames : videogames ) {
			precosvideo = videogames.getPreco();
			qtdvi = videogames.getQtd();
			subtotalvideo = precosvideo*qtdvi;
			totalvideo+=subtotalvideo;
		}
		for (Livro livros : livros) {
			precoslivro = livros.getPreco();
			qtdli = livros.getQtd();
			subtotallivros=precoslivro*qtdli;
			totallivros+=subtotallivros;
		}
		patrimonio = totalvideo + totallivros;
		System.out.println("O patrimonio da loja: americana é de "+patrimonio);
		return patrimonio;
	}
}
