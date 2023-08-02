package aula2prog3;

public class ObservadorConcreto implements Observer{

	@Override
	public void update() {
		System.out.println("O assinante recebeu as atualizações.");
	}
}
