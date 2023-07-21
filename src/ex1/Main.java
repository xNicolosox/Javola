package ex1;

public class Main {

	public static void main(String[] args) {
		Carro carro1 = new Carro ();
		carro1.ligar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.abastecer(30);
		carro1.pintar("amarelo");
		carro1.frear();
		carro1.frear();
		carro1.desligar();
		;
		System.out.println(carro1.toString());
	}

}
