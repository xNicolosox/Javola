package poo;

public class Carro {
	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float km;
	private boolean ligado;
	private int combus;
	private int velocidade;
	private double preco;
	
	public Carro () {}
	
	public Carro(String marca, String modelo, String placa, String cor, float km,int combus, int velocidade, double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.km = km;
		this.ligado = false;
		this.combus = combus;
		this.velocidade = velocidade;
		this.preco = preco;
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


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public float getKm() {
		return km;
	}


	public void setKm(float km) {
		this.km = km;
	}


	public boolean isLigado() {
		return ligado;
	}


	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}


	public int getCombus() {
		return combus;
	}


	public void setCombus(int combus) {
		this.combus = combus;
	}


	public int getVelocidade() {
		return velocidade;
	}


	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void ligar() {
		if (!ligado) {
			System.out.println("Ligando o carro...");
			ligado = true;
			} else {
				System.out.println("Carro ja ligado.");
		}}
	
	public void desligar() {
		if (velocidade>0) {
			System.out.println("Não pode parar o carro enquanto anda.");
		} else if( ligado == true) {
			System.out.println("Desligando o  carro...");
			ligado=false;
		} else {
			System.out.println("Carro ja desligado.");
		}
	}
	public void acelerar () {
		if (ligado == true) {
			setVelocidade(this.velocidade+20);
		} else {
			System.out.println("O carro está desligado e não pode acelerar");
		}
		
	}
	
	public void frear () {
		if (velocidade <= 0) {
			System.out.println("O carro ja esta parado");
		} else {
			setVelocidade(this.velocidade-20);
		}
	}
	
	public void abastecer(int combustivel){
		combus+=combustivel;
		if (combus<=60) {
			System.out.println("Abastecendo.");
		}else {
			System.out.println("Capacidade maxima do tanque atingida");
		}
	}
	
	public void pintar(String cores) {
		cor=cores;
		System.out.println("A cor do carro é " + cor + ".");
	}
	@Override
	public String toString() {
		return "Velocidade: " + getVelocidade() + " km/h e o combustivel:" + getCombus() ;
	}
}
