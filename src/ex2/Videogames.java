package ex2;

public class Videogames extends Produto implements Calcular{
	private String marca;
	private String modelo;
	private boolean usado;
	private double imposto;
	
	public Videogames(){}
	
	public Videogames (String nome,  double preco, int qtd, String marca, String modelo, boolean usado){
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.usado = usado;
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isUsado() {
		return usado;
	}

	public void setUsado(boolean usado) {
		this.usado = usado;
	}

	@Override
	public double calcularimposto() {
		if (usado == false) {
			imposto = 0.45*preco;
			System.out.println("O imposto sobre " + nome + " " + modelo + " é de " + imposto + "R$.");
			return imposto;
		} else if (usado == true){
			imposto = 0.25*preco;
			System.out.println("O imposto sobre " + nome+ " " + modelo +" usado é de " + imposto + "R$.");
			return imposto;
		}
		return imposto;
	}

	@Override
	public String toString() {
		return "Videogame: " + modelo + ", preço: " + preco + ",quantidade: " + qtd + " em estoque." + imposto;
	}
	
}
