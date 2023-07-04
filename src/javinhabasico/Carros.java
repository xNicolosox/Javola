package javinhabasico;

public class Carros {
	private String marca;
	private String modelo;
	private int ano;
	private boolean ligado;
	
	public Carros (String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.ligado = false;
	}
	
	public void ligar() {
		if (!ligado) {
			System.out.println("Ligando o carro...");
			ligado = true;
			} else {
				System.out.println("Carro ja ligado.");
		}
	}
	
	public void desligar() {
		if (ligado){
			System.out.println("Desligando o  carro...");
			ligado=false;
		} else {
			System.out.println("Carro ja desligado.");
		}
	}
	
	public void verInfo() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano: " + ano);
		System.out.println("Estado: " + (ligado ? "ligado" : "desligado"));
	}
}
