package atv2;

public class Cavalo extends Mamifero implements AnimalDomesticado {
	private String cor;
	private String nome;
	
	
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "nome do cavalo: " + nome + ", Cor: " + cor +", idade: "+ getIdade() + ", raça: "+ getRaça();
	}
	@Override
	public void levarVeterinario() {
		System.out.println("foi tratamento");
		
	}
	@Override
	public void alimentar() {
		System.out.println("alimatado");
	}
	
	
	
	
}
