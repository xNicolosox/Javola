package aula2prog3;

import java.util.ArrayList;
import java.util.List;

public class Sujeito {
	private List<Observer> observadores = new ArrayList<>();

    public void adicionarAssinantes(Observer observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observer observador) {
        observadores.remove(observador);
    }

    public void notificarAssinantes() {
        for (Observer observador : observadores) {
            observador.update();
        }
    }
}

