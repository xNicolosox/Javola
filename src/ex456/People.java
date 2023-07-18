package ex456;

public class People {
	private String nome;
	private int idade;
	public People(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + ", idade: " + idade;
	}
	

	}

